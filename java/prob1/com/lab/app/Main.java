package prob1.com.lab.app;

import prob1.com.lab.payment.*;
import prob1.com.lab.util.Validator;

public class Main {

    public static void main(String[] args) {

        WalletPayment wallet = new WalletPayment(2000);

        CreditCardPayment creditCard =
                new CreditCardPayment("Matthew", 1000);

        UpiPayment upi =
                new UpiPayment("ravi@bank");

        PaymentMethod[] payments = {
            wallet,
            creditCard,
            upi
        };

        double[] amounts = {
            500,
            1500,
            300
        };

        for (int i = 0; i < payments.length; i++) {

            double amount = amounts[i];

            System.out.println();

            if (PaymentMethod.isValidAmount(amount)) {

                boolean success = payments[i].pay(amount);

                if (success) {
                    payments[i].printReceipt(amount);
                }

                if (payments[i] instanceof Refundable) {

                    Refundable r = (Refundable) payments[i];

                    r.refund(200);

                } else {

                    System.out.println(
                        payments[i].getName()
                        + " does not support refund"
                    );
                }

            } else {

                System.out.println("Invalid amount");
            }
        }

        System.out.println();

        if (Validator.isValidUpiId("ravi@bank")) {
            System.out.println("Valid UPI ID");
        } else {
            System.out.println("Invalid UPI ID");
        }
    }
}