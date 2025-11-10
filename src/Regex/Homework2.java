package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework2 {
    public static void main(String[] args) {

        Pattern text1 = Pattern.compile("\\d+");
        Matcher text2 = text1.matcher("Я учусь в 9 классе, мне 14 лет, у брата 21.");

        while (text2.find()){
            System.out.println("Найдено:" + text2.group());
        }
    }
}
