package com.ReservaVoos.DTORequest;

import com.ReservaVoos.Domain.Destination;
import com.ReservaVoos.Util.DateUtil;

import java.time.LocalDateTime;

public record ReservationRequestDTO(String first_name, String last_name, String document, Destination destination
, LocalDateTime departureTime) {
}
