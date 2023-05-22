/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.crudcentroeducativo.controladorDAO;

import com.mycompany.crudcentroeducativo.Entidades.Alumno;
import com.mycompany.crudcentroeducativo.Entidades.CursoAcademico;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author alejandrobalangutierrez
 */
public interface AlumnoDao {
    int add(AlumnoDao c) throws SQLException;
    
    Alumno getById(int id) throws SQLException;
    
    List<Alumno> getAll() throws SQLException;
    
    int update(AlumnoDao c)throws SQLException;
    
    void delete(int id) throws SQLException;
}
