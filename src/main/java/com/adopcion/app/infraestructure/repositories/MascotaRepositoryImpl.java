package com.adopcion.app.infraestructure.repositories;

import com.adopcion.app.domain.entities.Mascota;
import com.adopcion.app.domain.repositories.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MascotaRepositoryImpl implements MascotaRepository {

    @Autowired private MascotaJpaRepository mascotaJpaRepository;

    @Override
    public List<Mascota> listar() {
        return mascotaJpaRepository.findAll();
    }

    @Override
    public void registrar(Mascota mascota) {
        mascotaJpaRepository.save(mascota);
    }

    @Override
    public Mascota buscar(Integer idMascota) {
        return null;
    }

    @Override
    public void eliminarMascota(Integer idMascota) {

    }

    @Override
    public Mascota actualizar(Mascota mascota) {
        return null;
    }


}
