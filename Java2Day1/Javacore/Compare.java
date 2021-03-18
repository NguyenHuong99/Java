package Javacore;

public class Compare {
    public static void main(String[] args) {
        String s1 = "CodeLean1";
        String s2 = "CodeLean2";
        System.out.println("Chuoi 1: " + s1);
        System.out.println("Chuoi 2: " + s2);

        // So sanh hai chuoi
        int S = s1.compareTo(s2);

        // Hien thi ket qua so sanh
        if (S < 0) {
            System.out.println("\" " + s1 +
                    "\"" + "cao hon ve mat tu vung so voi" + "\"" + s2 + "\"");
        } if (S == 0) {
            System.out.println("\" " + s1 + "\" " + "la tu vung bang");
        } else if (S > 0){
            System.out.println("\" " + s1 + "\" " + "la tu vung nho hon" + "\" " + s2 + "\" ");
        }
    }
}
