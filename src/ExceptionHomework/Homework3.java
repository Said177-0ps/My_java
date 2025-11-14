package ExceptionHomework;

public class Homework3 {
    public static void main(String[] args) {
      int[] array = {1,2,3,4,5,6};
      int a = 10;
      int b = 0;
        try {
            System.out.println(a / b);
            System.out.println(array[19]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Нет такого элемента");
        } catch (ArithmeticException e){
            System.out.println("Невохможно делить на ноль");
        } finally {
            System.out.println("Обработка завершена");
        }
    }
}
