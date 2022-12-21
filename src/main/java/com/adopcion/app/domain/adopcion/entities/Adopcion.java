package com.adopcion.app.domain.adopcion.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="adopcion")
public class Adopcion {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "mascota_id_mascota")
    private Mascota mascota;

    @Column(name="nombreUsuario")
    private String nombreUsuario;

    @Column(name="fechaAdopcion")
    private Date fechaAdopcion;

}
