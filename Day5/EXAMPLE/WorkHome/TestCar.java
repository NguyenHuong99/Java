package EXAMPLE.WorkHome;

public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car(88789, "Park", 322.8);
        System.out.println("The plate number is: " + c1.getPlateNumber());
        System.out.println("The xLocation is: " + c1.park());
        System.out.println("The speed is: " + c1.move());
        System.out.println();

        Car c2 = new Car(56789, 222.5);
        System.out.println("The plate number is: " + c2.getPlateNumber());
        System.out.println("The xLocation is: " + c2.park());
        System.out.println("The speed is: " + c2.move());
        System.out.println();

        Car c3 = new Car();
        System.out.println("The plate number is: " + c3.getPlateNumber());
        System.out.println("The xLocation is: " + c3.park());
        System.out.println("The speed is: " + c3.move());
    }
}
