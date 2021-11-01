package payment;

import flowers.Flower;
import flowers.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    PayPalPaymentStrategy paySt;
    Flower item;

    @BeforeEach
    void setUp() {
        paySt = new PayPalPaymentStrategy();
        item = new Flower(FlowerType.Tulip);
        item.setPrice(4);
    }

    @Test
    void pay() {
        assertEquals("PayPal payment complete. Total: $ 4.00", paySt.pay(item.getPrice()));
    }
}