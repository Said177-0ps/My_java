package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

public class MapHomework {
    public static void main(String[] args) {
        HashMap<String, Integer> name_age = new HashMap<>();
        name_age.put("Maqa", 23);
        name_age.put("Farhad", 13);
        name_age.put("kenan", 94);
        name_age.put("Yusif", 23);
        name_age.put("Farhad", 18);
        name_age.put("kamal", 27);
        name_age.put("Maqa", 25);
        System.out.println(name_age);

        //2 homework
        LinkedHashMap<Integer, String> subject = new LinkedHashMap<>();
        subject.put(3, "Math");
        subject.put(8, "Chimestry");
        subject.put(5, "Geografy");
        subject.put(2, "Biology");
        subject.put(4, "History");
        subject.put(7, "IT");
        subject.put(1, "Azerbaycan");
        subject.put(6, "English");
        System.out.println(subject);

        //3 homework
        TreeMap<Integer, String> game = new TreeMap<>();
        game.put(12, "Call of duty");
        game.put(7, "War thunder");
        game.put(5, "Dota");
        game.put(10, "Battlefield");
        game.put(3, "Roblox");
        game.put(2, "Counter Strike 2");
        game.put(4, "War zone");
        game.put(8, "Counter strike 1.8");
        System.out.println(game);

        //4 homework ??
        //5 homework
        NavigableMap<Integer, String> num = new TreeMap<>();
        num.put(10, "A");
        num.put(20, "B");
        num.put(30, "C");
        num.put(40, "D");
        num.put(50, "E");
        System.out.println(num.lowerKey(25));
        System.out.println(num.higherKey(25));
        System.out.println(num.ceilingKey(30));
        System.out.println(num.floorKey((30)));


    }
}
