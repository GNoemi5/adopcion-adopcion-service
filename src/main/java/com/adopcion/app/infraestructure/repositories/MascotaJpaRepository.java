package com.adopcion.app.infraestructure.repositories;

import com.adopcion.app.domain.entities.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotaJpaRepository extends JpaRepository<Mascota,Integer> {

}
