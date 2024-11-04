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
public class Solicitud {
    private String descripcion;
    private String estado;
    private List<Recurso> recursos; // Composición: Solicitud contiene recursos específicos


    public Solicitud(String descripcion, String estado) {
        this.descripcion = descripcion;
        this.estado = estado;
        this.recursos = new ArrayList<>();
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }
    public void agregarRecurso(String idRecurso, String nombreRecurso) {
        recursos.add(new Recurso(idRecurso, nombreRecurso));
    }
    public void mostrarRecursos() {
        System.out.println("Recursos para la solicitud: " + descripcion);
        for (Recurso recurso : recursos) {
            System.out.println("- Recurso ID: " + recurso.getIdRecurso() + ", Nombre: " + recurso.getNombreRecurso());
        }
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
