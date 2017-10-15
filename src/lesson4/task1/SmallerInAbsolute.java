package lesson4.task1;

import java.util.Scanner;

public class SmallerInAbsolute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double i1 = getI1(scanner, 0);
        double i2 = getI1(scanner, 0);
        double i3 = getI1(scanner, 0);
        if (i3 < i2 && i2 < i1) {
            System.out.println(i3);
        } else if (i2 < i1) {
            System.out.println(i2);
        } else {
            System.out.println(i1);
        }
    }

    private static double getI1(Scanner scanner, double i1) {
        System.out.println("Введите вещественное число");
        if (scanner.hasNextDouble()) {
            i1 = scanner.nextDouble();
            i1 = i1 < 0 ? -i1 : i1;
        } else {
            System.out.println("Вы ввели не вещественное число");
        }
        return i1;
    }
}