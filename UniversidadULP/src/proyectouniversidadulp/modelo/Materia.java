/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectouniversidadulp.modelo;

/**
 *
 * @author Usuario
 */
public class Materia {
    private int idMateria;
    private String nombre;
    private int cuatrimestre;
    private boolean activo;

    public Materia() {
    }

    public Materia(int idMateria, String nombre, int cuatrimestre, boolean activo) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.cuatrimestre = cuatrimestre;
        this.activo = activo;
    }

    public Materia(int id_materia, String nombre, int cuatrimestre) {
        this.idMateria = id_materia;
        this.nombre = nombre;
        this.cuatrimestre = cuatrimestre;
        this.activo=true;
    }

    public Materia(String nombre, int cuatrimestre, boolean activo) {
        
        this.nombre = nombre;
        this.cuatrimestre = cuatrimestre;
        this.activo = activo;
    }

    public int getId_materia() {
        return idMateria;
    }

    public void setId_materia(int id_materia) {
        this.idMateria = id_materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return  "nombre:" + nombre + ", cuatrimestre:" + cuatrimestre + ", id_materia:" + idMateria + ", activo:" + activo ;
    }
    
    
    
    
}
