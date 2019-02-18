package com.qachpater.model;

/**
 * Created by hitesh on 2/17/2019.
 */
public abstract class HumanResourse {

    private String name;
    private String lastName;
    private String doj;
    private String employeeType;

    public HumanResourse(String name, String lastName, String doj, String employeeType) {
        this.name = name;
        this.lastName = lastName;
        this.doj = doj;
        this.employeeType = employeeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
}
