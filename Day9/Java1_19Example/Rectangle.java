package Java1_19Example;

public class Rectangle extends  Shape{
    private int length, width;
    /** Constructs a Rectangle instance with the given color, length and width */
    public Rectangle(String color, int length, int width){
        super(color);
        this.length = length;
        this.width = width;
    }

    /** Returns a self-descriptive string */
    @Override
    public String toString(){
        return "Rectangle[length = " + length + ", width = " + width + "," + super.toString() + "]";
    }
    /** Override the inherited getArea() to provide the proper implementation for rectangle */
    @Override
    public double getArea(){
        return length * width;
    }

}
