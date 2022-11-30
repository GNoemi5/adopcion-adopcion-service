package com.adopcion.app.infraestructure.adopcion;

import com.adopcion.app.domain.adopcion.entities.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotaJpaRepository extends JpaRepository<Mascota,Integer> {

}
