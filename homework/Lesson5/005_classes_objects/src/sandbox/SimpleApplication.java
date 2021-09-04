package sandbox;

public class SimpleApplication {
    public static void main(String[] args) {
        var p = new Person();
        p.setName("vasia");
        p.setAge(30);
        p.setPath("./vasia.data.txt");
        p.save();
    }
}
