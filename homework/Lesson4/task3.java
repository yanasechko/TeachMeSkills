package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class task3 {
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

        int d1 = 1;
        int d2 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    d1 *= array[i][j];
                }
                if (i + j == n - 1) {
                    d2 *= array[i][j];
                }
            }
        }
        if (d1 == d2) {
            System.out.println("Произведения диагоналей равны");
        } else if (d1 > d2) {
            System.out.println("Произведение главной диагонали больше побочной");
        } else System.out.println("Произведение побочной диагонали больше главной");
    }
}


