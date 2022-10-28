package com.adopcion.app.infraestructure.repositories;

import com.adopcion.app.domain.entities.Cuenta;
import com.adopcion.app.domain.repositories.CuentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CuentaRepositoryImpl implements CuentaRepository {

    @Autowired
    private CuentaJpaRepository cuentaJpaRepository;

    @Override
    public void registrar(Cuenta cuenta){
        cuentaJpaRepository.save(cuenta);
    }

    @Override
    public Cuenta buscar(Integer idCuenta){
        return null;
    }
}
