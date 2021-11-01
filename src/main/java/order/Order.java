package order;

import delivery.Delivery;
import flowers.Item;
import payment.Payment;

import java.util.LinkedList;

public class Order {
    LinkedList<Item> items = new LinkedList<>();
    Payment payment;
    Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getPrice();
        }
        return total;
    }

    public String processOrder() {
        return "Processing order...";
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public String getDescription() {
        String descr = "";
        for (int i = 0; i < items.size(); i++) {
            descr += items.get(i).getDescription();
        }
        return descr;
    }
}
