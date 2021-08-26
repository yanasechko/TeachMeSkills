package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class task5 {
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
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}