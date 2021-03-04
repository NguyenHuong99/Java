package EXAMPLE.WorkHome;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "orange";
    }
    public Circle(double r) {
        radius = r;
        color = "orange";
    }
    public Circle(double r, String e) {
        radius = r;
        color = e;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }

}
