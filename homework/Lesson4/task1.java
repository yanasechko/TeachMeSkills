package Lesson4;

import java.util.Random;
import java.util.Scanner;

//Посчитать сумму четных элементов стоящих на главной диагонали.
public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите размерность матрицы: NxN ");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n;
        n = scanner.nextInt();
        int array[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(10);

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }

        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            int j = i;
            if (array[i][j] % 2 == 0) {
                summ += array[i][j];
            }
        }
        System.out.println("Сумма четных элементов на главное диагонали: " + summ);
    }
}








