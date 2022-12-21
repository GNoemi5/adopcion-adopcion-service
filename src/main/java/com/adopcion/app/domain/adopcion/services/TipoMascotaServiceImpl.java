package com.adopcion.app.domain.adopcion.services;

import com.adopcion.app.domain.adopcion.entities.Mascota;
import com.adopcion.app.domain.adopcion.entities.TipoMascota;
import com.adopcion.app.infraestructure.adopcion.MascotaRepositoryImpl;
import com.adopcion.app.infraestructure.adopcion.TipoMascotaRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TipoMascotaServiceImpl implements TipoMascotaService {

    @Autowired
    private TipoMascotaRepositoryImpl tipoMascotaRepository;
    @Override
    public List<TipoMascota> listar() {

        return tipoMascotaRepository.listar();
    }


}
