package prob1.com.lab.payment;

public class CreditCardPayment implements PaymentMethod, Refundable {

    String cardHolder;
    double creditLimit;

    public CreditCardPayment(String cardHolder, double creditLimit) {
        this.cardHolder = cardHolder;
        this.creditLimit = creditLimit;
    }

    public boolean pay(double amount) {

        if (amount <= creditLimit) {
            System.out.println("Credit Card payment successful");
            return true;
        } else {
            System.out.println("Credit Card payment failed: Limit exceeded");
            return false;
        }
    }

    public String getName() {
        return "Credit Card";
    }

    public void refund(double amount) {
        System.out.println("Credit Card refund: " + amount + " INR");
    }
}