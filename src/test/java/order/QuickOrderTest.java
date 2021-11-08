package order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import users.Receiver;

import static org.junit.jupiter.api.Assertions.*;

class QuickOrderTest {
    Order quickOrder;
    Receiver receiver;

    @BeforeEach
    void setUp() {
        quickOrder = QuickOrder.createOrder(QuickOrder.Tulip_BUCKET);
        receiver = new Receiver();
    }

    @Test
    void createOrder() {
        assertEquals(160, quickOrder.calculateTotalPrice());
        assertEquals("Ribbon Decorator for Flowerbucket: Tulip pack", quickOrder.getDescription());

        assertEquals(quickOrder.items.getFirst().getDescription(), "Ribbon Decorator for Flowerbucket: Tulip pack");

        quickOrder.addUser(receiver);
        quickOrder.order();
        assertEquals("Your order is en route.", receiver.getStatus());
    }
}