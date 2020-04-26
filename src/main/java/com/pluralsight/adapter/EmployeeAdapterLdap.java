package com.pluralsight.adapter;

public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap employeeFromLdap) {
        this.instance = employeeFromLdap;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    public String toString() {
        return "id=" + instance.getCn() + ", firstName=" + instance.getGivenName() + ", lastName=" + instance.getSurname() + ", email=" + instance.getMail();
    }
}
