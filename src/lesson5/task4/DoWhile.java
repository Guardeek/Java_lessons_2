package lesson5.task4;

public class DoWhile {
    public static void main(String args[]) {
        int n = 1;
        doprint(n);
    }

    private static void doprint(int n) {
        do {
            System.out.println(n++*5);
        } while (n < 21 );
    }
}