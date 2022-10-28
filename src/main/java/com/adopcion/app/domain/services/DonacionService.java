package com.adopcion.app.domain.services;

import com.adopcion.app.domain.entities.Donacion;

import java.util.List;

public interface DonacionService {

    public List<Donacion> listar();

    void registrarDonacion(Donacion donacion);
}
