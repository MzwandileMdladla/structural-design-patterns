package com.pluralsight.flyweight;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyweightInventoryDemo {
    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();

        inventorySystem.takeOrder("Roomba", 221);
        inventorySystem.takeOrder("Bose Headphones", 361);
        inventorySystem.takeOrder("Samsung TV", 61);
        inventorySystem.takeOrder("Roomba", 222);
        inventorySystem.takeOrder("Bose Headphones", 362);
        inventorySystem.takeOrder("Samsung TV", 62);
        inventorySystem.process();

        log.info(inventorySystem.report());
    }
}
