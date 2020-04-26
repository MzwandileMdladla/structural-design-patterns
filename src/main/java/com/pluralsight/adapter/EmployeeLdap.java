package com.pluralsight.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@AllArgsConstructor
public class EmployeeLdap {

    private String cn;
    private String surname;
    private String givenName;
    private String mail;
}
