package com.adopcion.app.domain.services;

import com.adopcion.app.domain.entities.Cuenta;
import com.adopcion.app.infraestructure.repositories.CuentaRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuentaServiceImpl implements CuentaService{

    @Autowired
    private CuentaRepositoryImpl cuentaRepository;

    @Override
    public void registrarCuenta(Cuenta cuenta){
        cuentaRepository.registrar(cuenta);
    }

}
