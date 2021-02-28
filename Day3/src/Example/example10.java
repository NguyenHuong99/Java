package Example;

import java.util.Scanner;

public class example10 {
    public static void main(String[] args) {
        String inStr;
        int inStrlen;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a String: ");
        inStr = in.next();
        inStrlen = inStr.length();

        System.out.println("The reverse is: ");
        for (int inCharIdx = inStrlen - 1; inCharIdx >= 0; --inCharIdx){
            System.out.print(inStr.charAt(inCharIdx));
        }
        System.out.println();
        in.close();
    }
}
