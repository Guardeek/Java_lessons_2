package lesson12.task2;

public enum Temperature {

    WINTER(1),
    SUMMER(2) {
        public String getDescription() {
            return "SUMMER";

        }
    },
    SPRING(3),
    AUTUMN(4);

    private int delta;

    public String getDescription() {
        return "WINTER";

    }

    Temperature(int ounces) {
        this.delta = ounces;
    }

    public int getDelta() {
        return delta;
    }
}