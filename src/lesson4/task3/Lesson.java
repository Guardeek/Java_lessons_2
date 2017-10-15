package lesson4.task3;

public class Lesson {
    public static void main(String[] args) {
        int count = 0;
        for (String str : args) {
            System.out.println(count++ + " аргумент = " + str);
        }
    }
}