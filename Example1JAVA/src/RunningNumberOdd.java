public class RunningNumberOdd {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 1000;
        int sum = 0;

        int number = lowerbound;
        while (number <= upperbound) {
            if(number % 2 == 1)
            sum = sum + number;
            number++;
        }
        System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);
    }
}
