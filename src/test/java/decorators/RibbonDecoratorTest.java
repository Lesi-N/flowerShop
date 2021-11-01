package decorators;

import flowers.FlowerBucket;
import flowers.FlowerPack;
import flowers.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {
    Item flower = new FlowerBucket();

    @BeforeEach
    void setUp() {
        flower = new RibbonDecorator(flower);
    }

    @Test
    void getPrice() {
        assertEquals(40, flower.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("Ribbon Decorator", flower.getDescription());
    }
}