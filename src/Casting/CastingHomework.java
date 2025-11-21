package Casting;

public class CastingHomework {
    public static void main(String[] args) {
        //1 homework
        int i = 25;
        double d = i;
        System.out.println(d);//Ведь оно неявное, и некторые неявные автоматически

        //2 homework
        double x = 7.9;
        int y = (int) x;
        System.out.println(y);//Ведь он переобразовалься с double to int

        //3 homework
        byte a = 90;
        byte b = 60;
        int c = a + b;
        System.out.println(c);//байт вмещает 127 а инт гораздо больше

        //4 homework
        short s = 1000;
        byte b1 = (byte) s;
        System.out.println(b1);// она не может вмещать больше 128 иза этого показывает в двухзначным коде

        //5 homework
        //?

        //6 homework
        int n = 66;
        char ch = (char)n;
        System.out.println(ch);

        int n1 = 70;
        char ch1 = (char)n1;
        System.out.println(ch1);

        int n2 = 71;
        char ch2 = (char)n2;
        System.out.println(ch2);

        int n3 = 72;
        char ch3 = (char)n3;
        System.out.println(ch3);

        int n4 = 97;
        char ch4 = (char)n4;
        System.out.println(ch4);

        int n5 = 97;
        char ch5 = (char)n5;
        System.out.println(ch5);

        // 7 homework
         String s1 = "456";
         int i2 = s1;//мне кажеться нельзя преобразовать стринг в инт

        //8 homework
        int i3 = 5;
        int i4 = 2;
        double d1 = (double)i3 / i4;
        System.out.println(d1);

        //9 homework
        long big = 123456;
        short small = (short) big;
        System.out.println(small);// он макс может принять 32767 а мы же написали 123,456 (он показывает в виде двухзначного кода)
        // 10 homework
    }
}
