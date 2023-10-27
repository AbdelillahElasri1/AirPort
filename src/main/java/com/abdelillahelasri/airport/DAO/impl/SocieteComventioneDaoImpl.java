package com.abdelillahelasri.airport.DAO.impl;

import com.abdelillahelasri.airport.DAO.SocieteConventioneDoa;
import com.abdelillahelasri.airport.entites.SocieteConventione;
import com.abdelillahelasri.airport.entites.Vol;
import jakarta.persistence.Query;

import java.util.List;

public class SocieteComventioneDaoImpl implements SocieteConventioneDoa {
    @Override
    public SocieteConventione save(SocieteConventione societeConventione) {
        try{
            transaction.begin();
            em.persist(societeConventione);
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
        return societeConventione;
    }

    @Override
    public SocieteConventione update(SocieteConventione societeConventione) {
        try {
            transaction.begin();
            em.find(SocieteConventione.class, societeConventione.getId());
            em.merge(societeConventione);
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
        return societeConventione;
    }

    @Override
    public void delete(int id) {
        try {
            transaction.begin();
            SocieteConventione societeConventione = em.find(SocieteConventione.class, id);
            em.remove(societeConventione);
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
    public SocieteConventione getOne(int id) {
        SocieteConventione societeConventione = null;
        try {
            transaction.begin();
            societeConventione = em.find(SocieteConventione.class, id);
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
        return societeConventione;
    }

    @Override
    public List<SocieteConventione> getAll() {
        String jpql = "FROM SocieteConventione";
        Query query = null;
        transaction.begin();
        query = em.createQuery(jpql);
        transaction.commit();
        @SuppressWarnings("unchecked")
        List<SocieteConventione> records = query.getResultList();
        return records;
    }
}
