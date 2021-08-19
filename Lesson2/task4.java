package Lesson2;

public class task4 {
    public static void main(String[] args) {

        int sum = 0;
        int B = 1;
        int A = -6;

        if (A > 0) {
            while (A > 0) {
                sum = sum + B;
                A--;
            }
        } else while (A < 0) {
            sum = sum - B;
            A++;
        }
        System.out.println(sum);

    }
}