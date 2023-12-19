package com.ReservaVoos.Domain;

import jakarta.persistence.*;

@Entity(name = "reservations")
@Table(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firts_name;
    private String last_name;
    @Column(unique = true)
    private String document;
    private Destination destination;

}
