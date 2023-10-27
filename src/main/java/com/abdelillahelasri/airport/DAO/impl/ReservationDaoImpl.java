package com.abdelillahelasri.airport.DAO.impl;

import com.abdelillahelasri.airport.DAO.ReservationDao;
import com.abdelillahelasri.airport.entites.Reservation;
import jakarta.persistence.Query;

import java.util.List;

public class ReservationDaoImpl implements ReservationDao {
    @Override
    public Reservation save(Reservation reservation) {
        try{
            transaction.begin();
            em.persist(reservation);
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
        return reservation;
    }

    @Override
    public Reservation update(Reservation reservation) {
        try {
            transaction.begin();
            em.find(Reservation.class, reservation.getId());
            em.merge(reservation);
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
        return reservation;
    }

    @Override
    public void delete(int id) {
        try {
            transaction.begin();
            Reservation reservation = em.find(Reservation.class, id);
            em.remove(reservation);
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
    public Reservation getOne(int id) {
        Reservation reservation = null;
        try {
            transaction.begin();
            reservation = em.find(Reservation.class, id);
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
        return reservation;
    }

    @Override
    public List<Reservation> getAll() {
        String jpql = "SELECT e FROM Reservation e";
        Query query = null;
        transaction.begin();
        query = em.createQuery(jpql);
        transaction.commit();
        @SuppressWarnings("unchecked")
        List<Reservation> records = query.getResultList();
        return records;
    }

    @Override
    public void getCountReservationValid() {

    }

    @Override
    public void getCountReservationCancel() {

    }
}
