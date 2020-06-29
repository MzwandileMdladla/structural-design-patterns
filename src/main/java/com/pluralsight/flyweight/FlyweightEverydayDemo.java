package com.pluralsight.flyweight;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyweightEverydayDemo {
    public static void main(String[] args) {

        Integer firstInt = 5;
        Integer secondInt = 5;
        Integer thirdInt = 10;

        log.info(String.valueOf(System.identityHashCode(firstInt)));
        log.info(String.valueOf(System.identityHashCode(secondInt)));
        log.info(String.valueOf(System.identityHashCode(thirdInt)));
    }
}
