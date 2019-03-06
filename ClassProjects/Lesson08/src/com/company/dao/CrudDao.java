package com.company.dao;

public interface CrudDao<T> {
    //Create
    T save(T model);

    //Read
    T find(Long id);

    //Update
    void update(T model);

    //Delete
    void delete(Long id);
}
