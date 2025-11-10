package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework1 {
    public static void main(String[] args) {
        String NewWorld = "NewWorld12";

        Pattern pattern = Pattern.compile("[A-Za-z0-9]+");
        Matcher matcher = pattern.matcher(NewWorld);

        if (matcher.find()) {
            System.out.println("Это слово");
        } else {
            System.out.println("Это не слово");
        }
    }
}
