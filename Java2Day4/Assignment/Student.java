package Assignment;

public class Student {
    private String name, classes;
    private double maths, physics, chemistry;

    public Student(){
    }

    public Student(String name, String classes, double maths, double physics, double chemistry){
        this.name = name;
        this.classes = classes;
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getClasses(){
        return classes;
    }
    public void setClasses(String classes){
        this.classes = classes;
    }
    public double getMaths(){
        return maths;
    }
    public void setMaths(double maths) throws Exception{
        if (maths >= 0 && maths <= 10){
            this.maths = maths;
        } else {
            throw new Exception("Math must be 0 - 10!");
        }
    }
    public double getPhysics(){
        return physics;
    }
    public void setPhysics(double physics) throws Exception{
        if (physics >= 0 && physics <= 10){
            this.physics = physics;
        } else {
            throw new Exception("Physics must be 0 - 10!");
        }
    }
    public double getChemistry(){
        return chemistry;
    }
    public void setChemistry(double chemistry) throws Exception{
        if (chemistry >= 0 && chemistry <= 10){
            this.chemistry = chemistry;
        } else {
            throw new Exception("Chemistry must be 0 - 10!");
        }
    }
    public double getAverage(){
        return (maths + physics + chemistry) / 3;
    }
    public String getType(){
        double average = getAverage();
        if (average < 4){
            return "D";
        } else if (average >= 4 && average < 6){
            return "C";
        } else if (average >= 6 && average <= 7.5){
            return "B";
        } else if (average > 7.5){
            return "A";
        }
        return "";
    }
}
