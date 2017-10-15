package lesson3.task4;

import java.util.Scanner;

public class SumInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = getI1(scanner,0);
        int i2 = getI1(scanner,0);
        int i3 = i1 + i2;
        System.out.println("i3 = " + i3);
    }

    private static int getI1(Scanner scanner, int i1) {
        System.out.println("Введите число");
        if (scanner.hasNextInt()) {
            i1 = scanner.nextInt();
            System.out.println(i1);
        } else {
            System.out.println("Вы ввели не целое число");
        }
        return i1;
    }
}