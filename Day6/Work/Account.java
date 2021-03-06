package Work;

public class Account {
    private  int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    public int getAccountNumber() {return this.accountNumber;}
    public double getBalance() {return this.balance;}
    public void setBalance(double balance) {this.balance = balance;}
    public  void credit(double amount) {balance += amount;}
    public void debit(double amount) {
        if (balance < amount) {
            System.out.println("amount withdrawn exceeds the curren balance!");
        } else {
            balance -= amount;
        }
    }
    public String toString() {
        return"A/C no: " + accountNumber + " Balance =  " +  balance
    ;}
}
