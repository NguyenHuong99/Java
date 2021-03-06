package Work;

public class TestAccount {
    public static void main(String[] args) {
        Account c1 = new Account(1234, 99.99);
        System.out.println(c1);
        Account c2 = new Account(8888);
        System.out.println(c2);

        c1.setBalance(88.88);
        System.out.println(c1);
        System.out.println("The account Number is: " + c1.getAccountNumber());
        System.out.println("The balance is: " + c1.getBalance());

        c1.credit(10);
        System.out.println(c1);
        c1.debit(5);
        System.out.println(c1);
        c1.debit(500);
        System.out.println(c1);
    }
}
