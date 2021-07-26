/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.examen.repositorios;

import org.examen.entidades.Mascota;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Karen
 */
@Repository
public interface iMascota extends CrudRepository<Mascota,Integer>{
    
}
