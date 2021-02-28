package Example;

import java.util.Arrays;
import java.util.Scanner;

public class example106 {
    public static void main(String[] args) {
        int numStudents;
        int[] grades;
        int [] bins = new int[10];
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        numStudents = in.nextInt();

        grades = new int[numStudents];

        for (int i = 0; i < grades.length; ++i){
            System.out.println("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(grades));

        for (int grade : grades) {
            if (grade == 100) {
                ++bins[9];
            } else {
                ++bins[grade/10];
            }
        }
        System.out.println(Arrays.toString(bins));

        for (int binIdx = 0; binIdx < bins.length; ++binIdx) {
            if (binIdx != 9) {
                System.out.println("%2d-%3d: " + binIdx*10 + binIdx*10+9);
            } else {
                System.out.println("%2d-%3d: " + 90 + 100);
            }
            for (int itemNo = 0; itemNo < bins[binIdx]; ++itemNo) {
                System.out.println("*");
            }
            System.out.println();
        }

        int binMax = bins[0];
        for (int binIdx = 1; binIdx < bins.length; ++binIdx) {
            if (binMax < bins[binIdx]) binMax = bins[binIdx];
        }

        for (int level = binMax; level > 0; --level) {
            for (int binIdx = 0; binIdx < bins.length; ++binIdx) {
                if (bins[binIdx] >= level) {
                    System.out.println("   *   ");
                } else {
                    System.out.println("       ");
                }
            }
            System.out.println();
        }
        for (int binIdx = 0; binIdx < bins.length; ++binIdx) {
            System.out.println("%3d-%-3d" + binIdx*10 + (binIdx != 9) + binIdx * 10 + 9 + 100);
        }
        System.out.println();
        in.close();
    }
}
