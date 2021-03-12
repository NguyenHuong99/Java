package Java1_19Example;

public class Rectangle1 implements Shape1{
    private int lenth, width;

    public Rectangle1(int lenth, int width){
        this.lenth = lenth;
        this.width = width;
    }
    @Override
    public String toString(){
        return "Rectangle[lenth = " + lenth + ", width = " + width + "]";
    }
    @Override
    // Need to implement all the abstract methods defined in the interface
    public double getArea(){
        return lenth * width;
    }
}
