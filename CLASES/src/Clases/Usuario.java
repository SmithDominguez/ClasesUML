/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author PC
 */

public class Usuario {
    private String idUsuario;
    private String nombre;
    private Solicitud solicitud; 
    public List<HistorialEmergencia> historialEmergencias;


    public Usuario(String idUsuario, String nombre) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.historialEmergencias = new ArrayList<>();
    }

    public void crearSolicitud(String descripcion) {
        this.solicitud = new Solicitud(descripcion, "Pendiente");
        System.out.println(nombre + " ha creado una solicitud: " + descripcion);
    }

    public String verEstadoSolicitud() {
        if (solicitud != null) {
            return solicitud.getEstado();
        } else {
            return "No hay solicitudes en curso.";
        }
    }
    
    public void agregarHistorial(HistorialEmergencia historial) {
        historialEmergencias.add(historial);
    }

    public void mostrarHistoriales() {
        System.out.println("Historiales de " + nombre + ":");
        for (HistorialEmergencia historial : historialEmergencias) {
            System.out.println("- " + historial.getDescripcion() + " en " + historial.getFecha());
        }
    }
    
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}