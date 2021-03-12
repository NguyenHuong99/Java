package Java1_19Example;

public class Triangle1 implements Shape1{
    private int base, height;

    public Triangle1(int base, int height){
        this.base = base;
        this.height = height;
    }
    @Override
    public String toString(){
        return "Triangle[base = " + base + ", height = " + height + "]";
    }
    // Need to implement all the abstract methods defined in the interface
    @Override
    public double getArea(){
        return 0.5 * base * height;
    }
}
