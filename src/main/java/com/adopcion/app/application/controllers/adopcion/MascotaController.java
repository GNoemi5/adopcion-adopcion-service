package com.adopcion.app.application.controllers.adopcion;

import com.adopcion.app.domain.adopcion.entities.Mascota;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface MascotaController {

    @GetMapping("listar")
    public List<Mascota> listar();

    @GetMapping("listar/{id}")
    public Mascota buscarPorId(@PathVariable("id") Integer id);

    @PostMapping("registrar")
    public boolean registrar(@RequestBody Mascota mascota);

    @PutMapping("editar")
    public Mascota editar(@RequestBody Mascota mascota);

    @DeleteMapping("eliminar/{id}")
    public void eliminar(@PathVariable("id") Integer id);
}
