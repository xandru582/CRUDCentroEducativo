/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.crudcentroeducativo.controladorDAO;

import com.mycompany.crudcentroeducativo.Entidades.Autorizado;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author alejandrobalangutierrez
 */
public interface AutorizadoDao {
    int add(Autorizado c) throws SQLException;
    
    Autorizado getById(int id) throws SQLException;
    
    List<Autorizado> getAll() throws SQLException;
    
    int update(Autorizado c)throws SQLException;
    
    void delete(int id) throws SQLException;
}
