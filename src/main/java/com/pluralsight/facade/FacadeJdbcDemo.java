package com.pluralsight.facade;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class FacadeJdbcDemo {
    public static void main(String[] args) {
        JdbcFacade jdbcFacade = new JdbcFacade();
        jdbcFacade.createTable();
        log.info("Table created.");
        jdbcFacade.insertIntoTable();
        log.info("Record inserted.");

        List<Address> addresses = jdbcFacade.getAddresses();

        for (Address address : addresses) {
            log.info(address.getId() + address.getStreetName() + address.getCity());
        }
    }
}
