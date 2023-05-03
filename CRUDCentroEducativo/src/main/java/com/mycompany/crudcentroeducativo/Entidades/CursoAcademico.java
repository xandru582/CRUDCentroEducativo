/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudcentroeducativo.Entidades;

import java.util.List;

/**
 *
 * @author alejandrobalangutierrez
 */
public class CursoAcademico {
    private int id;
    private int yearinicio;
    private int yearfin;
    private String descripcion;
    private int idcursoacademico;
    
    public CursoAcademico(){
        
    };
    public CursoAcademico(int id, int yearinicio, int yearfin, String descripcion) {
        this.id = id;
        this.yearinicio = yearinicio;
        this.yearfin = yearfin;
        this.descripcion = descripcion;
    }
    public CursoAcademico( int yearinicio, int yearfin, String descripcion) {
        //this.id = id;
        this.yearinicio = yearinicio;
        this.yearfin = yearfin;
        this.descripcion = descripcion;
    }
   

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYearinicio() {
        return yearinicio;
    }

    public void setYearinicio(int yearinicio) {
        this.yearinicio = yearinicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getYearfin() {
        return yearfin;
    }

    public void setYearfin(int yearfin) {
        this.yearfin = yearfin;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CursoAcademico other = (CursoAcademico) obj;
        if (this.id != other.id) {
            return false;
        }
        return this.yearinicio == other.yearinicio;
    }
    

    @Override
    public String toString() {
        return "CursoAcademico{" + "id=" + id + ", yearinicio=" + yearinicio + ", yearfin=" + yearfin + ", descripcion=" + descripcion + '}';
    }
    

    
    
    
    
}
