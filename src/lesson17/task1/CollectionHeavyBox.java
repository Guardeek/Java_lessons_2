package lesson17.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionHeavyBox {
    public static void main(String[] args) {
        List<HavyBox2> list = new ArrayList<>();
        list.add(new HavyBox2(56));
        list.add(new HavyBox2(3455));
        list.add(new HavyBox2(400));
        list.add(new HavyBox2(44));
    }


    public static void metod1(List<HavyBox2> list) {
        Iterator<HavyBox2> iterator = list.iterator();
        while (iterator.hasNext()) {

            HavyBox2 element = iterator.next();

            System.out.print(element + " ");

        }
    }
}

