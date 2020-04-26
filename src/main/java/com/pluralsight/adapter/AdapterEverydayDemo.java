package com.pluralsight.adapter;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class AdapterEverydayDemo {

    public static void main(String[] args) {
        Integer[] arrayOfInts = new Integer[] {42, 43, 44};
        List<Integer> listOfInts = Arrays.asList(arrayOfInts);

        log.info(String.valueOf(arrayOfInts));
        log.info(String.valueOf(listOfInts));
    }
}
