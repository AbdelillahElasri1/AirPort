package com.abdelillahelasri.airport.services;

import com.abdelillahelasri.airport.entites.Reservation;

public interface ReservationService extends Service<Reservation> {
    void getCountReservationValid();
    void getCountReservationCancel();
}
