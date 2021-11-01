package delivery;

import flowers.Flower;
import flowers.FlowerType;
import flowers.Item;
import order.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {
    PostDeliveryStrategy deliverSt;
    Order order;
    Item item;

    @BeforeEach
    void setUp() {
        deliverSt = new PostDeliveryStrategy();
        order = new Order();
        item = new Flower(FlowerType.Chamomile);
        order.addItem(item);
    }

    @Test
    void deliver() {
        assertEquals("Delivery is being shipped by post. Order summary: Chamomile", deliverSt.deliver(order));
    }
}