public class ArithmeticTest {
    public static void main(String[] args) {
        int number1 = 98;
        int number2 = 5;
        int sum, difference, product, quotient, remainder;

        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2;
        quotient = number1 / number2;
        remainder = number1 % number2;

        System.out.print("The sum, difference, product, quotient and remainder of ");
        System.out.print(number1);
        System.out.print(" and ");
        System.out.print(number2);
        System.out.print(" are ");
        System.out.println(sum);
        System.out.print(", ");
        System.out.println(difference);
        System.out.print(", ");
        System.out.println(product);
        System.out.print(", ");
        System.out.println(quotient);
        System.out.print(", and ");
        System.out.println(remainder);
        // question 1
        System.out.print(", ");
        System.out.println(number1 + number2 + sum + difference + product + quotient + remainder);
        // question 2
        System.out.print(", ");
        System.out.println(31 * number1 + 17 * number2);
        ++number1;

        --number2;

        System.out.println("number1 after increment is " + number1);
        System.out.println("number2 after decrement is " + number2);
        quotient = number1 / number2;
        System.out.println("The new quotient of " + number1 + " and " + number2 + " is " + quotient);
    }
}
