package com.pluralsight.facade;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class Address {
    private String id;
    private String streetName;
    private String city;
}
