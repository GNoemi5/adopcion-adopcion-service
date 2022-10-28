package com.adopcion.app.application.controllers;

import com.adopcion.app.domain.entities.Donacion;
import com.adopcion.app.domain.services.DonacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/donacion/v1")
public class DonacionControllerImpl implements DonacionController{

    @Autowired
    private DonacionService donacionService;

    @GetMapping("listar")
    public List<Donacion> getDonacionList() {
        return donacionService.listar();
    }

    

}
