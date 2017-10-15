package lesson2.task6;

public class Literales {

    public static void main(String[] args) {
        boolean b1 = isBool();
        String str1 = isStr();
        char c1 = isChar();
        int i1 = isInt2();
        int six = isInt8();
        int x1 = isInt10();
        int a1 = isInt16();
        float f1 = isFlF();
        float f2 = isFld();
        System.out.print(b1 + "\n");
        System.out.print(str1 + "\n");
        System.out.print(c1 + "\n");
        System.out.print(i1 + "\n");
        System.out.print(six + "\n");
        System.out.print(x1 + "\n");
        System.out.print(a1 + "\n");
        System.out.print(f1 + "\n");
        System.out.print(f2 + "\n");
        System.out.print("Конец");
    }
    private static float isFld() {
        return 34.456f;
    }
    private static float isFlF() {
        return isFloatF();
    }
    private static float isFloatF() {
        return 34.456f;
    }
    private static int isInt16() {
        return 0X0005;
    }
    private static int isInt10() {
        return 878;
    }
    private static int isInt8() {
        return 06;
    }
    private static int isInt2() {
        return 0b101;
    }
    private static char isChar() {
        return 'n';
    }
    private static String isStr() {
        return "Строковый";
    }
    private static boolean isBool() {
        return true;
    }
}




