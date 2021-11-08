package users;

import order.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {
    Receiver receiver = new Receiver();
    Order order = new Order();

    Receiver rec1 = new Receiver();
    Receiver rec2 = new Receiver();

    @BeforeEach
    void setUp() {
        order.addUser(receiver);
        receiver.setStatus("No status yet");
    }

    @Test
    void update() {
        assertEquals("No status yet", receiver.getStatus());
        order.order();
        assertEquals("Your order is en route.", receiver.getStatus());
    }

    @Test
    void getId() {
        assertNotEquals(rec1.getId(), rec2.getId());
        assertEquals(rec2.getId() - rec1.getId(), 1);
        assertEquals(rec2.getId() - receiver.getId(), 2);
    }
}