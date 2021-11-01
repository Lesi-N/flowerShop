package flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class FlowerPack extends Item{
    private Flower flower;
    private double amount;

    public double getPrice() {
        return flower.getPrice() * amount;
    }

    @Override
    public String getDescription() {
        return flower.getFlowertype() + " pack";
    }
}
