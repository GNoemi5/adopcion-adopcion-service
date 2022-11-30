package com.adopcion.app.domain.adopcion.repositories;

import com.adopcion.app.domain.adopcion.entities.Mascota;

import java.util.List;

public interface MascotaRepository {
    List<Mascota> listar();
    void registrar(Mascota mascota);

    Mascota buscar(Integer idMascota);

    void eliminarMascota(Integer idMascota);

    Mascota actualizar(Mascota mascota);
}
