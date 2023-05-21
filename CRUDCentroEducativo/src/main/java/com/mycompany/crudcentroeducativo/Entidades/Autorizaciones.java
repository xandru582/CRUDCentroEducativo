/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudcentroeducativo.Entidades;

/**
 *
 * @author alejandrobalangutierrez
 */
public class Autorizaciones {
    private int idalumno;
    private int idautorizado;

    public Autorizaciones() {
    }
    
    public Autorizaciones(int idalumno, int idautorizado) {
        this.idalumno = idalumno;
        this.idautorizado = idautorizado;
    }

    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    public int getIdautorizado() {
        return idautorizado;
    }

    public void setIdautorizado(int idautorizado) {
        this.idautorizado = idautorizado;
    }
    
    @Override
    public String toString() {
        return "Autorizaciones{" + "idalumno=" + idalumno + ", idautorizado=" + idautorizado + '}';
    }
    
    
    
}
