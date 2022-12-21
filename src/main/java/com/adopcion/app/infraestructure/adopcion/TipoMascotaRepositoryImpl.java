package com.adopcion.app.infraestructure.adopcion;

import com.adopcion.app.domain.adopcion.entities.TipoMascota;
import com.adopcion.app.domain.adopcion.repositories.TipoMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TipoMascotaRepositoryImpl implements TipoMascotaRepository {

    @Autowired private TipoMascotaJpaRepository tipoMascotaJpaRepository;

    @Override
    public List<TipoMascota> listar() {
        return tipoMascotaJpaRepository.findAll();
    }

}
