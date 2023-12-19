package com.ReservaVoos.Controller;

import com.ReservaVoos.DTORequest.ReservationRequestDTO;
import com.ReservaVoos.DTORequest.ReservationResponseDTO;
import com.ReservaVoos.Domain.Reservation;
import com.ReservaVoos.Repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reservation")
public class ReservationController {
    @Autowired
    private ReservationRepository repository;
    @GetMapping
    public List<ReservationResponseDTO> getAll(){
        List<ReservationResponseDTO> reservationlist = repository.findAll().stream().map(ReservationResponseDTO::new)
                .toList();
        return reservationlist;
    }
    @PostMapping
    public void saveReservationData(@RequestBody ReservationRequestDTO data){
        Reservation reservationData = new Reservation(data);
        repository.save(reservationData);
        return;
    }
}
