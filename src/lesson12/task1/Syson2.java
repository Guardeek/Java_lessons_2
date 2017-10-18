package lesson12.task1;

public class Syson2 {

    public static void main(String[] args) {

        Syson coffeeSize = Syson.January;

        if (coffeeSize == coffeeSize.January) {
            System.out.println(coffeeSize);
        }
        switch (coffeeSize) {
            case January: {
                Wind();
            }
            case February:
                Wind();
            case December:
                Wind();
                break;
        }

        Syson[] coffeeSizes = Syson.values();
        for (Syson January : coffeeSizes) {
            System.out.println(January);
        }
        System.out.println();

        Syson jhk = Syson.valueOf("January");
        System.out.println("Переменная Syson содержит " +
                jhk);
    }

    private static void Wind() {
        System.out.println("Я люблю зиму");
        return;
    }
}