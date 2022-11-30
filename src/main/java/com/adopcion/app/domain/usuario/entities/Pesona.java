package com.adopcion.app.domain.usuario.entities;

import javax.persistence.*;

@Entity
@Table(name="adopcion")
public class Pesona {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}
