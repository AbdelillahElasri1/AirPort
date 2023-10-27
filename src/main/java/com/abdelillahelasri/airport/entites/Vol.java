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
public class Vol {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String numeroVol;
  private String villeDepart;
  private String villeArrivee;
  private String heureDepart;
  private String heureArrivee;
  private Date dateDepart;
  private Date dateArrivee;
  private int nombrePlacesDisponibles;

  @OneToMany
  private List<Escale> escale;

  @ManyToOne
  private Admin admin;
}