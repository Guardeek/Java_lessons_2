package lesson15.task1;

import lesson11.task1.Printable;

public class User3 {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("печать ананимного класса");
            }
        };
        printable.print();
    }
}