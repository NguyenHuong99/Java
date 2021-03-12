package Java1_19Example;

public class TestShape1 {
    public static void main(String[] args) {
        Shape1 s1 = new Rectangle1(1,2);
        System.out.println(s1);
        System.out.println("Area is " + s1.getArea());

        Shape1 s2 = new Triangle1(3,4);
        System.out.println(s2);
        System.out.println("Area is " + s2.getArea());

        // Cannot create instance of an interface
        // Shape1 s3 = new Shape1("green");
        // compilation error: Shape is abstract; cannot ve instantiated
    }
}
