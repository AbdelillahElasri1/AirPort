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
public class SocieteConventione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomSocieteConventione;

    @ManyToMany(mappedBy = "societesConventione")
    private List<TransportAerien> transportAeriens;
}
