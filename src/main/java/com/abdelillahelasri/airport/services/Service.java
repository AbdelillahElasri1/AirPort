package com.abdelillahelasri.airport.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public interface Service<T> {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();
    EntityTransaction transaction = em.getTransaction();
    T save(T t);
    T update(T t);
    void delete(int id);
    T getOne(int id);
    List<T> getAll();
}
