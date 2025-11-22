package List;

import java.util.ArrayList;
import java.util.List;

public class ZadaniyeList {
    public static void main(String[] args) {
        List<String> films = new ArrayList<>();
        films.add("harry potter");
        films.add("my little pony");
        films.add("butterfly");
        films.add("Spiderman");
        films.add("Tony stark");

        System.out.println(films.set(0, "Lion"));
        System.out.println(films.get(3));
        System.out.println(films.remove(4));
        System.out.println(films);

    }
}
