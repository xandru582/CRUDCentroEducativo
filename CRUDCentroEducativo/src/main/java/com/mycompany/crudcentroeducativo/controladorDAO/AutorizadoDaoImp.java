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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alejandrobalangutierrez
 */
public class AutorizadoDaoImp implements AutorizadoDao {

    private static AutorizadoDaoImp instance;

    static {//SOLO SE EJECUTA UNA UNICA VEZ
        instance = new AutorizadoDaoImp();
    }

    private AutorizadoDaoImp() {

    }

    public static AutorizadoDaoImp getInstance() {
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
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "delete from autorizado where id = ?";
        try ( //CON ESTO ME CIERRA TODO LAS COSAS AUTOMATICAMENTE TRY-RESOURCES
                Connection cn = MyDataSource.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setInt(1, id);
            pstm.execute();

        } catch (Exception e) {

        }
    }

    public void delete(String dni) throws SQLException {
        String sql = "delete from autorizado where dni = ?";
        try ( //CON ESTO ME CIERRA TODO LAS COSAS AUTOMATICAMENTE TRY-RESOURCES
                Connection cn = MyDataSource.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, dni);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Borrado correctamente");
        } catch (Exception e) {

        }
    }

    public Autorizado getById(int id) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "select * from autorizado where id = ?";
        Autorizado autorizado = new Autorizado();
        try { //CON ESTO ME CIERRA TODO LAS COSAS AUTOMATICAMENTE TRY-RESOURCES

            Connection cn = MyDataSource.getConnection();
            PreparedStatement sentencia = cn.prepareStatement(sql);
            sentencia.setInt(1, id);
            ResultSet rs = sentencia.executeQuery();

            if (rs.next()) {

                autorizado.setId(rs.getInt("id"));
                autorizado.setNombre(rs.getString("nombre"));
                autorizado.setApellido1(rs.getString("apellido1"));
                autorizado.setApellido2(rs.getString("apellido2"));
                autorizado.setParentesco(rs.getString("parentesco"));
                autorizado.setDni(rs.getString("dni"));

            } else {
                JOptionPane.showMessageDialog(null, "No se ha encontrado autorizado");

            }
            rs.close();
            sentencia.close();

            return autorizado;
        } catch (Exception e) {
            return null;
        }
    }

    public Autorizado getByDni(String dni) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "select * from autorizado where dni = ?";
        Autorizado autorizado = new Autorizado();
        try { //CON ESTO ME CIERRA TODO LAS COSAS AUTOMATICAMENTE TRY-RESOURCES

            Connection cn = MyDataSource.getConnection();
            PreparedStatement sentencia = cn.prepareStatement(sql);
            sentencia.setString(1, dni);
            ResultSet rs = sentencia.executeQuery();

            if (rs.next()) {

                autorizado.setId(rs.getInt("id"));
                autorizado.setNombre(rs.getString("nombre"));
                autorizado.setApellido1(rs.getString("apellido1"));
                autorizado.setApellido2(rs.getString("apellido2"));
                autorizado.setParentesco(rs.getString("parentesco"));
                autorizado.setDni(rs.getString("dni"));

            } else {
                JOptionPane.showMessageDialog(null, "No se ha encontrado autorizado");

            }
            rs.close();
            sentencia.close();

            return autorizado;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public int update(Autorizado c) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "UPDATE autorizado set dni=?, nombre=?, apellido1=?, apellido2=?,parentesco=? where dni=?";

        try {
            Connection cn = MyDataSource.getConnection();
            PreparedStatement sentencia = cn.prepareStatement(sql);
            sentencia.setString(1, c.getDni());
            sentencia.setString(2, c.getNombre());
            sentencia.setString(3, c.getApellido1());
            sentencia.setString(4, c.getApellido2());
            sentencia.setString(5, c.getParentesco());
            sentencia.setString(6, c.getDni());
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
    public List<Autorizado> getAll() throws SQLException {
        List<Autorizado> autorizados = new ArrayList<>();

        String sql = "SELECT * FROM autorizado";
        try (Connection cn = MyDataSource.getConnection();
             PreparedStatement stmt = cn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String apellido1 = rs.getString("apellido1");
                String apellido2 = rs.getString("apellido2");
                String parentesco = rs.getString("parentesco");

                Autorizado autorizado = new Autorizado(dni, nombre, apellido1, apellido2, parentesco);
                autorizado.setId(id);

                autorizados.add(autorizado);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AutorizadoDaoImp.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }

        return autorizados;
    }

}
