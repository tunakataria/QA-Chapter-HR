package com.qachpater.repository;

import com.qachpater.IRepository;
import com.qachpater.model.Employee;

import java.util.HashMap;
import java.util.List;

/**
 * Created by hitesh on 2/17/2019.
 */
public class EmployeeRespository implements IRepository<Employee> {

    HashMap<Integer, Employee> employeeHashMap = new HashMap<Integer, Employee>();
    public Employee find(int i) {
        return null;
    }

    public void save(Employee employee) {

    }

    public void remove(int i) {

    }

    public List<Employee> getAll() {
        return null;
    }

    public void update(Employee employee) {

    }
}
