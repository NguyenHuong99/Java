package exampleBook;

public class Cylinder extends Cricle {
    private double height;

    public Cylinder(){
        super();
        this.height = 1.0;
        System.out.println("Constructed a Cylinder with Cylinder()");
    }
    public Cylinder(double height){
        super();
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height)");
    }
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius)");
    }
    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)");
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    // @Override the getArea() method inherited from superclass Circle
    @Override
    public double getArea(){
        return 2*Math.PI*getRadius()*height + 2*super.getArea();
    }
    // Need to change the getVolume() as well
    public double getVolume(){
        return getArea() * height;
    }
    // Override the inherited toString()
    @Override
    public String toString(){
        return "Cylynder[" + super.toString() + " , height = " + height + "]";
    }
}
