

public class Calculator {
    public static void main(String[] args) {

        int a = 60;
        int b = 15;
        char op = '+';
        char ip = '-';
        char up = '*';
        char yp = '/';

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
        }
        switch (ip) {
            case '-':
                System.out.println(a - b);
                break;
        }
        switch (up) {
            case '*':
                System.out.println(a * b);
                break;
        }
        switch (yp) {
            case '/':
                if (b != 0) {
                    System.out.println(a / b);
                };
                break;
        }
    }
}
