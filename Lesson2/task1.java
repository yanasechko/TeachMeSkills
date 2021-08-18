package Lesson2;

public class task1 {
    public static void main(String[] args) {

        double j = 10;
        double sum = 0;

        for (int i = 1; i < 8; i++) {
            System.out.println("Спортсмен пробежал в " + i + " день " + j + " км");
            sum = sum + j;
            j = j + j * 0.1;

        }
        System.out.println("Суммарный путь за 7 дней : " + sum + " км");
    }

}