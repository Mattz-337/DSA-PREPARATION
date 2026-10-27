package prob1.com.lab.payment;

public class UpiPayment implements PaymentMethod {

    String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    public boolean pay(double amount) {

        System.out.println("UPI payment successful");
        return true;
    }

    public String getName() {
        return "UPI";
    }

    @Override
    public void printReceipt(double amount) {

        System.out.println("Payment Method: UPI");
        System.out.println("UPI ID: " + upiId);
        System.out.println("Amount: " + amount + " INR");
    }
}