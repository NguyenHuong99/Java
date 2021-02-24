import java.util.Scanner;

public class FormattedInput {
    public static void main(String[] args) {

        System.out.println("Enter ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int intValue = scan.nextInt();
        System.out.println("Enter a decimal number:");
        float floatValue = scan.nextFloat();
        System.out.println("Enter a String value");
        String strValue = scan.next();
        System.out.println("Values enteredare:");
        System.out.println(intValue +""+floatValue+""+strValue);
    }
}
