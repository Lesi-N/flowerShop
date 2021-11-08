package order;

import decorators.RibbonDecorator;
import flowers.Flower;
import flowers.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import users.Receiver;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order order = new Order();
    Receiver receiver = new Receiver();
    @BeforeEach
    void setUp() {

        order.addUser(receiver);

        Flower flower = new Flower(FlowerType.Chamomile);
        flower.setPrice(5);
        RibbonDecorator ribbonDecorator = new RibbonDecorator(flower);

        order.addItem(ribbonDecorator);
    }

    @Test
    void order() {
        order.order();
        assertEquals("Your order is en route.", receiver.getStatus());
    }

    @Test
    void calculateTotalPrice() {
        assertEquals(45, this.order.calculateTotalPrice());
    }

    @Test
    void processOrder() {
        assertEquals("Processing order...", this.order.processOrder());
    }
}