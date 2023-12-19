package com.ReservaVoos.Controller;

import com.ReservaVoos.Domain.Reservation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("reservation")
public class ReservationController {
    @GetMapping
    public void getAll(){
        Reservation reservation;
    }
}
