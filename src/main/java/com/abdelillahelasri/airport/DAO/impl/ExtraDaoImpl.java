package com.abdelillahelasri.airport.DAO.impl;

import com.abdelillahelasri.airport.DAO.ExtraDao;
import com.abdelillahelasri.airport.entites.Extras;
import jakarta.persistence.Query;

import java.util.List;

public class ExtraDaoImpl implements ExtraDao {
    @Override
    public Extras save(Extras Extras) {
        try{
            transaction.begin();
            em.persist(Extras);
            transaction.commit();
        }catch (Exception e){
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            em.close();

            emf.close();
        }
        return Extras;
    }

    @Override
    public Extras update(Extras Extras) {
        try {
            transaction.begin();
            em.find(Extras.class, Extras.getId());
            em.merge(Extras);
            transaction.commit();
        } catch (Exception e){
            if (transaction != null && transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
        return Extras;
    }

    @Override
    public void delete(int id) {
        try {
            transaction.begin();
            Extras Extras = em.find(Extras.class, id);
            em.remove(Extras);
            transaction.commit();
        }catch (Exception e){
            if (transaction != null && transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }

    @Override
    public Extras getOne(int id) {
        Extras Extras = null;
        try {
            transaction.begin();
            Extras = em.find(Extras.class, id);
            transaction.commit();
        } catch (Exception e){
            if (transaction != null && transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
        return Extras;
    }

    @Override
    public List<Extras> getAll() {
        String jpql = "SELECT e FROM Extras e";
        Query query = null;
        transaction.begin();
        query = em.createQuery(jpql);
        transaction.commit();
        @SuppressWarnings("unchecked")
        List<Extras> records = query.getResultList();
        return records;
    }
}
