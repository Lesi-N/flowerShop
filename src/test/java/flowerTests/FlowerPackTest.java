package flowerTests;

import flowers.Flower;
import flowers.FlowerPack;
import flowers.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack flowerPack;
    private Flower flower;
    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.Tulip);
        flower.setPrice(3);
        flowerPack = new FlowerPack();
        flowerPack.setFlower(flower);
        flowerPack.setAmount(4);
    }

    @Test
    void price() {
        assertEquals(12, flowerPack.getPrice());
    }

    @Test
    void getFlower() {
        assertEquals(flower, flowerPack.getFlower());
    }
}