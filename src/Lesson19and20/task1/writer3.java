package Lesson19and20.task1;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class writer3 {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\Lesson19and20\\io\\buffWriter.txt"));
             BufferedReader br = new BufferedReader(new FileReader("src\\Lesson19and20\\io\\buffReader.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                bufferedWriter.write(s);
            }
            bufferedWriter.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}