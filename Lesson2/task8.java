package Lesson2;

public class task8 {
    public static void main(String[] args) {

        int a;
        int b;
        for (a = 1; a < 5; a++) {
            for (b = a; b > 0; b--) {
                System.out.print("* ");

            }
            System.out.println("  ");
        }

        int i;
        int j;
        for (i = 0; i < 4; i++) {
            for (j = i; j < 4; j++) {
                System.out.print("* ");

            }
            System.out.println("  ");
        }


    }
}
