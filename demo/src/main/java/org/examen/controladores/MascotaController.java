/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.examen.controladores;

import java.util.List;
import org.examen.entidades.Mascota;
import org.examen.repositorios.iMascotaServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Karen
 */

@Controller
@RequestMapping
public class MascotaController {
    @Autowired
    private iMascotaServicios servicio;
    
    @GetMapping("/listar")
    public String listar(Model model){
        List <Mascota> mascotas= servicio.Listar();
        model.addAttribute("Mascotas", mascotas);
    return "index";
    }
}
