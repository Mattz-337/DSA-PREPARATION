package prob1.com.lab.payment;

public interface PaymentMethod {

    String CURRENCY = "INR";

    boolean pay(double amount);

    String getName();

    default void printReceipt(double amount) {
        System.out.println("Payment Method: " + getName());
        System.out.println("Amount: " + amount + " " + CURRENCY);
    }

    static boolean isValidAmount(double amount) {
        return amount > 0;
    }
}