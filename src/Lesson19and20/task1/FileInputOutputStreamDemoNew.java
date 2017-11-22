package Lesson19and20.task1;

import java.io.*;

public class FileInputOutputStreamDemoNew {
    public static void main(String args[]) {
        try ( OutputStream output = new FileOutputStream("src/Lesson19and20/io/test.txt");
              InputStream input = new FileInputStream("src/Lesson19and20/io/test.txt");){
            char c[] = {'a', 'b', 'c'};

            for (char i : c) {
                output.write(i); // Запись каждого символа в текстовый файл
            }

            int size = input.available();

            for (int j = 0; j < size; j++) {
                System.out.print((char) input.read() + " "); // Чтение текстового файла посимвольно
            }
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}