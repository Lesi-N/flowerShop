package decorators;

import flowers.FlowerBucket;
import flowers.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {
    Item flower = new FlowerBucket();

    @BeforeEach
    void setUp() {
        flower = new BasketDecorator(flower);
    }

    @Test
    void getPrice() {
        assertEquals(4, flower.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("Basket Decorator", flower.getDescription());
    }
}