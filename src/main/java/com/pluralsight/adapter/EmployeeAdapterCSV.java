package com.pluralsight.adapter;

public class EmployeeAdapterCSV implements Employee {

    private EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV employeeFromCSV) {
        this.instance = employeeFromCSV;
    }

    @Override
    public String getId() {
        return String.valueOf(instance.getId());
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getLastName();
    }

    @Override
    public String getEmail() {
        return instance.getEmail();
    }
}
