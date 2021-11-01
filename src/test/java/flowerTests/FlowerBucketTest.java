package flowerTests;

import flowers.Flower;
import flowers.FlowerBucket;
import flowers.FlowerPack;
import flowers.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private FlowerBucket flowerBucket;
    private FlowerPack packOfChamomiles;

    @BeforeEach
    void setUp() {
        FlowerPack packOfRoses = new FlowerPack();
        Flower rose = new Flower(FlowerType.Rose);
        rose.setPrice(5);
        packOfRoses.setFlower(rose);
        packOfRoses.setAmount(10);
        packOfChamomiles = new FlowerPack();
        Flower chamomile = new Flower(FlowerType.Chamomile);
        chamomile.setPrice(3);
        packOfChamomiles.setFlower(chamomile);
        packOfChamomiles.setAmount(12);
        flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(packOfRoses);

    }

    @Test
    void addFlowerPack() {
        assertEquals(1, flowerBucket.flowerPacks.size());
        flowerBucket.addFlowerPack(packOfChamomiles);
        assertEquals(2, flowerBucket.flowerPacks.size());
    }

    @Test
    void price() {
        // 5 * 10 -> roses
        assertEquals(50, flowerBucket.getPrice());
    }
}