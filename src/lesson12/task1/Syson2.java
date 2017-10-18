package lesson12.task1;

public class Syson2 {

    public static void main(String[] args) {

        Syson coffeeSize = Syson.January;

        if (coffeeSize == coffeeSize.January) {
            System.out.println(coffeeSize);
        }
        switch (coffeeSize) {
            case January: {
                System.out.println("Я люблю январь");
                break;
            }
            case February:
                System.out.println("Я люблю февраль");
                break;
            case March: {
                System.out.println("Я люблю март");
                break;
            }
            case April: {
                System.out.println("Я люблю апрель");
                break;
            }
        }
    }
}