package com.adopcion.app.domain.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="usuario")
@Getter
@Setter
public class Cuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idCuenta")
    private Integer id;

    @Column (name="correo")
    private String correo;

    @Column (name = "password")
    private String password;
}
