import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Object> items = new ArrayList<>();

    public boolean search(Flower flower) {
        int finds = 0;
        for (int i = 0; i < items.size(); i++) {
            Object item = items.get(i);
            if (item instanceof Flower && ((Flower) item).getFlowertype() == flower.getFlowertype()) {
                System.out.println(item);
                finds++;
            } else if (item instanceof FlowerPack &&
                    ((FlowerPack) item).getFlower().getFlowertype() == flower.getFlowertype()){
                System.out.println(item);
                finds++;
            } else if (item instanceof FlowerBucket){
                for (int j = 0; j < ((FlowerBucket) item).flowerPacks.size(); j++) {
                    FlowerPack pack = ((FlowerBucket) item).flowerPacks.get(j);
                    if (pack.getFlower().getFlowertype() == flower.getFlowertype()) {
                        System.out.println(item);
                        finds++;
                    }
                }
            }
        }
        return finds > 0;
    }

    public void addItem(Object flowers) {
        items.add(flowers);
    }
}
