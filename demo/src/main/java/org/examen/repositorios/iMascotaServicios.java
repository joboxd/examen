/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.examen.repositorios;

import java.util.List;
import java.util.Optional;
import org.examen.entidades.Mascota;

/**
 *
 * @author Karen
 */
public interface iMascotaServicios {
    public List <Mascota>Listar();
    public Optional<Mascota>ListarId(int id);
    public  int save(Mascota m);
    public void delete(int id);
}
