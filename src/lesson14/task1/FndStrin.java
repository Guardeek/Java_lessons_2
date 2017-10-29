package lesson14.task1;

import java.util.Arrays;

public class FndStrin  {
    public static void main(String[] args) {
        String str = "Versions: Java  5, Java 6, Java   7, Java 8.";
        String[] words = str.split("\\\\d+\\\\s?");
        System.out.print(Arrays.toString(words));
    }
}