package com.pluralsight.flyweight;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Order {
    private final int orderNumber;
    private final Item item;

    Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    void processOrder() {
        log.info("Ordering " + item + " for order number " + orderNumber);
    }
}
