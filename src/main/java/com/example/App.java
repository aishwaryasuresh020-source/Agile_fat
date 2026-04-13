package com.example;

public class App {

    // Validate payment (simple logic)
    public boolean processPayment(double amount, String cardNumber) {

        // Condition 1: Amount must be positive
        if (amount <= 0) {
            return false;
        }

        // Condition 2: Card number must be 16 digits
        if (cardNumber == null || cardNumber.length() != 16) {
            return false;
        }

        // If all valid → payment success
        return true;
    }

    public static void main(String[] args) {
        App payment = new App();

        boolean result = payment.processPayment(1000, "1234567812345678");

        if (result) {
            System.out.println("Payment Successful");
        } else {
            System.out.println("Payment Failed");
        }
    }
}
