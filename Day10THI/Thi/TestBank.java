package Thi;

public class TestBank {
    public static void main(String[] args) {
        Bank b1 = new Bank(1000.0, 10);
        System.out.println("Loan: " + b1.getBalance());
        System.out.println("Rate: "  + b1.getRate());
        b1.setAnnualInterestRate(10);
        System.out.println("Annual Interest Rate: " + b1.calculateInterest());
    }
}
