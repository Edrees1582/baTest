public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Edrees", 100.0);
        BankAccount b2 = new BankAccount();

        b1.withdraw(75.0);

        b2.deposit(35.0);
		b2.withdraw(50.0);
    }
}