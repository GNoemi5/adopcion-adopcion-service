package com.adopcion.app.infraestructure.adopcion;

import com.adopcion.app.domain.adopcion.entities.TipoMascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoMascotaJpaRepository extends JpaRepository<TipoMascota,Integer> {

}
