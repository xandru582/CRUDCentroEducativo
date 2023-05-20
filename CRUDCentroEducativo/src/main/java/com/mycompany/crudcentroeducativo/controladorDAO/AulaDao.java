/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.crudcentroeducativo.controladorDAO;

import com.mycompany.crudcentroeducativo.Entidades.Alumno;
import com.mycompany.crudcentroeducativo.Entidades.Aula;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author alejandrobalangutierrez
 */
public interface AulaDao {
    int add(Aula c) throws SQLException;
    
    Aula getById(int id) throws SQLException;
    
    List<Aula> getAll() throws SQLException;
    
    int update(Aula c)throws SQLException;
    
    void delete(int id) throws SQLException;
}
