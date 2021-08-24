package Lesson3;

public class task1 {
    public static void main(String[] args) {

        int array[] = new int[10];
        int a = 0;
        int b = 2;

        while (b <= 20) {

            array[a] = b;
            System.out.print(array[a] + " ");
            b += 2;
            a++;
        }
        System.out.println("\n");
        for (a = 0; a < 10; a++) {
            System.out.println(array[a]);
        }

    }

}

