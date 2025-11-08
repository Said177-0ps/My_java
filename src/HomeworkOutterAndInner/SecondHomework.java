package HomeworkOutterAndInner;

public class SecondHomework {
}

class Calculator{
    public static class MathUtils {
        public static int sum(int a, int b) {
            return a + b;
        }

        public static int multiply(int a, int b) {
            return a * b;
        }
    }
    public static void main(String[] args) {
        System.out.println(MathUtils.sum(1653, 755));
        System.out.println(MathUtils.multiply(43, 56));
    }
}
