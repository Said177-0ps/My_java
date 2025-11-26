package Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ZadanieSet {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(10);
        numbers.add(7);
        System.out.println("Куда делась повторка?"+ numbers);

        //2 zadanie

        LinkedHashSet<String> coding = new LinkedHashSet<>();
        coding.add("Java");
        coding.add("Python");
        coding.add("C++");
        coding.add("Java");
        System.out.println("Какой порядок вывода?" + coding);

        //3 zadanie

        TreeSet<Integer> letters = new TreeSet<>();
        letters.add(20);
        letters.add(1);
        letters.add(50);
        letters.add(3);
        letters.add(3);
        System.out.println(letters);

        //4 zadanie
        TreeSet<String> let = new TreeSet<>();
        let.add(null);
        let.add("hi");
        System.out.println(let);
    }
}
