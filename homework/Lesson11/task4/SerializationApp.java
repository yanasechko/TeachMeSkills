package Lesson11.task4;

import java.io.*;

public class SerializationApp {
    public static void main(String[] args) {

        try (var oos = new ObjectOutputStream(new FileOutputStream("./src/Lesson11/task4/car.dat"))) {
            var c1 = new Car("BMW", 200, 5000);
            var c2 = new Car("Audi", 190, 4000);
            var c3 = new Car("Mercedes", 170, 6000);
            oos.writeObject(c1);
            oos.writeObject(c2);
            oos.writeObject(c3);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
