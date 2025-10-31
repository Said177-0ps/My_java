package StringMethods;

import java.util.Scanner;

public class StringMethodHomework {
    public static void main(String[] args) {


        String ln = "Hi";
        System.out.println(ln.length());


        String uppLow = "Java The Best";
        System.out.println(uppLow.toUpperCase() + "!!");
        System.out.println(uppLow.toLowerCase());

        String trim = "   Hi,Said   ";
        System.out.println(trim.trim());

        String char1 = "My code";
        char[] letters = char1.toCharArray();
        System.out.println(letters[6]);// не получилось и не понел (Я здесь попыталься но не смог)


        String index = "Azerbaycan is Amazing";
        System.out.println(index.indexOf("i"));
        System.out.println(index.lastIndexOf("i"));

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = sc.nextLine();

        System.out.print("что поменять: ");
        String oldStr = sc.nextLine();

        System.out.print("на что: ");
        String newStr = sc.nextLine();

        String replaced = text.replace(oldStr, newStr);


        System.out.println("Результат: " + replaced);
          //substring не понел как сделать (само условие не понел)
        sc.close();

        String reg = "Java Programming";
        String match1 = "Program";


        boolean match = text.regionMatches(5, match1, 0, match1.length());

        System.out.println(match);

    }
}

