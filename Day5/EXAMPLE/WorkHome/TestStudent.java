package EXAMPLE.WorkHome;

public class TestStudent {
    public static void main(String[] args) {
        Student c1 = new Student("Paul Lee", "Peter Tan", 3.5, 3.9);
        System.out.println("The name is: " + c1.getName());
        System.out.println("The Gpa is: " + c1.setGpa());
        System.out.println();
        System.out.println("The name2 is: " + c1.getName2());
        System.out.println("The Gpa2 is: " + c1.setGpa2());
        System.out.println();

        Student c2 = new Student(3.5, 3.9);
        System.out.println("The name is: " + c2.getName());
        System.out.println("The Gpa is: " + c2.setGpa());
        System.out.println();
        System.out.println("The name2 is: " + c2.getName2());
        System.out.println("The Gpa2 is: " + c2.setGpa2());
        System.out.println();

        Student c3 = new Student();
        System.out.println("The name is: " + c3.getName());
        System.out.println("The Gpa is: " + c3.setGpa());
        System.out.println();
        System.out.println("The name2 is: " + c3.getName2());
        System.out.println("The Gpa2 is: " + c3.setGpa2());

    }
}
