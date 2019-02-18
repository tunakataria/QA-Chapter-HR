package com.qachpater.model;

/**
 * Created by hitesh on 2/17/2019.
 */
public class Employee extends HumanResourse {

    private Technology tech;
    private String projectName;
    private Boolean billable;
    int leaveBalance;
    Manager manager;
    private int leaves=21;

    public Employee(String name, String lastName, String doj, String employeeType) {
        super(name, lastName, doj, employeeType);
    }

    public Technology getTech() {
        return tech;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void setTech(Technology tech) {

        this.tech = tech;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Boolean getBillable() {
        return billable;
    }

    public void setBillable(Boolean billable) {
        this.billable = billable;
    }

    public int getLeaveBalance() {
        return leaveBalance;
    }

    public void setLeaveBalance(int leaveBalance) {
        this.leaveBalance = leaveBalance;
    }

    public void  updateLeaves(int leaveTaken){
        leaves=leaves-leaveTaken;
    }
}
