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
public class Ayuda {
    private String descripcion;
    private List<Ayuda> subAyudas;

    public Ayuda(String descripcion) {
        this.descripcion = descripcion;
        this.subAyudas = new ArrayList<>();
    }

    public void agregarSubAyuda(Ayuda subAyuda) {
        subAyudas.add(subAyuda);
    }

    public void mostrarAyuda() {
        System.out.println("Ayuda: " + descripcion);
        for (Ayuda subAyuda : subAyudas) {
            System.out.println("  Sub-Ayuda: " + subAyuda.descripcion);
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Ayuda> getSubAyudas() {
        return subAyudas;
    }
    public void setSubAyudas(List<Ayuda> subAyudas) {
        this.subAyudas = subAyudas;
    }
}
