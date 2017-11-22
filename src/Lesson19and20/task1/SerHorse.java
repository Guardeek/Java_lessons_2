package Lesson19and20.task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerHorse {
    public static void main(String[] args) {
        Halter halter = new Halter(3);
        Horse animal = new Horse("pigeon", halter);
        System.out.println("Halter size before serialization: " + animal.getHalter().getSize());
        try {
            FileOutputStream fs = new FileOutputStream("testSer.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(animal);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream("testSer.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            animal = (Horse) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Halter size after serialization: " + animal.getHalter());
    }
}
