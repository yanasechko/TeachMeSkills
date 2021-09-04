package Lesson7;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    public static void main(String[] args) {
        Details comp = new Details();
        comp.details();
        for (int i = 0; i < comp.resource; i++) {
            comp.on();
            comp.off();
        }
        System.out.println("Превышен лимит ресурса. Комп сгорел.");
    }
}

class Details {

    String proc = "Intel_Core_i5";
    String memory = "8GB";
    String HDD = "1TB";
    int resource = 5;


    void details() {
        System.out.println("Компьютер имееет: процессор " + proc + ", оперативка " + memory +
                ", жеский диск на " + HDD + ". Ресурс полных циклов работы: " + resource + ".");
    }

    void on() {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Вы включаете компьютер. Введите 0 или 1.");
        var n = sc.nextInt();
        int r1 = r.nextInt(2);
        if (n != r1) {
            System.out.println("Не угадали. Компьютер сгорел.");
        } else System.out.println("Компьютер выключился.");
    }


    void off() {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Вы выключаете компьютер. Введите 0 или 1.");
        var n = sc.nextInt();
        int r1 = r.nextInt(2);
        if (n != r1) {
            System.out.println("Не угадали. Компьютер сгорел.");
        } else System.out.println("Компьютер выключился.");
    }

}