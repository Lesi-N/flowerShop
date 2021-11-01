package delivery;

import flowers.Flower;
import flowers.FlowerType;
import flowers.Item;
import order.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {
    DHLDeliveryStrategy deliverSt;
    Order order;
    Item item;
    @BeforeEach
    void setUp() {
        deliverSt = new DHLDeliveryStrategy();
        order = new Order();
        item = new Flower(FlowerType.Rose);
        order.addItem(item);
    }

    @Test
    void deliver() {
        assertEquals("Delivery is being shipped by DHL. Order summary: Rose", deliverSt.deliver(order));
    }
}