package Casting;

public class CastingZadaniye {
    public static void main(String[] args) {
        int i = 40;
        byte b = (byte)i;
        System.out.println(b);

        double d = 30.0;
        int i1 = (int) d;
        System.out.println(i1);

        short s = 20;
        byte b1 = (byte)s;
        System.out.println(b1);

        long l = 300;
        int i2 = (int)l;
        System.out.println(i2);
           //сейчас неявные
        short s1 = 32;
        long l1 = s1;
        System.out.println(l1);

        byte b3 = 50;
        int i4 = b3;
        System.out.println(i4);

        byte b4 = 45;
        long l3 = b4;
        System.out.println(l3);

        short s3 = 25;
        int i5 = s3;
        System.out.println(i5);
    }
}
