public class task4 {
    public static void main(String[] args) {

        int a = 1;
        int b = -7;
        int c = -99;

        if (a > 0 && b > 0 && c > 0) {
            System.out.println("Три положительных числа");
        } else if ((a > 0 && b > 0) || (a > 0 && c > 0) || (b > 0 && c > 0)) {
            System.out.println("Два положительных числа");
        } else if (a > 0 || b > 0 || c > 0)
            System.out.println("Одно положительное число");

    }
}
