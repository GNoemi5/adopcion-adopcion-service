package com.adopcion.app.infraestructure.repositories;

import com.adopcion.app.domain.entities.Donacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonacionJpaRepository extends JpaRepository<Donacion, Integer> {
}
