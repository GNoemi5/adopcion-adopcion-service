package com.adopcion.app.infraestructure.repositories;

import com.adopcion.app.domain.entities.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaJpaRepository extends JpaRepository<Cuenta, Integer> {
}
