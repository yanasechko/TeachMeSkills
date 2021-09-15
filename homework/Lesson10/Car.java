package Lesson10;

import java.util.Random;

public class Car implements IStart {

    private String brand;
    private int speed;
    private int price;

    public Car() {
    }

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public void start() {
        var random = new Random().nextInt(20);
        if (random % 2 == 0) {
            throw new EvenNumberException(this.brand);
        } else System.out.printf("Автобиль марки %s завёлся.\n", brand);
    }
}
