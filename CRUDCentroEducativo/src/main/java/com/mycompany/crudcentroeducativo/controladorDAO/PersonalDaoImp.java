/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudcentroeducativo.controladorDAO;

import com.mycompany.crudcentroeducativo.BD.MyDataSource;
import com.mycompany.crudcentroeducativo.Entidades.Alumno;
import com.mycompany.crudcentroeducativo.Entidades.Personal;
import formularios.jpAlumnoDetalle;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alejandrobalangutierrez
 */
public class PersonalDaoImp implements PersonalDao{
    private static PersonalDaoImp instance;
    
    static{//SOLO SE EJECUTA UNA UNICA VEZ
        instance= new PersonalDaoImp();
    }
    
    private PersonalDaoImp(){
        
    }
    
    public static PersonalDaoImp getInstance(){
        return instance;
    }
    @Override
    public int add(Personal c) throws SQLException {
    Connection cn = MyDataSource.getConnection();
    String sql = "INSERT INTO personal (dni, nombre, apellido1, apellido2, tipo, telefono, email, direccion, cp, poblacion, provincia)"
            + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    PreparedStatement pstm = cn.prepareStatement(sql);
    pstm.setString(1, c.getDni());
    pstm.setString(2, c.getNombre());
    pstm.setString(3, c.getApellido1());
    pstm.setString(4, c.getApellido2());
    pstm.setInt(5, c.getTipo());
    pstm.setString(6, c.getTelefono());
    pstm.setString(7, c.getEmail());
    pstm.setString(8, c.getDireccion());
    pstm.setString(9, c.getCp());
    pstm.setString(10, c.getPoblacion());
    pstm.setString(11, c.getProvincia());
    
    int rowsAffected = pstm.executeUpdate();
    if (rowsAffected > 0) {
        JOptionPane.showMessageDialog(null, "Añadido correctamente");
    } else {
        JOptionPane.showMessageDialog(null, "Error al añadir el registro");
    }
    
    return 0;
}


    @Override
    public Personal getById(int id) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        ArrayList<Personal> listaPersonal = new ArrayList<>();
        String sql = "select * from personal where id = ?";
        
        try{ //CON ESTO ME CIERRA TODO LAS COSAS AUTOMATICAMENTE TRY-RESOURCES
            
            Connection cn=MyDataSource.getConnection();
        
            PreparedStatement sentencia=cn.prepareStatement(sql);
            sentencia.setInt(1, id);
            ResultSet rs = sentencia.executeQuery();
            
            while (rs.next()) {
                
                Personal personal = new Personal();
                personal.setId(rs.getInt("id"));
                personal.setDni(rs.getString("dni"));
                personal.setNombre(rs.getString("nombre"));
                personal.setApellido1(rs.getString("apellido1"));
                personal.setApellido2(rs.getString("apellido2"));
                personal.setTipo(rs.getInt("tipo"));
                personal.setTelefono(rs.getString("telefono"));
                personal.setEmail(rs.getString("email"));
                personal.setDireccion(rs.getString("direccion"));
                personal.setCp(rs.getString("cp"));
                personal.setPoblacion(rs.getString("poblacion"));
                personal.setProvincia(rs.getString("provincia"));
                listaPersonal.add(personal);

            }
            
            rs.close();
            sentencia.close();
            
            return listaPersonal.get(0);
         }catch(Exception e){
            return null;
        }
    }
    public Personal getByDni(String dni) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        ArrayList<Personal> listaPersonal = new ArrayList<>();
        String sql = "select * from personal where dni = ?";
        
        try{ //CON ESTO ME CIERRA TODO LAS COSAS AUTOMATICAMENTE TRY-RESOURCES
            
            Connection cn=MyDataSource.getConnection();
        
            PreparedStatement sentencia=cn.prepareStatement(sql);
            sentencia.setString(1, dni);
            ResultSet rs = sentencia.executeQuery();
            
            while (rs.next()) {
                
                Personal personal = new Personal();
                personal.setId(rs.getInt("id"));
                personal.setDni(rs.getString("dni"));
                personal.setNombre(rs.getString("nombre"));
                personal.setApellido1(rs.getString("apellido1"));
                personal.setApellido2(rs.getString("apellido2"));
                personal.setTipo(rs.getInt("tipo"));
                personal.setTelefono(rs.getString("telefono"));
                personal.setEmail(rs.getString("email"));
                personal.setDireccion(rs.getString("direccion"));
                personal.setCp(rs.getString("cp"));
                personal.setPoblacion(rs.getString("poblacion"));
                personal.setProvincia(rs.getString("provincia"));
                listaPersonal.add(personal);

            }
            
            rs.close();
            sentencia.close();
            
            return listaPersonal.get(0);
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "No se encontró personal con dicho DNI");
            return null;
        }
    }

    @Override
    public List<Personal> getAll() throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         ArrayList<Personal> listaPersonal = new ArrayList<>();
        String sql = "select * from personal";
        
        try( //CON ESTO ME CIERRA TODO LAS COSAS AUTOMATICAMENTE TRY-RESOURCES
            
            Connection cn=MyDataSource.getConnection();
        
            Statement stmt=cn.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                
                Personal personal = new Personal();
                personal.setId(rs.getInt("id"));
                personal.setDni(rs.getString("dni"));
                personal.setNombre(rs.getString("nombre"));
                personal.setApellido1(rs.getString("apellido1"));
                personal.setApellido2(rs.getString("apellido2"));
                personal.setTipo(rs.getInt("tipo"));
                personal.setTelefono(rs.getString("telefono"));
                personal.setEmail(rs.getString("email"));
                personal.setDireccion(rs.getString("direccion"));
                personal.setCp(rs.getString("cp"));
                personal.setPoblacion(rs.getString("poblacion"));
                personal.setProvincia(rs.getString("provincia"));
                listaPersonal.add(personal);

            }
            
            rs.close();
            stmt.close();
            return listaPersonal;
        }
    }

    @Override
    public int update(Personal c) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try {
            String sql="update personal set dni=?,nombre=?,apellido1=?,apellido2=?,tipo=?,telefono=?,email=?,direccion=?,cp=?,poblacion=?,provincia=? where id=?";
            Connection cn=MyDataSource.getConnection();
            PreparedStatement sentencia=cn.prepareStatement(sql);
            sentencia.setString(1, c.getDni());
            sentencia.setString(2, c.getNombre());
            sentencia.setString(3, c.getApellido1());
            sentencia.setString(4, c.getApellido2());
            sentencia.setInt(5, c.getTipo());
            sentencia.setString(6, c.getTelefono());
            sentencia.setString(7, c.getEmail());
            sentencia.setString(8, c.getDireccion());
            sentencia.setString(9, c.getCp());
            sentencia.setString(10, c.getPoblacion());
            sentencia.setString(11, c.getProvincia());
            sentencia.setInt(12, c.getId());
            sentencia.executeUpdate();
            sentencia.close();
            
            JOptionPane.showMessageDialog(null, "La actualización se realizó correctamente.");
            //formAlumnos.cargaTabla();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(jpAlumnoDetalle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public void delete(int id) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         String sql = "delete from personal where id = ?";
        try( //CON ESTO ME CIERRA TODO LAS COSAS AUTOMATICAMENTE TRY-RESOURCES
        Connection cn=MyDataSource.getConnection();
        
        PreparedStatement pstm=cn.prepareStatement(sql);){
           pstm.setInt(1, id);
           pstm.execute();
           JOptionPane.showMessageDialog(null, "Borrado correctamente");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se ha podido eliminar");
        }
    }
    
}
