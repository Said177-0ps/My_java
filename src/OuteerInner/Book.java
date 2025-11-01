package OuteerInner;
import java.util.Scanner;
public class Book {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.showContent();
    }
}

class Library {
    Scanner sc = new Scanner(System.in);
   String book1 = sc.nextLine();
   String book2 = sc.nextLine();
   String book3 = sc.nextLine();

   void showContent(){
       Book book = new Book();
       book.showBooks();
   }

    class Book {
        void showBooks(){
            System.out.println("Это Книга Про: " + book1);
            System.out.println("This Book iS Interesting:" + book2);
            System.out.println("This book is Boring:" + book3);
        }
    }
}