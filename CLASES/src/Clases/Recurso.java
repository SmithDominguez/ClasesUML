/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author PC
 */
class Recurso {
    private String idRecurso;
    private String nombreRecurso;
    
    public Recurso(String idRecurso, String nombreRecurso) {
        this.idRecurso = idRecurso;
        this.nombreRecurso = nombreRecurso;
    }
    
    public String getIdRecurso() {
        return idRecurso;
    }

    public String getNombreRecurso() {
        return nombreRecurso;
    }
    public void setIdRecurso(String idRecurso) {
        this.idRecurso = idRecurso;
    }

    public void setNombreRecurso(String nombreRecurso) {
        this.nombreRecurso = nombreRecurso;
    }
}