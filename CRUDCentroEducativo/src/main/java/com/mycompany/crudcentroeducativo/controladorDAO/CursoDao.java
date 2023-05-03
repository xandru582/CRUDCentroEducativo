/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.crudcentroeducativo.controladorDAO;

import com.mycompany.crudcentroeducativo.Entidades.Curso;
import com.mycompany.crudcentroeducativo.Entidades.CursoAcademico;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author alejandrobalangutierrez
 */
public interface CursoDao {
    int add(Curso u) throws SQLException;
    
    Curso getById(int id) throws SQLException;
    
    List<Curso> getAll() throws SQLException;
    
    List<Curso> getAllByCursoAcademico(int idCursoAcademico) throws SQLException;
    
    int update(Curso u)throws SQLException;
    
    void delete(int id) throws SQLException;
    
    CursoAcademico getCursoAcademico(Curso cu) throws SQLException;
}
