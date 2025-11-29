package Map;

import java.util.HashMap;
import java.util.TreeMap;

public class ZadanieMain {
    public static void main(String[] args) {
        HashMap<String, Double> marks = new HashMap<>();
        marks.put("Said", 86.7);
        marks.put("Omar", 67.2);
        marks.put("Suel", 97.9);
        marks.put("Maqastan", 91.4);
        marks.put("Mehemmed", 75.0);
        System.out.println(marks);

        //2 zadanie
        TreeMap<Integer, String> user = new TreeMap<>();
        user.put(53, "Said");
        user.put(76, "Suel");
        user.put(355, "Maqastan");
        user.put(45, "Mehhemed");
        user.put(3, "Renat");
        user.put(105, "Maga-President");

        System.out.println(user);

        //3 Zadanie (ot sebya)
        HashMap<String, String>  user_of_magastana = new HashMap<>();
        user_of_magastana.put("President", "Maqa");
        user_of_magastana.put("Admiral", "Said");
        user_of_magastana.put("general", "Suel");
        user_of_magastana.put("Assistent", "Mehemmed");
        user_of_magastana.put("Jitel1", "Murad");
        user_of_magastana.put("Jitel2", "Omar");
        user_of_magastana.put("Zakluchennyiy", "Renat");

        System.out.println("Жители Страны Магастана:" + user_of_magastana.get("Jitel1") + "," + user_of_magastana.get("Jitel2"));


    }
}
