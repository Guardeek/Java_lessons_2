package lesson5.task2;

public class Switch {
    public static void main(String args[]) {
        int day = 4;
        String day_all;
        day_all = getString(day);
        print(day_all);
    }

    private static String getString(int day) {
        String day_all;
        switch (day) {
            case 1:
                day_all = "Понедельник";
                break;
            case 2:
                day_all = "Вторник";
                break;
            case 3:
                day_all = "Четверг";
                break;
            case 4:
                day_all = "Пятница";
                break;
            case 5:
                day_all = "Суббота";
                break;
            case 7:
                day_all = "Воскресенье";
                break;
            default:
                day_all = "Не день недели";
        }
        return day_all;
    }

    private static void print(String day_all) {
        System.out.println("День недели " + day_all + ".");
    }
}