package Example;

public class BooleanMethodTest {
    public static boolean isodd(int number) {
        if (number % 2 == 1) { // the number divided by 2 results equals 1
            return true; //returns value
        } else {
            return false; // return value false
        }
    }
    public static void main(String[] args) {
        System.out.println(isodd(5));
        System.out.println(isodd(6));
        System.out.println(isodd(-5));
    }
}
