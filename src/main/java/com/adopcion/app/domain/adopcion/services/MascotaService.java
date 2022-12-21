package com.adopcion.app.domain.adopcion.services;

import com.adopcion.app.domain.adopcion.entities.Mascota;

import java.util.List;

public interface MascotaService {

    List<Mascota> listar();

    void registrarMascota(Mascota mascota);

    Mascota buscar(Integer idMascota);

    void eliminar(Integer idMascota);

    Mascota editar(Mascota mascota);

    List<Mascota> listarMascotasDisponibles();
}
