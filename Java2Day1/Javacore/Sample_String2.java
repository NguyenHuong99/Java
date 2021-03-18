package Javacore;

public class Sample_String2 {
    public static void main(String[] args) {
        // So sanh voi chuoi
        String str_Sample = "Rockstar";
        System.out.println("So sanh voi 'ROCKSTAR': " + str_Sample.compareTo("rockstar"));
        // So sanh voi - Bo qua truong hop
        System.out.println("So sanh voi 'ROCKSTAR' - Truong hop bi bo qua: " + str_Sample.compareToIgnoreCase("ROCKSTAR"));
    }
}
