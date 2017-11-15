package lesson17.task1;

import java.util.SortedSet;
import java.util.TreeSet;

public class ComparePersonDemo {
    public static void main(String[] args) {
        SortedSet<HavyBox2> set = new TreeSet<>();
        set.add(new HavyBox2(56));
        set.add(new HavyBox2( 8));
        set.add(new HavyBox2( 16));
        set.add(new HavyBox2( 69));
        for (HavyBox2 person : set) {
            System.out.println(person);
        }
    }
}
