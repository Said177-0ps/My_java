import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class HomeworkSet {
    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<>();
        countries.add("USA");
        countries.add("Spain");
        countries.add("France");
        countries.add("Brazil");
        countries.add("United Kingdoms");
        countries.add("Uganda");
        countries.add("Colombia");
        countries.add("USA");
        countries.add("United Kingdoms");
        System.out.println(countries);

        //2 Homework
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Max");
        names.add("Said");
        names.add("Ali");
        names.add("Farhad");
        names.add("Yunis");
        names.add("Senan");
        System.out.println(names);
        names.remove("Ali");
        System.out.println(names);

        //3 homework
        TreeSet<Integer> marks = new TreeSet<>();
        marks.add(4);
        marks.add(2);
        marks.add(2);
        marks.add(3);
        marks.add(5);
        marks.add(2);
        marks.add(4);
        marks.add(5);
        marks.add(3);
        marks.add(2);
        System.out.println(marks);

        //4 Homework
        NavigableSet<Integer> num = new TreeSet<>();
        num.add(54);
        num.add(35);
        num.add(20);
        num.add(14);
        num.add(76);
        num.add(60);
        num.add(38);
        System.out.println(num.first());
        System.out.println("-----------");
        System.out.println(num.last());
        System.out.println("-----------");
        System.out.println(num.lower(50));
        System.out.println("-----------");
        System.out.println(num.higher(50));

    }
}
