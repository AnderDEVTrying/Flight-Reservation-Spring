package com.ReservaVoos.Services;

import com.ReservaVoos.Domain.Destination;
import com.ReservaVoos.Domain.Reservation;
import com.ReservaVoos.Repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ReservationServices {
    @Autowired
    private ReservationRepository repository;

    public void setArrivalDate( Reservation reservation ){
        if (reservation.getDestination() == Destination.Beira){
            LocalDate arrivalDate = reservation.getDepartureDate().plusDays(1);
            reservation.setArrivalDate(arrivalDate);
        }
        if (reservation.getDestination() == Destination.Tete){
            LocalDate arrivalDate = reservation.getDepartureDate().plusDays(1);
            reservation.setArrivalDate(arrivalDate);
        }
        if (reservation.getDestination() == Destination.Nampula){
            LocalDate arrivalDate = reservation.getDepartureDate().plusDays(2);
            reservation.setArrivalDate(arrivalDate);
        }

    }
    public void validateDepartureDate(Reservation reservation)throws Exception{
        if(reservation.getDepartureDate().isBefore(LocalDate.now())){
            throw new Exception("Departure date is invalid");
        }
    }

}
