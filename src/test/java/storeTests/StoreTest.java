package storeTests;

import flowers.Flower;
import flowers.FlowerBucket;
import flowers.FlowerPack;
import flowers.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import store.Store;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Store store;
    @BeforeEach
    void setUp() {
        Flower rose = new Flower(FlowerType.Rose);
        Flower tulip = new Flower(FlowerType.Tulip);
        FlowerPack rosePack = new FlowerPack();
        rosePack.setFlower(rose);
        FlowerPack tulipPack = new FlowerPack();
        tulipPack.setFlower(tulip);
        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowerPack(rosePack);
        bucket.addFlowerPack(tulipPack);

        store = new Store();
        store.addItem(rose);
        store.addItem(tulipPack);
        store.addItem(bucket);
    }

    @Test
    void search() {
        Flower rose = new Flower(FlowerType.Rose);
        assertTrue(store.search(rose));

        Flower chamomile = new Flower(FlowerType.Chamomile);
        assertFalse(store.search(chamomile));
    }
}