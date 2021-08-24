public class task2 {
    public static void main(String[] args) {

        int a = 5;
        int b = 4;
        int c = 20;

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольника не существует");
        }
    }
}
