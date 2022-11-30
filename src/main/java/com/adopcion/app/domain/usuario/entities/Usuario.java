package com.adopcion.app.domain.usuario.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCuenta")
    private Integer id;

    @Column(name = "correo")
    private String correo;

    @Column(name = "password")
    private String password;
}
