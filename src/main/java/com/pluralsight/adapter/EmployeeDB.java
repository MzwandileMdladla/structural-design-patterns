package com.pluralsight.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@Data
@AllArgsConstructor
public class EmployeeDB implements Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
}
