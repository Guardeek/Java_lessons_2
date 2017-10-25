package lesson13.task1;

public class Endstring {
    public static void end(String str1) {
        int lengs = str1.length();
        System.out.println("Last symbol:" + str1.charAt(lengs - 1));
        System.out.println("Tree symboll:" + str1.endsWith("!!!"));
        System.out.println("Tree symboll:" + str1.startsWith("I like"));
        System.out.println("lastIndexOf('Java') = " + str1.lastIndexOf("Java"));
        System.out.println(str1.replace('a', 'o'));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.substring(7,11));
    }

    public static void main(String[] args) {
        end("I like Java!!!");
    }
}
