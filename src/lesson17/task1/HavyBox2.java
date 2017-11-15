package lesson17.task1;

public class HavyBox2 implements Comparable <HavyBox2>{
    int weight; // вес коробки

    public HavyBox2() {
    }

    public HavyBox2(int weight) {

        this.weight = weight;
    }

    @Override
    public int compareTo(HavyBox2 o) {
        return o.weight-this.weight;
    }
}
