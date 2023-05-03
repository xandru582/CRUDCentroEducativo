/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.crudcentroeducativo;

import com.mycompany.crudcentroeducativo.BD.MyDataSource;
import com.mycompany.crudcentroeducativo.Entidades.Alumno;
import com.mycompany.crudcentroeducativo.Entidades.CursoAcademico;
import com.mycompany.crudcentroeducativo.controladorDAO.AlumnoDaoImp;
import com.mycompany.crudcentroeducativo.controladorDAO.CursoAcademicoDaoImp;
import com.mycompany.crudcentroeducativo.controladorDAO.UsuarioDaoImp;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alejandrobalangutierrez
 */
public class CRUDCentroEducativo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Connection cnlocal = MyDataSource.getConnection();
        Test();
        
    }
    public static void Test2(){
        UsuarioDaoImp usuariodao = UsuarioDaoImp.getInstance();
        try {
            
        } catch (Exception e) {
        }
    }
    
    public static void Test(){
        //Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1); 
        CursoAcademicoDaoImp daoCursoAcademico = CursoAcademicoDaoImp.getInstance();
        AlumnoDaoImp daoAlumno = AlumnoDaoImp.getInstance();
        try {
            CursoAcademico cursoaca = daoCursoAcademico.getById(1);
            System.out.println(cursoaca);
            CursoAcademico cursoaca2 = daoCursoAcademico.getById(4);
            System.out.println(cursoaca2);
            for (CursoAcademico curso : daoCursoAcademico.getAll()) {
                System.out.println(curso);
            }
            
            //probando inserccion
            CursoAcademico cursillo = new CursoAcademico(2021, 2023, "pr");
            daoAlumno.add(new Alumno("34578956t", "Daniel", "Fernandez", "Gazpacho", Date.valueOf("1978-08-05"), "643957003", "gazpachito@gmail.com", "Calle Balancito N0", "23760", "Republica Lacasito"));
            daoCursoAcademico.add(cursillo);
            
        } catch (SQLException ex) {
            Logger.getLogger(CRUDCentroEducativo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
