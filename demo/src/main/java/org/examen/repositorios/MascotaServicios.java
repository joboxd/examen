/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.examen.repositorios;

import java.util.List;
import java.util.Optional;
import org.examen.entidades.Mascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Karen
 */
@Service
public class MascotaServicios implements iMascotaServicios{
    @Autowired
    private iMascota data;

    @Override
    public List<Mascota> Listar() {
        return (List<Mascota>)data.findAll();
    }

    @Override
    public Optional<Mascota> ListarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int save(Mascota m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
