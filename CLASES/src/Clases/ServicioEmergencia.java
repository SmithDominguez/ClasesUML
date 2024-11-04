package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public abstract class ServicioEmergencia {
    private String nombreServicio;
    private String descripcion;

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ServicioEmergencia(String nombreServicio, String descripcion) {
        this.nombreServicio = nombreServicio;
        this.descripcion = descripcion;
    }
    
    public void mostrarInformacion() {
        System.out.println("Servicio: " + nombreServicio);
        System.out.println("Descripción: " + descripcion);
    }
}
