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
public class Client {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String code;
  private String nom;
  private String prenom;
  private String email;
  private String telephone;

  @OneToMany(mappedBy = "client")
  private List<Reservation> reservations;

  @OneToMany(mappedBy = "client")
  private List<Extras> extras;

  @OneToOne
  private Tarification tarification;


 }
