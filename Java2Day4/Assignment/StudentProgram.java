package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentProgram {
    private List<Student> students = null;

    public StudentProgram(){
        this.students = new ArrayList<Student>();
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Classes: ");
            String classes = sc.nextLine();
            double maths = -1, physics = -1, chemistry = -1;
            do {
                try {
                    System.out.println("Math: ");
                    maths = Double.parseDouble(sc.nextLine());
                } catch (Exception ex) {
                    System.out.println("Error" + ex.getMessage());
                }
            } while (maths < 0 || maths > 10);
            do {
                try {
                    System.out.println("Physics: ");
                    physics = Double.parseDouble(sc.nextLine());
                } catch (Exception ex) {
                    System.out.println("Error" + ex.getMessage());
                }
            } while (physics < 0 || physics > 10);
            do {
                try {
                    System.out.println("Chemistry: ");
                    chemistry = Double.parseDouble(sc.nextLine());
                } catch (Exception ex) {
                    System.out.println("Error" + ex.getMessage());
                }
            } while (chemistry < 0 || chemistry > 10);

            students.add(new Student(name, classes, maths, physics, chemistry));
            System.out.println("Press x to exit");
            String anwser = sc.nextLine();
            if (anwser.equalsIgnoreCase("x")) {
                break;
            }
        }
    }
        public void display(){
            if (students.size() > 0) {
                System.out.println("Students List");
                for (var student : students) {
                    System.out.println("Name: " + student.getName());
                    System.out.println("Classes: " + student.getClasses());
                    System.out.println("Average: " + student.getAverage());
                    System.out.println("Type: " + student.getType());
                }
                System.out.println("---------- Classification Info -------------");
                classificationStudents();
            } else {
                System.out.println("No student in list");
            }
        }
        public void classificationStudents(){
            if (students.size() > 0) {
                int typeA = 0, typeB = 0, typeC = 0, typeD = 0;
                for (var student : student) {
                    if (student.getType().equals("A")) {
                        typeA++;
                    }
                    if (student.getType().equals("B")){
                        typeB++;
                    }
                    if (student.getType().equals("C")){
                        typeC++;
                    }
                    if (student.getType().equals("D")){
                        typeD++;
                    }
                }
                int totalStudents = students.size();
                System.out.println("A" + typeA * 1.0 / totalStudents);
                System.out.println("B" + typeB * 1.0 / totalStudents);
                System.out.println("C" + typeC * 1.0 / totalStudents);
                System.out.println("D" + typeD * 1.0 / totalStudents);
            } else {
                System.out.println("No students");
            }
        }
    }
