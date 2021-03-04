package EXAMPLE.WorkHome;

public class Car {
    private int plateNumber;
    private String xLocation;
    private double speed;

    public Car(){
        plateNumber = 56789;
        xLocation = "Park";
        speed = 222.5;
    }
    public Car(int r, double w){
        plateNumber = r;
        xLocation = "Park";
        speed = w;
    }
    public Car(int r, String t, double w){
        plateNumber = r;
        xLocation = t;
        speed = w;
    }
    public int  getPlateNumber() {return plateNumber;}
    public String park(){return  xLocation;}
    public double move(){return speed;}
}
