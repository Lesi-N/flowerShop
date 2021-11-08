package decorators;

import flowers.FlowerBucket;
import flowers.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {
    Item flower = new FlowerBucket();

    @BeforeEach
    void setUp() {
        flower = new PaperDecorator(flower);
    }

    @Test
    void getPrice() {
        assertEquals(13, flower.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("Paper Decorator for Flowerbucket: ", flower.getDescription());
    }
}