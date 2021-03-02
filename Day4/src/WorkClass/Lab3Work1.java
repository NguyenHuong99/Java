package WorkClass;

import java.util.Scanner;

public class Lab3Work1 {
    public static boolean Per(int number){
        if (number == 70){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int Maths, Science, English, Maths2, Science2, English2;
        int ThiDK, Bill;
        int Percentage, Percentage1;
        Scanner scan = new Scanner(System.in);
            System.out.println("Enter marks obtained in Maths: ");
            Maths = scan.nextInt();
            System.out.println("Enter marks obtained in Science: ");
            Science = scan.nextInt();
            System.out.println("Enter marks obtained in English: ");
            English = scan.nextInt();
            System.out.println();
            System.out.println("Enter marks obtained in Maths: ");
            Maths2 = scan.nextInt();
            System.out.println("Enter marks obtained in Science: ");
            Science2 = scan.nextInt();
            System.out.println("Enter marks obtained in English: ");
            English2 = scan.nextInt();

            ThiDK = Maths + Science + English;
            System.out.print("Marks of ThiDk:");
            System.out.print("\nMaths = " + Maths);
            System.out.print("\nScience = " + Science);
            System.out.println("\nEnglish = " + English);
            System.out.println();

            Bill = Maths2 + Science2 + English2;
            System.out.println("Maths of Bill:");
            System.out.println("Maths = " + Maths2);
            System.out.println("Science = " + Science2);
            System.out.println("English = " + English2);

            Percentage = ThiDK / 3;
            Percentage1 = Bill / 3;

            System.out.println("Total marks scored by ThiDk = " + ThiDK);
            System.out.print("Percentage = " + Percentage);
            System.out.println("%");
            System.out.println();
            System.out.println("Total marks scored by Bill = " + Bill);
            System.out.print("Percentage = " + Percentage1);
            System.out.println("%");

            System.out.print("Is ThiDK's percentage lesser than Bill? ");
            System.out.println(Per(70));
            System.out.print("Is ThiDK's percentage greater than Bill? ");
            System.out.println(Per(69));
            System.out.print("ThiDK's and Bill's percentage are equal? ");
            System.out.println(Per(69));
            System.out.print("Scholarship Amount for ThiDK = $");
            System.out.println(Percentage >= 70 ? 20000 : (Percentage >= 60 && Percentage <= 70) ? 10000 : 0);
            System.out.print("\nScholarship Amount for Bill = $");
            System.out.println(Percentage1 >= 70 ? 20000 : (Percentage1 >= 60 && Percentage1 <= 70) ? 10000 : 0);
        }
    }


