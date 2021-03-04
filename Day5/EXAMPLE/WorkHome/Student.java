package EXAMPLE.WorkHome;

public class Student {
    private String name;
    private String name2;
    private double gpa2;
    private double gpa;

    public Student(){
        name = " Paul Lee";
        gpa = 2.0;
        name2 = "Peter Tan";
        gpa2 = 1.0;
    }
    public Student(double r, double s){
        name = "Paul Lee";
        gpa = r;
        name2 = "Peter Tan";
        gpa2 = s;
    }
    public Student(String a, String c, double r, double s){
        name = a;
        gpa = r;
        name2 = c;
        gpa2 = s;
    }
    public String getName(){
        return name;
    }
    public String getName2(){
        return name2;
    }
    public double setGpa(){
        return gpa;
    }
    public double setGpa2(){
        return gpa2;
    }
}
