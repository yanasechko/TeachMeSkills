public class task1 {
    public static void main(String[] args) {
        int a = 100;
        if (a > 0 & a < 10)
            System.out.println("Это однозначное положительное число");
        if (a > 9 & a < 100)
            System.out.println("Это двузначное положительное число");
        if (a > 99)
            System.out.println("Это трехзначное и более положительное число");
        if (a < 0 & a > -10)
            System.out.println("Это однозначное отрицательное число");
        if (a < -9 & a > -100)
            System.out.println("Это двузначное отрицательное число");
        if (a < -99)
            System.out.println("Это трехзначное и более отрицательное число");
        if (a == 0)
            System.out.println("Это однозначное число");
    }
}