package decorators;

import flowers.Item;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 13 + super.getPrice();
    }

    @Override
    public String getDescription() {
        return String.format("Paper Decorator for %s", getItem().getDescription());
    }
}
