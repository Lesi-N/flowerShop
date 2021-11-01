package payment;

public class CreditCardPaymentStrategy implements Payment {

    @Override
    public String pay(double price) {
        return String.format("Credit card payment complete. Total: $ %.2f", price);
    }
}
