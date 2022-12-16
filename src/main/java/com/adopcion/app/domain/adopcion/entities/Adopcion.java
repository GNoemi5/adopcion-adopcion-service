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

    @Column(name="nombreMascota")
    private String nombreMascota;

    @Column(name="nombreUsuario")
    private String nombreUsuario;


    @Column(name="tipoMascota")
    private String tipoMascota;

    @Column(name="fechaAdopcion")
    private Date fechaAdopcion;



}
