package HomeWork1;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        float Math, Physics, Litereture;
        double AverageScore = 0.0;
        String cusname;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        cusname = scan.nextLine();

        System.out.println("Enter Point Math: ");
        Math = scan.nextFloat();
        System.out.println("Enter Point Physics: ");
        Physics = scan.nextFloat();
        System.out.println("Enter Point Litereture: ");
        Litereture = scan.nextFloat();
        AverageScore = (Math + Physics + Litereture) /2;

        System.out.println("Welcome " + cusname);
        System.out.println("Average Score is: " +AverageScore );


    }
}
