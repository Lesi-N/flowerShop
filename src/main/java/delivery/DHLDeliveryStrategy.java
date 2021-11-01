package delivery;

import order.Order;

public class DHLDeliveryStrategy implements Delivery {

    @Override
    public String deliver(Order order) {
        return "Delivery is being shipped by DHL. Order summary: " + order.getDescription();
    }
}
