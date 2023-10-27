package com.abdelillahelasri.airport.entites;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Extras {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String typeExtra;
  private double tarif;

  @ManyToMany(mappedBy = "extras")
  private List<Reservation> reservations;
  @ManyToOne
  private Client client;
}
