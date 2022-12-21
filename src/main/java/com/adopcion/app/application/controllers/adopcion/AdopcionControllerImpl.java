package com.adopcion.app.application.controllers.adopcion;


import com.adopcion.app.domain.adopcion.entities.Mascota;
import com.adopcion.app.domain.adopcion.services.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/adopcion/v1")
public class AdopcionControllerImpl implements AdopcionController{

    @Autowired
    private MascotaService mascotaService;

    @Override
    public List<Mascota> listar() {
        return mascotaService.listarMascotasDisponibles();
    }
}
