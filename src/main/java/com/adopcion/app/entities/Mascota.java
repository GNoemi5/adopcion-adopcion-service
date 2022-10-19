package com.adopcion.app.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name="mascota")
@Getter
@Setter
public class Mascota {
    @Id
    @Column (name="id")
    private Integer id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="raza")
    private String raza;

    @Column(name="fechaNacimiento")
    private Date fechaNacimiento;

}

