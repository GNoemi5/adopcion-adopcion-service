package com.adopcion.app.application.controllers.adopcion;

import com.adopcion.app.domain.adopcion.entities.TipoMascota;
import com.adopcion.app.domain.adopcion.services.TipoMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4201")
@RestController
@RequestMapping("/tipo-mascota/v1")
public class TipoMascotaControllerImpl implements TipoMascotaController {

    @Autowired private TipoMascotaService tipoMascotaService;


    @Override
    public List<TipoMascota> listar() {
        return tipoMascotaService.listar();
    }



}
