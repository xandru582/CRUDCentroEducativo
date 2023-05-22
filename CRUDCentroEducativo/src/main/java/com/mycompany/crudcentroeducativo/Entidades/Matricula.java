/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudcentroeducativo.Entidades;

import java.sql.Date;

/**
 *
 * @author alejandrobalangutierrez
 */
public class Matricula {
    private int idmatricula;
    private int idalumno;
    private int idunidad;
    private Date fmatricula;
    private Date fBaja;
    
    public Matricula(){
        
    }
    
    public Matricula(int idmatricula, int idalumno, int idunidad, Date fmatricula, Date fBaja) {
        this.idmatricula = idmatricula;
        this.idalumno = idalumno;
        this.idunidad = idunidad;
        this.fmatricula = fmatricula;
        this.fBaja = fBaja;
    }

    public int getIdmatricula() {
        return idmatricula;
    }

    public void setIdmatricula(int idmatricula) {
        this.idmatricula = idmatricula;
    }

    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    public int getIdunidad() {
        return idunidad;
    }

    public void setIdunidad(int idunidad) {
        this.idunidad = idunidad;
    }

    public Date getFmatricula() {
        return fmatricula;
    }

    public void setFmatricula(Date fmatricula) {
        this.fmatricula = fmatricula;
    }

    public Date getfBaja() {
        return fBaja;
    }

    public void setfBaja(Date fBaja) {
        this.fBaja = fBaja;
    }

    @Override
    public String toString() {
        return "Matricula{" + "idmatricula=" + idmatricula + ", idalumno=" + idalumno + ", idunidad=" + idunidad + ", fmatricula=" + fmatricula + ", fBaja=" + fBaja + '}';
    }
    
    
    
}
