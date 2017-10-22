package lesson12.task2;

public class Temperature2 {
    public static void main(String[] args) {
        System.out.println(Temperature.AUTUMN.getDelta());
        for (Temperature coffeeSize : Temperature.values()) {

            System.out.println(coffeeSize + " " +
                    coffeeSize.getDescription());
        }
    }
}