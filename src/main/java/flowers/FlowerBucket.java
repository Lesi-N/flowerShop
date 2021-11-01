package flowers;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class FlowerBucket extends Item {
    public List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();
    public double getPrice() {
        double price = 0;
        for (int i = 0; i < flowerPacks.size(); i++) {
            price += flowerPacks.get(i).getPrice();
        }
        return price;
    }

    @Override
    public String getDescription() {
        String desc = "";

        for (int i = 0; i < flowerPacks.size(); i++) {
            desc += flowerPacks.get(i).getDescription();
        }
        return "Flowerbucket: " + desc;
    }

    public void addFlowerPack(FlowerPack flowerpack) {
        flowerPacks.add(flowerpack);
    }
}
