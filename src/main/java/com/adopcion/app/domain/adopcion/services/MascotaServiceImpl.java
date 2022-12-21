package com.adopcion.app.domain.adopcion.services;

import com.adopcion.app.domain.adopcion.entities.Mascota;
import com.adopcion.app.infraestructure.adopcion.MascotaRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MascotaServiceImpl implements MascotaService {

    @Autowired
    private MascotaRepositoryImpl mascotaRepository;
    @Override
    public List<Mascota> listar() {

        return mascotaRepository.listar();
    }

    @Override
    public void registrarMascota(Mascota mascota) {
        mascota.setEstado(true);
        mascotaRepository.registrar(mascota);
    }

    @Override
    public Mascota buscar(Integer idMascota) {
        return mascotaRepository.buscar(idMascota);
    }

    @Override
    public void eliminar(Integer idMascota) {
        mascotaRepository.eliminarMascota(idMascota);
    }

    @Override
    public Mascota editar(Mascota mascota) {
        return mascotaRepository.actualizar(mascota);
    }

    @Override
    public List<Mascota> listarMascotasDisponibles() {

        return mascotaRepository.listar().stream().filter(m->m.getEstado()).collect(Collectors.toList());
    }


}
