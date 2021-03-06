package Work;

public class TestEmployee {
    public static void main(String[] args) {
        Employee c1 = new Employee();
        System.out.println("Id "+ c1.getId());
        System.out.println("Name is: " + c1.getName());
        System.out.println("Salary is: " + c1.getSalary());
        System.out.println();
        Employee c2 = new Employee();
        System.out.println("Id " + c2.getId());
        System.out.println("Name is: " + c2.getName());
        System.out.println("Annual salary is: " + c2.getAnnualSalary());
        System.out.println("raise salary the salary by the percent: " + c2.raiseSalary(10));

        Employee c3 = new Employee();
        System.out.println(c3.toString());
    }
}
