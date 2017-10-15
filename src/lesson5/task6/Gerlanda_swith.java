package lesson5.task6;

import java.util.Scanner;

public class Gerlanda_swith {

    public static void main(String[] args) {
        int a = 0;
        int f = ~a;
        int d = a << 3;
        int t = a & 1;
        String gerlanda;
        System.out.print("Введите номер герлянды: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        gerlanda = getString(a, f, d, t);
        pechat(a, f, d, t, gerlanda);
    }

    private static void pechat(int a, int f, int d, int t, String gerlanda) {
        System.out.println("Включилась герлянда " + gerlanda + ".");
        System.out.println("Герлянда из условия 1 = " + Integer.toBinaryString(a));
        System.out.println("Герлянда из условия 2 = " + Integer.toBinaryString(f));
        System.out.println("Герлянда из условия 3 = " + Integer.toBinaryString(d));
        System.out.println("Герлянда из условия 4 = " + Integer.toBinaryString(t));
    }

    private static String getString(int a, int f, int d, int t) {
        String gerlanda;
        switch (a) {
            case 1:
                gerlanda = Integer.toBinaryString(a);
                break;
            case 2:
                gerlanda = Integer.toBinaryString(f);
                break;
            case 3:
                gerlanda = Integer.toBinaryString(d);
                break;
            case 4:
                gerlanda = Integer.toBinaryString(t);
                break;
            default:
                gerlanda = "не из условия";
        }
        return gerlanda;
    }
}
