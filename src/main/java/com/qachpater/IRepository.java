package com.qachpater;

import java.util.List;

/**
 * Created by hitesh on 2/17/2019.
 */
public interface  IRepository<T> {

    T find(int i);

    void save(T t);

    void remove(int i);

    List<T> getAll();

    void update(T t);
}
