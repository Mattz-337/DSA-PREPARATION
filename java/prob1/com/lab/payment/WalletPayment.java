package prob1.com.lab.payment;

public class WalletPayment implements PaymentMethod, Refundable {

    double balance;

    public WalletPayment(double balance) {
        this.balance = balance;
    }

    public boolean pay(double amount) {

        if (amount <= balance) {
            balance = balance - amount;

            System.out.println("Wallet payment successful");
            System.out.println("Balance: " + balance);

            return true;
        } else {
            System.out.println("Wallet payment failed: Insufficient balance");
            return false;
        }
    }

    public String getName() {
        return "Wallet";
    }

    public void refund(double amount) {

        balance = balance + amount;

        System.out.println("Refund successful");
        System.out.println("Balance: " + balance);
    }
}