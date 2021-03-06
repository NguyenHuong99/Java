package Work;

public class Employee {
    private int id, salary;
    private String firstName, lastName;

    public Employee(){
        id = 1;
        firstName = "Oliver";
        lastName = "Peter";
        salary = 200;
    }
    public int getId(){return id;}
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getName(){return firstName + lastName;}
    public int getSalary(){return salary;}
    public void setSalary(int newSalary){salary = newSalary;}
    public int getAnnualSalary(){return salary * 12;}
    public int raiseSalary(int percent){return percent;}
    public String toString(){return "Employee[id = " + id + " name = " + firstName + lastName + " salary = " + salary;}
}
