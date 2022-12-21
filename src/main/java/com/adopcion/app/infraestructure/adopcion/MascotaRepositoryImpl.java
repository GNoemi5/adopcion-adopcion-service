package com.adopcion.app.infraestructure.adopcion;

import com.adopcion.app.domain.adopcion.entities.Mascota;
import com.adopcion.app.domain.adopcion.repositories.MascotaRepository;
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

        return mascotaJpaRepository.findById(idMascota).orElse(null);
    }

    @Override
    public void eliminarMascota(Integer idMascota) {
        Mascota mascotaDb = this.buscar(idMascota);
        mascotaDb.setEstado(false);
        mascotaJpaRepository.save(mascotaDb);
    }

    @Override
    public Mascota actualizar(Mascota mascota) {
        Mascota mascotaDb = this.buscar(mascota.getId());
        mascotaDb.setNombre(mascota.getNombre());
        mascotaDb.setRaza(mascota.getRaza());
        mascotaDb.setTipoMascota(mascota.getTipoMascota());
        mascotaDb.setFechaNacimiento(mascota.getFechaNacimiento());
        mascotaDb.setFoto(mascota.getFoto());
        mascotaDb.setDescripcion(mascota.getDescripcion());
        mascotaJpaRepository.save(mascotaDb);
        return mascotaDb;

    }


}
