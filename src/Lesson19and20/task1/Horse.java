package Lesson19and20.task1;

import java.io.Serializable;

public class Horse extends Animal implements Serializable {
    private String name;
    private transient Halter halter;

    public Horse(String name, Halter halter) {
        this.name = name;
        this.halter = halter;
    }

    public Halter getHalter() {
        return halter;
    }
}