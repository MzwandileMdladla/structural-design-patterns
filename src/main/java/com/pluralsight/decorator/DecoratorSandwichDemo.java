package com.pluralsight.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoratorSandwichDemo {

    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        log.info(sandwich.make());
    }
}
