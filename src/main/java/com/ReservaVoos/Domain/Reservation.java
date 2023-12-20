package com.ReservaVoos.Domain;

import com.ReservaVoos.DTORequest.ReservationRequestDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity(name = "reservations")
@Table(name = "reservations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String first_name;
    private String last_name;
    @Column(unique = true)
    private String document;
    @Enumerated(EnumType.STRING)
    private Destination destination;
    private LocalDate departureDate;
    private LocalDate arrivalDate;

    public Reservation(ReservationRequestDTO data){
        this.first_name = data.first_name();
        this.last_name = data.last_name();
        this.document = data.document();
        this.destination = data.destination();
        this.departureDate = data.departureDate();
    }

}
