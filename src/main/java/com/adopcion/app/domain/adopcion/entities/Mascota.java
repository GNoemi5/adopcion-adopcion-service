package com.adopcion.app.domain.adopcion.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="mascotas")
@Getter
@Setter
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="idMascota")
    private Integer id;

    @Column(name="name")
    private String nombre;

    @Column(name="race")
    private String raza;

    @Column(name="birthDate")
    private Date fechaNacimiento;


    @ManyToOne(fetch = FetchType.EAGER)
    private TipoMascota tipoMascota;

    @Column(name="health")
    private String salud;

    @Column(name="state")
    private Boolean estado;

    @Column(name="foto")
    private String foto;

    @Column (name="descripcion")
    private String descripcion;


}

