package com.adopcion.app.application.controllers;

import com.adopcion.app.domain.entities.Mascota;
import com.adopcion.app.domain.services.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mascota/v1")
public class MascotaControllerImpl implements MascotaController{

    @Autowired private MascotaService mascotaService;

    @GetMapping("listar")
    public List<Mascota> getMascotaList(){
        return mascotaService.listar();
    }

    @PostMapping("registrar")
    public boolean registrar(@RequestBody Mascota mascota){
        mascotaService.registrarMascota(mascota);
        return true;

    }

}
