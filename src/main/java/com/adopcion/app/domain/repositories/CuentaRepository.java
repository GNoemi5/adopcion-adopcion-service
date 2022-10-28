package com.adopcion.app.domain.repositories;

import com.adopcion.app.domain.entities.Cuenta;

import java.util.List;

public interface CuentaRepository {

    void registrar(Cuenta cuenta);

    Cuenta buscar(Integer idCuenta);


}
