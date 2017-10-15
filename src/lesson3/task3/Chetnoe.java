package lesson3.task3;
import java.util.Scanner;
public class Chetnoe {
    public static void main(String[] args) {
        int i;
        System.out.print("Введите число: ");
        Scanner input = new Scanner(System.in);
        i = input.nextInt();
        if (i % 2 == 0)
            System.out.println("Число четное");
        else
            System.out.println("Число нечетное");
    }
}