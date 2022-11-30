package com.adopcion.app.domain.donacion.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "donacion")
@Getter
@Setter
public class Donacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="idDonacion")
    private Integer id;

    @Column (name="fechaEntrada")
    private Date fechaEntrada;

    @Column (name="hora")
    private String hora;

    @Column (name="tipo")
    private String tipo;
}
