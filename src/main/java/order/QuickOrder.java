package order;

import decorators.RibbonDecorator;
import delivery.DHLDeliveryStrategy;
import delivery.Delivery;
import flowers.Flower;
import flowers.FlowerBucket;
import flowers.FlowerPack;
import flowers.FlowerType;
import payment.PayPalPaymentStrategy;
import payment.Payment;
import users.Receiver;
import users.Sender;

public enum QuickOrder {
    Rose_BUCKET, Chamomile_BUCKET, Tulip_BUCKET;

    public static Order createOrder(QuickOrder quickOrder) {
        Order order = new Order();

        Sender sender = new Sender();
        Receiver receiver = new Receiver();

        Delivery delivery = new DHLDeliveryStrategy();
        Payment payment = new PayPalPaymentStrategy();

        Flower flower;
        FlowerPack pack = new FlowerPack();
        FlowerBucket bucket = new FlowerBucket();

        if(quickOrder == Rose_BUCKET) {
            flower = new Flower(FlowerType.Rose);
            flower.setPrice(15);

        } else if (quickOrder == Chamomile_BUCKET) {
            flower = new Flower(FlowerType.Chamomile);
            flower.setPrice(7);
        } else if (quickOrder == Tulip_BUCKET) {
            flower = new Flower(FlowerType.Tulip);
            flower.setPrice(10);
        } else {
            System.out.println("This item is unavailable");
            return order;
        }

        pack.setFlower(flower);
        pack.setAmount(12);
        bucket.addFlowerPack(pack);
        RibbonDecorator ribbonDecorator = new RibbonDecorator(bucket);

        order.addItem(ribbonDecorator);
        order.addUser(receiver);
        order.addUser(sender);
        order.setDeliveryStrategy(delivery);
        order.setPaymentStrategy(payment);

        return order;
    }

}
