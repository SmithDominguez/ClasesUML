/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author PC
 */
public class Policia extends ServicioEmergencia {
    private int cantidadPatrullas;

    public int getCantidadPatrullas() {
        return cantidadPatrullas;
    }

    public void setCantidadPatrullas(int cantidadPatrullas) {
        this.cantidadPatrullas = cantidadPatrullas;
    }

    public Policia(int cantidadPatrullas, String nombreServicio, String descripcion) {
        super(nombreServicio, descripcion);
        this.cantidadPatrullas = cantidadPatrullas;
    }
    
    public void atenderEmergencia() {
        System.out.println("Policía atendiendo emergencia con " + cantidadPatrullas + " patrullas.");
    }
}
