package delivery;

import order.Order;

public class PostDeliveryStrategy implements Delivery{

    @Override
    public String deliver(Order order) {
        return "Delivery is being shipped by post. Order summary: " + order.getDescription();
    }
}
