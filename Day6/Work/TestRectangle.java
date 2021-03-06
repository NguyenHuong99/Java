package Work;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle c1 = new Rectangle();
        System.out.println("The length Rectangle is: " + c1.getLength());
        System.out.println("The width Rectangle is: " + c1.getWidth());

        Rectangle c2 = new Rectangle(2.0f, 1.0f);
        System.out.println("The length " + c2.getLength() + " and width " + c2.getWidth() + " Rectangle");

        Rectangle c3 = new Rectangle();
        System.out.println("The area is: " + c3.getArea());

        Rectangle c4 = new Rectangle();
        System.out.println("The Perimeter is: " + c4.getPerimeter());

        Rectangle c5 = new Rectangle();
        System.out.println(c5.toString());

    }
}
