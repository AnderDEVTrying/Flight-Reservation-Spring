package com.ReservaVoos.DTORequest;

import com.ReservaVoos.Domain.Destination;
import com.ReservaVoos.Domain.Reservation;
import com.ReservaVoos.Util.DateUtil;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

public record ReservationResponseDTO(Long id, String first_name, String last_name, String document
        , Destination destination, LocalDateTime departureTime, LocalDateTime arrivalTime) {
    public ReservationResponseDTO(Reservation reservation){
        this(reservation.getId(), reservation.getFirst_name(), reservation.getLast_name()
                , reservation.getDocument(),reservation.getDestination()
                , reservation.getDepartureTime(), reservation.getArrivalTime());
    }
}
