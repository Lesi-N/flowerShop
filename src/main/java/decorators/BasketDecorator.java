package decorators;

import flowers.Item;

public class BasketDecorator extends ItemDecorator {

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 4 + super.getPrice();
    }

    @Override
    public String getDescription() {
        return "Basket Decorator";
    }
}
