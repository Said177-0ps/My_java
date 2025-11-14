package ExceptionHomework;

public class Homework1 {
    public static void main(String[] args) {
        try {
            int a = 30;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e){
            System.out.println("нельзя Делить На Ноль");
        } finally {
            System.out.println("Работа Завершена");
        }



    }
}
