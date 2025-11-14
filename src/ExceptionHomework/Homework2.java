package ExceptionHomework;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        int[] massiv = {10, 20, 30, 40};
        Scanner sc = new Scanner(System.in);

        try {
            int newIndex = sc.nextInt();
            System.out.println(massiv[newIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Такого индекса не существует");
        }
    }
}
