/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.crudcentroeducativo.controladorDAO;


import com.mycompany.crudcentroeducativo.Entidades.Unidad;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author alejandrobalangutierrez
 */
public interface UnidadDao {
    int add(Unidad c) throws SQLException;
    
    Unidad getById(int id) throws SQLException;
    
    List<Unidad> getAll() throws SQLException;
    
    int update(Unidad c)throws SQLException;
    
    void delete(int id) throws SQLException;
}
