public class Homeowrk9 {
   public static void main(String[] args) {
       for (int i = 1; i < 11; i++) {
           System.out.println(i);
       }
       int first = 256;
       int second = 128;

       System.out.println("Add:" + (first + second) );
       System.out.println("minus:" + (first - second) );
       System.out.println("Divide:" + (first / second) );
       System.out.println("multiplication:" + (first * second) );

       for (int i = 1; i < 6; i++) {
           if (6 == i) {
               break;
           }
           System.out.println(i);
       }

       for (int i = 1; i < 6; i++) {
           if (3 == i) {
               continue;
           }
           System.out.println(i);
       }
    }
}

