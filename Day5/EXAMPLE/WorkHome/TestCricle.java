package EXAMPLE.WorkHome;

public class TestCricle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "black");
        System.out.println("The radius is: " + c1.getRadius());
        System.out.println("The color is: " + c1.getColor());
        System.out.println();

        Circle c2 = new Circle(3.0);
        System.out.println("The radius is: " + c2.getRadius());
        System.out.println("The color is: " + c2.getColor());
        System.out.println();

        Circle c3 = new Circle();
        System.out.println("The radius is: " + c3.getRadius());
        System.out.println("The color is: " + c3.getColor());
    }
}
