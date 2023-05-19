/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.crudcentroeducativo.controladorDAO;


import com.mycompany.crudcentroeducativo.Entidades.Personal;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author alejandrobalangutierrez
 */
public interface PersonalDao {
    int add(Personal c) throws SQLException;
    
    Personal getById(int id) throws SQLException;
    
    List<Personal> getAll() throws SQLException;
    
    int update(Personal c)throws SQLException;
    
    void delete(int id) throws SQLException;
}
