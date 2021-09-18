package Lesson11.task4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UnserializationApp {
    public static void main(String[] args) {
        try (var ois = new ObjectInputStream(new FileInputStream("./src/Lesson11/task4/car.dat"))) {
            Car c1 = (Car) ois.readObject();
            System.out.println(c1);
            Car c2 = (Car) ois.readObject();
            System.out.println(c2);
            Car c3 = (Car) ois.readObject();
            System.out.println(c3);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
