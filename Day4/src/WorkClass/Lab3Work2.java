package WorkClass;

import java.util.Scanner;

public class Lab3Work2 {
    public static void main(String[] args) {
        int Shirts, Trousers;
        int PriceShirts = 300, PriceTrousers = 700;
        int Total1 , Total2;
        double Discount = 0.00, NetTotal, Point;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of Shirts to order: ");
        Shirts = scan.nextInt();
        System.out.print("\nEnter the number of Trousers to order: ");
        Trousers = scan.nextInt();

        Total1 = Shirts * PriceShirts;
        Total2 = Trousers * PriceTrousers;
        System.out.print("Item              Quantity          Price          Total");
        System.out.print("\n--------------------------------------------------------------");
        System.out.print("\nShirts             " + Shirts);
        System.out.print("                " + PriceShirts);
        System.out.print("             " + Total1 );
        System.out.print("\nTrousers           " + Trousers);
        System.out.print("                " + PriceTrousers);
        System.out.print("             " + Total2);
        if (Total1 + Total2 >= 5000){
            Discount = (Total1 + Total2) /10;
            System.out.print("\nDiscount                                            " + Discount);
        } else if (Total1 + Total2 >= 3000  ){
            Discount = (Total1 + Total2) / 5;
            System.out.print("\nDiscount                                            " + Discount);
        } else if (Total1 + Total2 < 3000){
            System.out.print("\nDiscount                                            " + Discount);
        }
        System.out.print("\n--------------------------------------------------------------");
        NetTotal = (Total1 + Total2) - Discount;
        System.out.print("\nNet Total                                           " + NetTotal);
        System.out.print("\n--------------------------------------------------------------");
        Point = NetTotal / 10;
        System.out.printf("\nPoints Earned          %.0f ", Point);
        System.out.print("\nThank you!");
    }
}
