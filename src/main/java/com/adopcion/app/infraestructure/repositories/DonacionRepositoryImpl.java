package com.adopcion.app.infraestructure.repositories;

import com.adopcion.app.domain.entities.Donacion;
import com.adopcion.app.domain.repositories.DonacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DonacionRepositoryImpl implements DonacionRepository {

    @Autowired
    private DonacionJpaRepository donacionJpaRepository;

    @Override
    public List<Donacion> listar(){
        return donacionJpaRepository.findAll();
    }

    @Override
    public void registrar(Donacion donacion){
        donacionJpaRepository.save(donacion);
    }

    @Override
    public Donacion buscar(Integer idDonacion){
        return null;
    }

}
