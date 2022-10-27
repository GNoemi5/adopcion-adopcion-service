package com.adopcion.app.domain.services;

import com.adopcion.app.domain.entities.Mascota;
import com.adopcion.app.infraestructure.repositories.MascotaRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaServiceImpl implements MascotaService {

    @Autowired
    private MascotaRepositoryImpl MascotaRepository;
    @Override
    public List<Mascota> listar() {

        return null;
    }

    @Override
    public void registrarMascota(Mascota mascota) {
        
    }
}
