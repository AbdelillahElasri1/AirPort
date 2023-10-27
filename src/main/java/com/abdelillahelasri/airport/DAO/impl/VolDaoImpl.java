package com.abdelillahelasri.airport.DAO.impl;

import com.abdelillahelasri.airport.DAO.VolDao;
import com.abdelillahelasri.airport.DAO.VolDao;
import com.abdelillahelasri.airport.entites.Vol;
import com.abdelillahelasri.airport.entites.Vol;
import jakarta.persistence.Query;

import java.util.List;

public class VolDaoImpl implements VolDao {
    @Override
    public Vol save(Vol vol) {
        try{
            transaction.begin();
            em.persist(vol);
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
        return vol;
    }

    @Override
    public Vol update(Vol Vol) {
        try {
            transaction.begin();
            em.find(Vol.class, Vol.getId());
            em.merge(Vol);
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
        return Vol;
    }

    @Override
    public void delete(int id) {
        try {
            transaction.begin();
            Vol Vol = em.find(Vol.class, id);
            em.remove(Vol);
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
    public Vol getOne(int id) {
        Vol Vol = null;
        try {
            transaction.begin();
            Vol = em.find(Vol.class, id);
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
        return Vol;
    }

    @Override
    public List<Vol> getAll() {
        String jpql = "FROM Vol";
        Query query = null;
            transaction.begin();
            query = em.createQuery(jpql);
            transaction.commit();
        @SuppressWarnings("unchecked")
        List<Vol> records = query.getResultList();
        return records;
    }
}
