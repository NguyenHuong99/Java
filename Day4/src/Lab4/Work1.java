package Lab4;

public class Work1 {
    public static void main(String[] args) {
        int ab;

        for (int o = 1; o <= 5; o++) {
            System.out.print(o + " square = ");
            for (int i = 1; i <= o; i++) {
                System.out.print("");
            }
            ab = o * o;
            System.out.println(""+ab);
        }
    }
}