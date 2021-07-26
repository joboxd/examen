/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.examen.entidades;

import javax.persistence.*;

/**
 *
 * @author Karen
 */
@Entity
@Table(name="mascota")

public class Mascota {
    
    public Mascota() {
    }
    public Mascota(String nombre,String fechaNacimiento,String RazaMascota,
   String sexo,int edad, String descrpcion,String TipoMascota,String Propietario,
   Vacunas vacuna [] ) {
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
        this.RazaMascota=RazaMascota;
        this.sexo=sexo;
        this.edad=edad;
        this.descrpcion=descrpcion;
        this.TipoMascota=TipoMascota;
        this.Propietario=Propietario;
        this.vacuna=vacuna;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRazaMascota() {
        return RazaMascota;
    }

    public void setRazaMascota(String RazaMascota) {
        this.RazaMascota = RazaMascota;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }

    public String getTipoMascota() {
        return TipoMascota;
    }

    public void setTipoMascota(String TipoMascota) {
        this.TipoMascota = TipoMascota;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String Propietario) {
        this.Propietario = Propietario;
    }

    public Vacunas[] getVacuna() {
        return vacuna;
    }

    public void setVacuna(Vacunas[] vacuna) {
        this.vacuna = vacuna;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    
    private String nombre="";
    private String fechaNacimiento="";
    private String RazaMascota="";
    private String sexo="";
    private int edad=0;
    private String descrpcion="";
    private String TipoMascota="";
    private String Propietario="";
    private Vacunas[] vacuna= new Vacunas[5];
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id=0;
    
}
