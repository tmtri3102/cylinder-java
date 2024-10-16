public class TestCyclinder {
    public static void main(String[] args) {
        Cylinder cl = new Cylinder(5.2,"red", 80);
        System.out.println(cl);
        Circle a = new Cylinder(8.6, "blue", 7);
        System.out.println(a);
        Circle b = new Circle(8.6, "red");
        System.out.println(b);
    }
}
