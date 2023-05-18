package com.softtek.restback1.controlador;

import com.softtek.restback1.modelo.Medico;
import com.softtek.restback1.servicio.IMedicoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins= "http://localhost:4200")
@RestController
@RequestMapping("/medicos")
public class MedicoControlador {
    @Autowired
    private IMedicoServicio servicio;

@GetMapping
public List<Medico> listarMedicos(){
    return List.of(servicio.listar());
}
}
