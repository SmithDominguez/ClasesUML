/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author PC
 */
class HistorialEmergencia {
    private String descripcion;
    private String fecha;
    
    public HistorialEmergencia(String descripcion, String fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
