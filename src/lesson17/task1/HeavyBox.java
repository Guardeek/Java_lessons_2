package lesson17.task1;

import lesson11.task1.Book;
import lesson8.task2.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeavyBox {
    public static void main(String[] args) {
        List<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person());
        arrayList.add(new Person("fdf","23"));
        for (Person str : arrayList) {
            System.out.println("Value is: " + str);

        }
    }
}
