package com.abdelillahelasri.airport.services.Impl;

import com.abdelillahelasri.airport.DAO.ReservationDao;
import com.abdelillahelasri.airport.entites.Reservation;
import com.abdelillahelasri.airport.services.ReservationService;
import jakarta.inject.Inject;

import java.util.List;

public class ReservationServiceImpl implements ReservationService {
    @Inject
    private ReservationDao reservationDao;
    @Override
    public void getCountReservationValid() {

    }

    @Override
    public void getCountReservationCancel() {

    }

    @Override
    public Reservation save(Reservation reservation) {
        if (reservationDao.save(reservation) != null){
            return reservation;
        } else {
            return null;
        }
    }

    @Override
    public Reservation update(Reservation reservation) {
        if (reservationDao.update(reservation) != null){
            return reservation;
        } else {
            return null;
        }
    }

    @Override
    public void delete(int id) {
        reservationDao.delete(id);
    }

    @Override
    public Reservation getOne(int id) {
        Reservation reservation = reservationDao.getOne(id);
        if (reservation != null){
            return reservation;
        } else {
            return null;
        }
    }

    @Override
    public List<Reservation> getAll() {
        List<Reservation> reservationList = reservationDao.getAll();
        if (reservationList != null){
            return reservationList;
        } else  {
            return null;
        }
    }
}
