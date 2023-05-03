/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudcentroeducativo.controladorDAO;

import com.mycompany.crudcentroeducativo.BD.MyDataSource;
import com.mycompany.crudcentroeducativo.Entidades.CursoAcademico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejandrobalangutierrez
 */
public class CursoAcademicoDaoImp implements CursoAcademicoDao {

    private static CursoAcademicoDaoImp instance;
    
    static{//SOLO SE EJECUTA UNA UNICA VEZ
        instance= new CursoAcademicoDaoImp();
    }
    
    private CursoAcademicoDaoImp(){
        
    }
    
    public static CursoAcademicoDaoImp getInstance(){
        return instance;
    }
    
    @Override
    public int add(CursoAcademico c) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "insert into cursoacademico (yearinicio,yearfin,descripcion) values (?, ?, ?)";
        Connection cn = MyDataSource.getConnection();
        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setInt(1, c.getYearinicio());
        pstm.setInt(2, c.getYearfin());
        pstm.setString(3, c.getDescripcion());
        pstm.execute();
        return pstm.getFetchSize();
    }

    @Override
    public  CursoAcademico getById(int id) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "select * from cursoacademico where id=?";
        
        try( //CON ESTO ME CIERRA TODO LAS COSAS AUTOMATICAMENTE TRY-RESOURCES
        Connection cn=MyDataSource.getConnection();
        
        PreparedStatement pstm=cn.prepareStatement(sql);){
           pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            
            if (rs.next()){
                CursoAcademico cursoacademico = new CursoAcademico();
                cursoacademico.setId(rs.getInt("id"));
                cursoacademico.setDescripcion(rs.getString("descripcion"));
                cursoacademico.setYearfin(rs.getInt("yearfin"));
                cursoacademico.setYearinicio(rs.getInt("yearinicio"));
                return cursoacademico;

            }
        }
        
        return null;
    }

    @Override
    public List<CursoAcademico> getAll() throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        ArrayList<CursoAcademico> listaCursoAcademicos = new ArrayList<>();
        String sql = "select * from cursoacademico";
        
        try( //CON ESTO ME CIERRA TODO LAS COSAS AUTOMATICAMENTE TRY-RESOURCES
            
            Connection cn=MyDataSource.getConnection();
        
            Statement stmt=cn.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                
                CursoAcademico cursoacademico = new CursoAcademico();
                cursoacademico.setId(rs.getInt("id"));
                cursoacademico.setDescripcion(rs.getString("descripcion"));
                cursoacademico.setYearfin(rs.getInt("yearfin"));
                cursoacademico.setYearinicio(rs.getInt("yearinicio"));
                
                listaCursoAcademicos.add(cursoacademico);

            }
            
            rs.close();
            stmt.close();
            return listaCursoAcademicos;
        }
            
        
    }

    @Override
    public int update(CursoAcademico c) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "update cursoacademico set  yearinicio = ?, yearfin = ?, descripcion = ? where id = ?";
        
        try( //CON ESTO ME CIERRA TODO LAS COSAS AUTOMATICAMENTE TRY-RESOURCES
        Connection cn=MyDataSource.getConnection();
        
        PreparedStatement pstm=cn.prepareStatement(sql);){
           pstm.setInt(1, c.getYearinicio());
           pstm.setInt(2, c.getYearfin());
           pstm.setString(3, c.getDescripcion());
           pstm.setInt(4, c.getId());
           
           pstm.execute();
           return 1;
        }catch(Exception e){
            return 0;
        }
       
    }

    @Override
    public void delete(int id) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "delete from cursoacademico where id = ?";
        try( //CON ESTO ME CIERRA TODO LAS COSAS AUTOMATICAMENTE TRY-RESOURCES
        Connection cn=MyDataSource.getConnection();
        
        PreparedStatement pstm=cn.prepareStatement(sql);){
           pstm.setInt(1, id);
           pstm.execute();
           
        }catch(Exception e){
            
        }
    }
    
    
}
