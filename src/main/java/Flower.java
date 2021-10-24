import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter @Setter @ToString
public class Flower {
    private double price;
    private double sepalLength;
    private int[] color;
    private FlowerType flowertype;

    public void setColor(int[] color) {
        this.color = Arrays.copyOf(color, color.length);
    }

    public Flower(FlowerType flowertype) {
        this.flowertype = flowertype;
    }
}
