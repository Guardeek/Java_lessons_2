package lesson13.task1;
//не закончено
public class Builder {

    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Hello");
        String s;
        int a = 3;
        int b = 56;
        //StringBuilder sb = new StringBuilder(40);
        s = sb.append("a =").append(a).append(b).toString();
        System.out.println(s);

    }

}
