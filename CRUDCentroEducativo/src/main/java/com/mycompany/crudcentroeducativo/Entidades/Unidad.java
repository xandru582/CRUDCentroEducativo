/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudcentroeducativo.Entidades;

/**
 *
 * @author alejandrobalangutierrez
 */
public class Unidad {
    private int id;
    private String codigo;
    private String nombre;
    private String Observaciones;
    private int idCurso;
    private int idTutor;
    private int idAula;
    
    public Unidad(){
        
    }
    
    public Unidad(int id, String codigo, String nombre, String Observaciones, int idCurso, int idTutor, int idAula) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.Observaciones = Observaciones;
        this.idCurso = idCurso;
        this.idTutor = idTutor;
        this.idAula = idAula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public int getIdAula() {
        return idAula;
    }

    public void setIdAula(int idAula) {
        this.idAula = idAula;
    }

    @Override
    public String toString() {
        return "Unidad{" + "id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", Observaciones=" + Observaciones + ", idCurso=" + idCurso + ", idTutor=" + idTutor + ", idAula=" + idAula + '}';
    }
    
    
}
