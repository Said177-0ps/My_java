package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework3 {
    public static void main(String[] args) {
        String text = "Hello Java from Developia school";

        Pattern pattern = Pattern.compile("[A-Z][a-z]+");
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
