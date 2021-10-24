import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class FlowerPack {
    private Flower flower;
    private double amount;

    public double price() {
        return flower.getPrice() * amount;
    }

}
