package lesson5.task7;

public class ForCikl {
    public static void main(String args[]) {

        int n = (int) (Math.random() * 6);
        System.out.println("Сгенерировано число " + n);
        int m = 1;
        for (int i = 2; i <= n; i++)
            m *= i;
        System.out.println(n + "!" + "=" + m);
    }
}
