package EXAMPLE;

public class TestVehicle {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FourWheeler objFour = new FourWheeler("LA-09CS-1406", "Volkswagen", 4, true);
        objFour.showDetails();
        objFour.accelerate(200);
    }

}
