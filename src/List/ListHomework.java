package List;

import java.util.ArrayList;
import java.util.List;

public class ListHomework {
    public static void main(String[] args) {
        //1 Homework
        List<String> cities = new ArrayList<>();
        cities.add("Baku");
        cities.add("Kiev");
        cities.add("Berlin");
        cities.add("Paris");
        cities.add("Washington");
        cities.add("Chicago");

        System.out.println(cities.remove(2));
        System.out.println(cities);


        //2 Homework
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers.set(0, 100));
        System.out.println(numbers);

        //3 homework
        List<String> names = new ArrayList<>();
        names.add("Max");
        names.add("Murad");
        names.add("Max");
        names.add("Ali");
        names.add("Ali");
        names.add("Kenan");

        System.out.println(names.indexOf("Max"));
        System.out.println(names.lastIndexOf("Ali"));


    }
}
