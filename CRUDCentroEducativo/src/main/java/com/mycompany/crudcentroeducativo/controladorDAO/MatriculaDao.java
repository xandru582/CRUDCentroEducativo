/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.crudcentroeducativo.controladorDAO;


import com.mycompany.crudcentroeducativo.Entidades.Matricula;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author alejandrobalangutierrez
 */
public interface MatriculaDao {
    int add(Matricula c) throws SQLException;
    
    Matricula getById(int id) throws SQLException;
    
    List<Matricula> getAll() throws SQLException;
    
    int update(Matricula c)throws SQLException;
    
    void delete(int id) throws SQLException;
}
