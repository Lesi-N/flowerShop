package payment;

public class PayPalPaymentStrategy implements Payment {

    @Override
    public String pay(double price) {
        return String.format("PayPal payment complete. Total: $ %.2f", price);
    }
}
