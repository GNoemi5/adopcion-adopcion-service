package com.adopcion.app.domain.repositories;

import com.adopcion.app.domain.entities.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MascotaRepository {
    List<Mascota> listar();
}
