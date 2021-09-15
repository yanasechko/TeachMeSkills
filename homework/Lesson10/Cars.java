package Lesson10;

public class Cars {
    public static void main(String[] args) {
        try {
            var car1 = new Car("BMW", 200, 5000);
            car1.start();
        } catch (EvenNumberException e) {
            e.printStackTrace();
        }

        try {
            var car2 = new Car("Audi", 190, 4000);
            car2.start();
        } catch (EvenNumberException e) {
            e.printStackTrace();
        }

        try {
            var car3 = new Car("Mercedes", 170, 6000);
            car3.start();
        } catch (EvenNumberException e) {
            e.printStackTrace();
        }

    }
}
