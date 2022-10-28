package com.adopcion.app.domain.services;

import com.adopcion.app.domain.entities.Mascota;

import java.util.List;

public interface MascotaService {

    public List<Mascota> listar();

    void registrarMascota(Mascota mascota);
}
