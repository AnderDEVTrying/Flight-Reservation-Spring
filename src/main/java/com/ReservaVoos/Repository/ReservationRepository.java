package com.ReservaVoos.Repository;

import com.ReservaVoos.Domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> { }
