public class SumProduct3Numbers {
    public static void main(String[] args) {
        int number1 = 98;
        int number2 = 5;
        int number3 = 77;
        int sum, area;

        sum = number1 + number2 + number3;
        area = number1 * number2 * number3;

        System.out.print("The sum, area of ");
        System.out.print(number1);
        System.out.print(", ");
        System.out.println(number2);
        System.out.print(" and ");
        System.out.print(number3);
        System.out.print(" are ");
        System.out.println(sum);
        System.out.print(", ");
        System.out.println(area);
    }
}
