package com.adopcion.app.application.controllers.adopcion;

import com.adopcion.app.domain.adopcion.entities.Mascota;
import com.adopcion.app.domain.adopcion.services.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/mascota/v1")
public class MascotaControllerImpl implements MascotaController {

    @Autowired private MascotaService mascotaService;


    @Override
    public List<Mascota> listar() {
        return mascotaService.listar();
    }

    @Override
    public Mascota buscarPorId(Integer idMascota) {
        return mascotaService.buscar(idMascota);
    }

    @Override
    public boolean registrar(@RequestBody Mascota mascota){
        mascotaService.registrarMascota(mascota);
        return true;

    }

    @Override
    public Mascota editar(Mascota mascota) {
        return mascotaService.editar(mascota);
    }

    @Override
    public void eliminar(Integer idMascota) {
        mascotaService.eliminar(idMascota);
    }

}
