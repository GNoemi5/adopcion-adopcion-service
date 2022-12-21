package com.adopcion.app.application.controllers.adopcion;

import com.adopcion.app.domain.adopcion.entities.TipoMascota;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface TipoMascotaController {

    @GetMapping("listar")
    public List<TipoMascota> listar();

}
