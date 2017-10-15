package lesson4.task2;

public class Garland {

    public static void main(String[] args) {
        int a = 10000001;
        System.out.println("a = " + Integer.toBinaryString(a));
        tilda(a);
        and(a);
        less(a);
    }

    public static void tilda(int s) {
        for (int i = 0; i < 10; i++) {
            s = ~s;
            System.out.println("~ a = " + Integer.toBinaryString(s));
        }
    }

    public static void less(int c) {
        for (int i = 0; i < 10; i++) {
            c = c << 1;
            System.out.println("a << 1 = " + Integer.toBinaryString(c));
        }
    }

    public static void and(int n) {
        int t = n & 1;
        if (t == 1) {
            System.out.println("a & 1 = " + Integer.toBinaryString(t) + " - лампочка включена");
        }
        if (t == 0) {
            System.out.println("a & 1 = " + Integer.toBinaryString(t) + " - лампочка выключена");
        }
    }
}