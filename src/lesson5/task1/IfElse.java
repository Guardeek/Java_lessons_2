package lesson5.task1;

public class IfElse {
    public static void main(String[] args) {
        print(args);
    }

    public static void print(String[] tr) {
        int day = Integer.parseInt(tr[0]);
        String dayoul;
        if (day == 1) {
            dayoul = "Понедельник";
        } else if (day == 2) {
            dayoul = "Вторник";
        } else if (day == 3) {
            dayoul = "Среда";
        } else if (day == 4) {
            dayoul = "Четверг";
        } else if (day == 5) {
            dayoul = "Пятница";
        } else if (day == 6 || day == 7) {
            dayoul = "Выходной";
        } else {
            dayoul = "Не день недели";
        }
        pechat(dayoul);
    }

    private static void pechat(String Day_all) {
        System.out.println("День недели сейчас " + Day_all + ".");
    }
}