package Lesson12_Shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        var shop = new Shop();

        while (true) {
            System.out.println("Меню магазина.Выберите:\n1 - вывод всех товаров\n2 - добавление товара\n" +
                    "3 - удаление товара\n4 - редактирование товара\n5 - для выхода из меню");
            var sc = new Scanner(System.in);
            var a = sc.nextInt();

            switch (a) {
                case 1 -> {
                    System.out.println("Выберите:\n1 - по цене (возрастание)\n2 - по цене (убывание)\n3 - по добавлению");
                    var c = sc.nextInt();
                    switch (c) {
                        case 1 -> {
                            shop.getProduct1();
                            System.out.println("Нажмите 1 для выхода в меню");
                            var d = sc.nextInt();
                            if (d == 1) break;
                            if (d != 1) {
                                continue;
                            }
                        }
                        case 2 -> {
                            shop.getProduct2();
                            System.out.println("Нажмите 1 для выхода в меню");
                            var e = sc.nextInt();
                            if (e == 1) break;
                            if (e != 1) {
                                continue;
                            }
                        }
                        case 3 -> {
                            shop.getProduct3();
                            System.out.println("Нажмите 1 для выхода в меню");
                            var f = sc.nextInt();
                            if (f == 1) break;
                            if (f != 1) {
                                continue;
                            }
                        }

                    }
                }
                case 2 -> {
                    while (true) {
                        System.out.println("Введите id товара: ");
                        var id = sc.nextInt();
                        System.out.println("Введите имя товара:");
                        var name = sc.next();
                        System.out.println("Введите цену товара:");
                        var price = sc.nextInt();
                        shop.addProduct(id, new Product(id, name, price));
                        System.out.println("Хотите добавить еще один?\n1 - Да\n2 - Нет");
                        var b = sc.nextInt();
                        if (b == 2) break;
                        if (b == 1) continue;
                        else System.err.println("Неверный ввод, попробуйте еще раз.");
                        break;
                    }
                }
                case 3 -> {
                    while (true) {
                        shop.deleteProduct();
                        System.out.println("Хотите удалить еще один?\n1 - Да\n2 - Нет");
                        var b = sc.nextInt();
                        if (b == 2) break;
                        if (b == 1) continue;
                        else System.err.println("Неверный ввод, попробуйте еще раз.");
                        break;
                    }
                }
                case 4 -> {
                    while (true) {
                        System.out.println("Введите ID товара для внесения изменений: ");
                        var id = sc.nextInt();
                        System.out.println("Введите новое имя товара: ");
                        var name = sc.next();
                        System.out.println("Введите новую цену товара: ");
                        var price = sc.nextInt();
                        shop.updateProduct(id, name, price);
                        System.out.println("Хотите изменить еще один?\n1 - Да\n2 - Нет");
                        var b = sc.nextInt();
                        if (b == 2) break;
                        if (b == 1) continue;
                        else System.err.println("Неверный ввод, попробуйте еще раз.");
                        break;
                    }

                }
            }
            if (a == 5) break;
            if (a < 1 || a > 4) {
                System.err.println("Неверный ввод, попробуйте еще раз.");
                continue;
            }
        }
    }
}
