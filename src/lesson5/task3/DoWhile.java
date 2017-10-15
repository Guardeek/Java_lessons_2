package lesson5.task3;

public class DoWhile {
    public static void main(String args[]) {
        int n = 1;
        while (n < 11) {
            n = getN(n);
        }
    }

    private static int getN(int n) {
        System.out.println("Task " + n);
        n++;
        return n;
    }
}

