package lesson14.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FndStrin  {

    public static void main(String args[]) {

        String stringPattern = "[1-z]+";
        String text = "Versions: Java  5, Java 6, Java   7, Java 8.";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
