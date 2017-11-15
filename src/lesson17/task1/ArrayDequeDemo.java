package lesson17.task1;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Queue<HavyBox2> queue = new ArrayDeque<>();
        queue.offer(new HavyBox2(23));
        queue.offer(new HavyBox2(4));
        queue.offer(new HavyBox2(5));
        queue.offer(new HavyBox2(6));
        while (queue.size() > 0) {
            System.out.print(queue.poll() + " ");
        }
    }
}