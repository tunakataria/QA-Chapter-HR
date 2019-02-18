package com.qachpater.repository;

import com.qachpater.IRepository;
import com.qachpater.model.Manager;

import java.util.HashMap;
import java.util.List;

/**
 * Created by hitesh on 2/17/2019.
 */
public class ManagerRespository implements IRepository<Manager> {

    HashMap<Integer, Manager> managerHashMap = new HashMap<Integer, Manager>();

    public Manager find(int i) {
        return null;
        //TODO Implement the logic to find the Manager from managerHasMap on the basis of unique integer id.
    }

    public void save(Manager manager) {
        //TODO implement the logic of saving the manager object passed as argument in this method and save it int managerHasMap
    }

    public void remove(int i) {
        //TODO remove the mangaer from the managerHasMap on the basis of unique id provided as the argument i
    }

    public List<Manager> getAll() {
        return null;
        //TODO return all managers from managerHasMap as a list
    }

    public void update(Manager manager) {
        //TODO implement the maethod which takes the mangers as argument and find this manager using it's id and update the manager object in managerHasMap
    }
}
