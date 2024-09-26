package PaymentProcess;
public class Paypal implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        // Logic for PayPal payment processing
        System.out.println("Processed payment of " + amount + " via PayPal.");
    }
}
