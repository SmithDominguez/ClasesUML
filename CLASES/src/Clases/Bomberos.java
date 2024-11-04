/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author PC
 */
public class Bomberos extends ServicioEmergencia {
    private int cantidadCamiones;

    public int getCantidadCamiones() {
        return cantidadCamiones;
    }

    public void setCantidadCamiones(int cantidadCamiones) {
        this.cantidadCamiones = cantidadCamiones;
    }

    public Bomberos(int cantidadCamiones, String nombreServicio, String descripcion) {
        super(nombreServicio, descripcion);
        this.cantidadCamiones = cantidadCamiones;
    }

    public void atenderEmergencia() {
        System.out.println("Bomberos atendiendo emergencia con " + cantidadCamiones + " camiones.");
    }
}
