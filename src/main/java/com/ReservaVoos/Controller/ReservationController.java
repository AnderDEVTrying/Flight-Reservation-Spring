package com.ReservaVoos.Controller;

import com.ReservaVoos.DTORequest.ReservationRequestDTO;
import com.ReservaVoos.DTORequest.ReservationResponseDTO;
import com.ReservaVoos.Domain.Reservation;
import com.ReservaVoos.Repository.ReservationRepository;
import com.ReservaVoos.Services.ReservationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reservation")
public class ReservationController {
    @Autowired
    private ReservationRepository repository;
    @Autowired
    private ReservationServices reservationServices;
    @GetMapping
    public List<ReservationResponseDTO> getAll(){
        List<ReservationResponseDTO> reservationlist = repository.findAll().stream().map(ReservationResponseDTO::new)
                .toList();
        return reservationlist;
    }
    @PostMapping
    public ReservationRequestDTO saveReservationData(@RequestBody ReservationRequestDTO data) throws Exception {
        Reservation reservationData = new Reservation(data);
        reservationServices.validateDepartureDate(reservationData);
        reservationServices.setArrivalDate(reservationData);
        repository.save(reservationData);
        return data;
    }
}
