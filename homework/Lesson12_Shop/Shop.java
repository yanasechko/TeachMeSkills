package Lesson12_Shop;

import java.util.*;

public class Shop {

    HashMap<Integer, Product> productList = new HashMap<>();
    Product product = new Product();

    public void addProduct(Integer id, Product product) {
        if (productList.keySet().isEmpty() || !productList.containsKey(id)) {
            productList.put(id, new Product(product.getId(), product.getName(), product.getPrice()));
        } else System.err.println("Товар с таким ID уже существует. Товар не добавлен. ");
    }

    public void deleteProduct() {
        System.out.println("Введите ID товара, который хотите удалить: ");
        Scanner sc1 = new Scanner(System.in);
        var a = sc1.nextInt();
        if (productList.keySet().isEmpty() || !productList.containsKey(a)) {
            System.err.println("Товара с таким ID не найдено");
        } else productList.remove(a);
    }

    public void updateProduct(Integer id, String name, Integer price) {
        for (Product product : productList.values()) {
            if (product.getId().equals(id)) {
                product.setName(name);
                product.setPrice(price);
                break;
            }
        }
    }

    public void getProduct1() {
        List<Product> byPrice1 = new ArrayList<>(productList.values());
        byPrice1.sort(Comparator.comparing(Product::getPrice));
        for (Product p : byPrice1) {
            System.out.println("id=" + p.getId() + "\tname=" + p.getName() + "\tprice=" + p.getPrice());
        }
    }

    public void getProduct2() {
        List<Product> byPrice2 = new ArrayList<>(productList.values());
        byPrice2.sort(Comparator.comparing(Product::getPrice).reversed());
        for (Product p : byPrice2) {
            System.out.println("id=" + p.getId() + "\tname=" + p.getName() + "\tprice=" + p.getPrice());
        }
    }

    public void getProduct3() {
        System.out.println(productList);
    }
}








