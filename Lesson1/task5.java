public class task5 {
    public static void main(String[] args) {

        int a = -1;
        int b = 7;
        int c = 99;

        if (a > 0 && b > 0 && c > 0)
            System.out.println("Три положительных числа");
        if (a < 0 && b < 0 && c < 0)
            System.out.println("Три отрицательных числа");
        if ((a > 0 && b > 0 && c < 0) || (a > 0 && c > 0 && b < 0) || (a < 0 && b > 0 && c > 0))
            System.out.println("Два положительных и одно отрицательное число");
        if ((a > 0 && b < 0 && c < 0) || (a < 0 && b < 0 && c > 0) || (a < 0 && b > 0 && c < 0))
            System.out.println("Два отрицательных и одно положительное число");
    }
}
