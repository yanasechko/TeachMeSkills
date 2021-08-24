public class task7 {
    public static void main(String[] args) {

        int a = 3;

        if (a % 10 == 1 && (a%100<10 || a%100>20)) {
            System.out.println(a + " программист");
        }else if ((a% 10 >=2) && (a%10 <=4) && (a%100<10 || a%100>20))  {
            System.out.println(a + " программиста");
        } else System.out.println(a + " программистов");
    }
}