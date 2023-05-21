/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.crudcentroeducativo.controladorDAO;


import com.mycompany.crudcentroeducativo.Entidades.Autorizaciones;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author alejandrobalangutierrez
 */
public interface AutorizacionesDao {
    int add(Autorizaciones c) throws SQLException;
    
    Autorizaciones getById(int idalumno,int idautorizado) throws SQLException;
    
    List<Autorizaciones> getAll() throws SQLException;
    
    int update(Autorizaciones c)throws SQLException;
    
    int delete(Autorizaciones autorizaciones) throws SQLException;
}
