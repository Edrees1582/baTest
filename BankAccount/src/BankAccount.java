public class BankAccount {
    private final String ownerName;
    private double balance;

    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
        balance = 0.0;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
