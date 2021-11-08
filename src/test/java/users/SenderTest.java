package users;

import order.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {
    Sender sender = new Sender();
    Order order = new Order();

    Sender sen1 = new Sender();
    Sender sen2 = new Sender();
    @BeforeEach
    void setUp() {
        order.addUser(sender);
        sender.setStatus("No status yet");
    }

    @Test
    void update() {
        assertEquals("No status yet", sender.getStatus());
        order.order();
        assertEquals("Your order is en route.", sender.getStatus());
    }

    @Test
    void getId() {
        assertNotEquals(sen1.getId(), sen2.getId());
        assertEquals(sen2.getId() - sen1.getId(), 1);
        assertEquals(sender.getId() - sen2.getId(), 2);
    }
}