package Lesson2;

public class task3 {
    public static void main(String[] args) {

        int sum = 0;
        int j = 1;
        while (j <= 256) {
            sum = sum + j;
            j = j * 2;
        }
        System.out.println(sum);
    }
}
