package flowerTests;

import flowers.Flower;
import flowers.FlowerType;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;
    private int[] color;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.Rose);
        flower.setPrice(13);
        color = new int[] {127, 127, 0};
        flower.setColor(color);
    }

    @org.junit.jupiter.api.Test
    void getColor() {
        assertArrayEquals(color, flower.getColor());
        int[] oldColor = {127, 127, 0};
        color[0] = 0;
        assertArrayEquals(oldColor, flower.getColor());
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(13, flower.getPrice());
    }
}