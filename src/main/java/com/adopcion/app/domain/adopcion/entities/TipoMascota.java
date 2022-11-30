package com.adopcion.app.domain.adopcion.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class TipoMascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="descripcion")
    private String descripcion;

}
