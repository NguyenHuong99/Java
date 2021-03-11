package Java1_18;

public class Cylinder extends Circle {
    private double height;
    /** Constructs a Cylinder instance with the given height and radius */
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }
    /** Returns the height */
    public double getHeight(){
        return this.height;
    }
    /** Returns the volume of this cylinder */
    public double getVolume(){
        return super.getArea() * height;
    }
    /** Override the inherited method to return the sunface area */
    @Override
    public double getArea(){
        return 2.0 * Math.PI * getRadius() * height;
    }
    /** Override the inherited method to descripbe itself */
    @Override
    public String toString(){
        return "Cylinder[height = " + height + "," + super.toString() + "]";
    }
}
