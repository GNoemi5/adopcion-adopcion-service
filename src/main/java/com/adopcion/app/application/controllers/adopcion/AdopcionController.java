package com.adopcion.app.application.controllers.adopcion;

import com.adopcion.app.domain.adopcion.entities.Mascota;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface AdopcionController {

    @GetMapping("listar-mascotas-disponibles")
    public List<Mascota> listar();
}
