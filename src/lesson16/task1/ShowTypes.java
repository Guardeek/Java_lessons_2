package lesson16.task1;

public class ShowTypes {
    public static void main(String args[]) {
        TreeGen<Integer, String, String> tgObj = new TreeGen<>(88, "Generics", "Test");

        tgObj.showTypes();

        int v = tgObj.getOb1();
        System.out.println("value: " + v);

        String str = tgObj.getOb2();
        System.out.println("value: " + str);

        String str2 = tgObj.getOb3();
        System.out.println("value: " + str2);
    }
}
