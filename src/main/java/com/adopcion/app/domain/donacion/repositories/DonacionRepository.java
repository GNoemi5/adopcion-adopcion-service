package com.adopcion.app.domain.donacion.repositories;

import com.adopcion.app.domain.donacion.entities.Donacion;

import java.util.List;

public interface DonacionRepository {
    List<Donacion> listar();
    void registrar(Donacion donacion);
    Donacion buscar(Integer idDonacion);
}
