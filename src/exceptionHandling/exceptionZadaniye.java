package exceptionHandling;

public class exceptionZadaniye {
    public static void main(String[] args) {
                int x = 10;
                int y = 0;

                try {
                    if (y == 0) {
                        throw new ArithmeticException("Ошибка(деление на ноль)");
                    }

                    int deleniye = x / y;
                    System.out.println("Вывод: " + deleniye);

                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                } finally {
                    System.out.println("Ни в коем случии не дели на ноль");
                }


                try {
                    int[] array = {10,56,49,128,1024};
                    System.out.println(array[7]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("не внутри массива");
           }finally {
                    System.out.println("Не пиши того что нет");
                }

                
    }
}

