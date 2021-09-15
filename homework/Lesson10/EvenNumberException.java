package Lesson10;

public class EvenNumberException extends RuntimeException {
    public EvenNumberException(String brand) {
        super(String.format("Автомобиль марки %s не завёлся.", brand));
    }
}
