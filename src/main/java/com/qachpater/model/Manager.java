package com.qachpater.model;

import java.util.List;

/**
 * Created by hitesh on 2/17/2019.
 */
public class Manager extends HumanResourse {
    int mangingPeople;
    List<String> mangingProjects;
    List<Employee> employeedUnderManger;

    public List<Employee> getEmployeedUnderManger() {
        return employeedUnderManger;
    }

    public void setEmployeedUnderManger(List<Employee> employeedUnderManger) {
        this.employeedUnderManger = employeedUnderManger;
    }

    public Manager(String name, String lastName, String doj, String employeeType) {
        super(name, lastName, doj, employeeType);
    }

    public int getMangingPeople() {
        return mangingPeople;
    }

    public void setMangingPeople(int mangingPeople) {
        this.mangingPeople = mangingPeople;
    }

    public List<String> getMangingProjects() {
        return mangingProjects;
    }

    public void setMangingProjects(List<String> mangingProjects) {
        this.mangingProjects = mangingProjects;
    }
}
