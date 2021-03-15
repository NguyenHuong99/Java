package Thi;

public class Bank {
    private double balance, rate, annualInterestRate;

    public Bank(){
        balance = 0.0;
        rate = 0.0;
        annualInterestRate = 0.0;
    }
    public Bank(double balance, double rate){
        this.balance = balance;
        this.rate = rate;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getRate(){
        return rate;
    }
    public void setRate(double rate){
        this.rate = rate;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public double calculateInterest(){
        return balance * (annualInterestRate / 1200 * 10);
    }
}
