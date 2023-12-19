package com.ReservaVoos.Services;

import com.ReservaVoos.DTORequest.ReservationRequestDTO;
import com.ReservaVoos.Repository.ReservationRepository;
import com.ReservaVoos.Util.DateUtil;
import org.springframework.stereotype.Service;

@Service
public class ReservationServices {
    private ReservationRepository repository;
    private DateUtil date;
    public ReservationServices(ReservationRepository repository){
        this.repository = repository;
    }

}
