package com.ReservaVoos.DTORequest;

import com.ReservaVoos.Domain.Destination;
import java.time.LocalDate;

public record ReservationRequestDTO(String first_name, String last_name, String document, Destination destination
, LocalDate departureDate) {
}
