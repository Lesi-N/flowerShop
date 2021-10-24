import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class FlowerBucket {
    List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();
    public double price() {
        double price = 0;
        for (int i = 0; i < flowerPacks.size(); i++) {
            price += flowerPacks.get(i).price();
        }
        return price;
    }
    public void addFlowerPack(FlowerPack flowerpack) {
        flowerPacks.add(flowerpack);
    }
}
