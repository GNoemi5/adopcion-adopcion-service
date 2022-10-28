package com.adopcion.app.domain.services;

import com.adopcion.app.domain.entities.Donacion;
import com.adopcion.app.infraestructure.repositories.DonacionRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonacionServiceImpl implements DonacionService{

    @Autowired
    private DonacionRepositoryImpl donacionRepository;

    @Override
    public List<Donacion> listar() {
        return donacionRepository.listar();
    }

    @Override
    public void registrarDonacion(Donacion donacion){
        donacionRepository.registrar(donacion);
    }
}
