import java.util.Scanner;
public class main {
    public static void main(String[] args) {
    Classes cao = new Classes();
    Scanner scanner = new Scanner(System.in);
            cao.name = scanner.nextLine();
            cao.surname = scanner.nextLine();
            cao.age = scanner.nextInt();
            cao.location = scanner.nextLine();
            cao.hobby = scanner.nextLine();
            cao.bday = scanner.nextLine();

            cao.nameShow();
            cao.SurnameShow();
            cao.AgeShow();
            cao.bdayShow();
            cao.LocationShow();
            cao.HobbyShow();
    }
}


