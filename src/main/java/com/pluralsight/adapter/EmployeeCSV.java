package com.pluralsight.adapter;

import lombok.Getter;

import java.util.StringTokenizer;

@Getter
public class EmployeeCSV {

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeCSV(String values) {
        StringTokenizer tokenizer = new StringTokenizer(values, ",");
        if (tokenizer.hasMoreElements()) {
            id = Integer.parseInt(tokenizer.nextToken());
        }

        if (tokenizer.hasMoreElements()) {
            firstName = (String) tokenizer.nextElement();
        }

        if (tokenizer.hasMoreElements()) {
            lastName = (String) tokenizer.nextElement();
        }

        if (tokenizer.hasMoreElements()) {
            email = (String) tokenizer.nextElement();
        }
    }
}
