package Javacore;

public class Sample_String {
    public static void main(String[] args) {
        String str_Sample = "a";
        System.out.println("So sanh voi 'a' b la: " + str_Sample.compareTo("b"));
        str_Sample = "b";
        System.out.println("So sanh voi 'b' a la: " + str_Sample.compareTo("a"));
        str_Sample = "b";
        System.out.println("So sanh voi 'b' la: " + str_Sample.compareTo("b"));
    }
}
