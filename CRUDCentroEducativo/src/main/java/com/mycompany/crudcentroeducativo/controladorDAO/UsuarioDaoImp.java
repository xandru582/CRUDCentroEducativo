/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudcentroeducativo.controladorDAO;

import com.mycompany.crudcentroeducativo.BD.MyDataSource;

import com.mycompany.crudcentroeducativo.Entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author alejandrobalangutierrez
 */
public class UsuarioDaoImp implements UsuarioDao{
    
    private static UsuarioDaoImp instance;
    
    static{//SOLO SE EJECUTA UNA UNICA VEZ
        instance= new UsuarioDaoImp();
    }
    
    private UsuarioDaoImp(){
        
    }
    
    public static UsuarioDaoImp getInstance(){
        return instance;
    }
    @Override
    public int add(Usuario u) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql ="";
        return 0;
    }
    @Override
    public Usuario getById(int id) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    String sql = "select * from cursoacademico where id=?";
        
        try( //CON ESTO ME CIERRA TODO LAS COSAS AUTOMATICAMENTE TRY-RESOURCES
        Connection cn=MyDataSource.getConnection();
        
        PreparedStatement pstm=cn.prepareStatement(sql);){
           pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            
            if (rs.next()){
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setPassword("password");
                usuario.setUsuario("usuario");
               
                return usuario;

            }
        }
        
        return null;
    }

    @Override
    public List<Usuario> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Usuario u) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
    }

    @Override
    public boolean valida(String Usuario, String password) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql="SELECT usuario,password FROM usuario where usuario=? and password=?";
        try(
                Connection cn=MyDataSource.getConnection();
        PreparedStatement pstm=cn.prepareStatement(sql);
                ) 
        {
           pstm.setString(1, Usuario);
           pstm.setString(2, password);
           ResultSet rs = pstm.executeQuery();
           if(rs.next()){
               return true;
           }
        }
            
        return false;
    }
           
    }
    

