package StringMethods;

public class StringMethod {
   public static void main(String[] args) {
       String s0 = "Said Guliyev";
       System.out.println(s0.startsWith("S"));
       System.out.println(s0.endsWith("i"));
       String s1 = "Hello Said";
       String s2 = "Hello Mr Said";
       System.out.println(s1.regionMatches(7, s2, 0, 5));
       String s3 = "World The Best";
       System.out.println(s3.toLowerCase());
       System.out.println(s3.toUpperCase());
       String s4 = "Guitars";
       System.out.println(s4.substring(1, 4));
       String s5 = "Pianos";
       System.out.println(s5.replace("Pianos", "musical Instrument"));

       String s6 = "Programing";
       System.out.println(s6.indexOf("p", 0));
    }
}


