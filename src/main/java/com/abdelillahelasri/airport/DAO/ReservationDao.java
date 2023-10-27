package com.abdelillahelasri.airport.DAO;

import com.abdelillahelasri.airport.entites.Reservation;

public interface ReservationDao extends DAO<Reservation>{
    void getCountReservationValid();
    void getCountReservationCancel();
}
