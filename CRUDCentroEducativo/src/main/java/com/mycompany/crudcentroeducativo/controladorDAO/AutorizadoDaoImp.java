/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudcentroeducativo.controladorDAO;

import com.mycompany.crudcentroeducativo.BD.MyDataSource;
import com.mycompany.crudcentroeducativo.Entidades.Alumno;
import com.mycompany.crudcentroeducativo.Entidades.Autorizado;
import formularios.frmAutorizados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alejandrobalangutierrez
 */
public class AutorizadoDaoImp implements AutorizadoDao{
    private static AutorizadoDaoImp instance;
    
    static{//SOLO SE EJECUTA UNA UNICA VEZ
            instance= new AutorizadoDaoImp();
    }
    
    private AutorizadoDaoImp(){
        
    }
    
    public static AutorizadoDaoImp getInstance(){
        return instance;
    }
    
    public int add(Autorizado c) throws SQLException {
    String sql = "INSERT INTO autorizado (dni, nombre, apellido1, apellido2, parentesco) VALUES (?, ?, ?, ?, ?)";

    try {
        Connection cn = MyDataSource.getConnection();
        PreparedStatement sentencia = cn.prepareStatement(sql);
        sentencia.setString(1, c.getDni());
        sentencia.setString(2, c.getNombre());
        sentencia.setString(3, c.getApellido1());
        sentencia.setString(4, c.getApellido2());
        sentencia.setString(5, c.getParentesco());
        int filasInsertadas = sentencia.executeUpdate();
        sentencia.close();
        cn.close();
        return filasInsertadas;
    } catch (SQLException ex) {
        Logger.getLogger(frmAutorizados.class.getName()).log(Level.SEVERE, null, ex);
        return 0;
    }
}



    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    public Autorizado getById(int id) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "select * from autorizado where dni = ?";
        Autorizado autorizado = new Autorizado();
        try{ //CON ESTO ME CIERRA TODO LAS COSAS AUTOMATICAMENTE TRY-RESOURCES
            
            Connection cn=MyDataSource.getConnection();
            PreparedStatement sentencia=cn.prepareStatement(sql);
            sentencia.setInt(1, id);
            ResultSet rs = sentencia.executeQuery();
            
            if (rs.next()) {
                

                autorizado.setId(rs.getInt("id"));
                autorizado.setNombre(rs.getString("nombre"));
                autorizado.setApellido1(rs.getString("apellido1"));
                autorizado.setApellido2(rs.getString("apellido2"));
                autorizado.setParentesco(rs.getString("parentesco"));
                autorizado.setDni(rs.getString("dni"));
                

            }else{
                JOptionPane.showMessageDialog(null, "No se ha encontrado autorizado");
                
            }
            rs.close();
            sentencia.close();
            
            return autorizado;
         }catch(Exception e){
            return null;
        }
    }
    public Autorizado getByDni(String dni) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "select * from autorizado where dni = ?";
        Autorizado autorizado = new Autorizado();
        try{ //CON ESTO ME CIERRA TODO LAS COSAS AUTOMATICAMENTE TRY-RESOURCES
            
            Connection cn=MyDataSource.getConnection();
            PreparedStatement sentencia=cn.prepareStatement(sql);
            sentencia.setString(1, dni);
            ResultSet rs = sentencia.executeQuery();
            
            if (rs.next()) {
                

                autorizado.setId(rs.getInt("id"));
                autorizado.setNombre(rs.getString("nombre"));
                autorizado.setApellido1(rs.getString("apellido1"));
                autorizado.setApellido2(rs.getString("apellido2"));
                autorizado.setParentesco(rs.getString("parentesco"));
                autorizado.setDni(rs.getString("dni"));
                

            }else{
                JOptionPane.showMessageDialog(null, "No se ha encontrado autorizado");
                
            }
            rs.close();
            sentencia.close();
            
            return autorizado;
         }catch(Exception e){
            return null;
        }
    }
    


    @Override
    public int update(Autorizado c) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Autorizado> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
