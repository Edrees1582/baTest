public class BankAccount {
    private final String ownerName;
    private double balance;

    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
        balance = 0.0;
    }
	
	public BankAccount() {
        this.ownerName = "New Account" + (int) (Math.floor(Math.random() * 1000) + 1);
        balance = 0.0;
    }

	public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

	public void deposit(double amount) {
        balance += amount;
        System.out.print("Account Owner: " + ownerName + "\nDeposited $" + amount);
        System.out.println(", Current balance: $" + balance);
    }
	
	public void withdraw(double amount) {
		if (balance < amount) {
            System.out.print("Account Owner: " + ownerName + "\nUnsuccessful withdrawal of $" + amount);
            System.out.println(", Current balance: $" + balance);
            return false;
        }
        else {
            balance -= amount;
            System.out.print("Account Owner: " + ownerName + "\nWithdrawn $" + amount);
            System.out.println(", Current balance: $" + balance);
            return true;
        }
	}

    public String getOwnerName() {
        return ownerName;
    }
}
