package com.abdelillahelasri.airport.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Reservation {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String numeroReservation;
  private Date dateReservation;
  private String statut;
  private double fraisAnnulation;

  @ManyToOne
  private Client client;

  @ManyToOne
  private Vol vol;

  @ManyToMany
  private List<Extras> extras;
}
