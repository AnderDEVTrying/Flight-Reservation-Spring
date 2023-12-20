package com.ReservaVoos.DTORequest;

import com.ReservaVoos.Domain.Destination;
import com.ReservaVoos.Domain.Reservation;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record ReservationResponseDTO(Long id, String first_name, String last_name, String document
        , Destination destination, LocalDate departureTime, LocalDate arrivalTime) {
    public ReservationResponseDTO(Reservation reservation){
        this(reservation.getId(), reservation.getFirst_name(), reservation.getLast_name()
                , reservation.getDocument(),reservation.getDestination()
                , reservation.getDepartureDate(), reservation.getArrivalDate());
    }
}
