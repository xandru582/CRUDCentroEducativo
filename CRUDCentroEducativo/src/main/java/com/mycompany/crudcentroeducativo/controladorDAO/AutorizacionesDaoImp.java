/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudcentroeducativo.controladorDAO;

import com.mycompany.crudcentroeducativo.BD.MyDataSource;
import com.mycompany.crudcentroeducativo.Entidades.Autorizaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author alejandrobalangutierrez
 */
public class AutorizacionesDaoImp implements AutorizacionesDao {

    private static AutorizacionesDaoImp instance;

    static {//SOLO SE EJECUTA UNA UNICA VEZ
        instance = new AutorizacionesDaoImp();
    }

    private AutorizacionesDaoImp() {

    }

    public static AutorizacionesDaoImp getInstance() {
        return instance;
    }

    @Override
    public int add(Autorizaciones c) throws SQLException {
        Connection cn = MyDataSource.getConnection();
        String sql = "INSERT INTO autorizaciones (idalumno, idautorizado) VALUES (?, ?)";

        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setInt(1, c.getIdalumno());
        pstm.setInt(2, c.getIdautorizado());

        int rowsAffected = pstm.executeUpdate();

        pstm.close();
        cn.close();

        return rowsAffected;
    }

    @Override
    public List<Autorizaciones> getAll() throws SQLException {
        List<Autorizaciones> autorizacionesList = new ArrayList<>();
        Connection cn = MyDataSource.getConnection();
        String sql = "SELECT * FROM autorizaciones";

        Statement stmt = cn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int idalumno = rs.getInt("idalumno");
            int idautorizado = rs.getInt("idautorizado");

            Autorizaciones autorizacion = new Autorizaciones(idalumno, idautorizado);
            autorizacionesList.add(autorizacion);
        }

        rs.close();
        stmt.close();
        cn.close();

        return autorizacionesList;
    }

    @Override
    public int update(Autorizaciones c) throws SQLException {
        Connection cn = MyDataSource.getConnection();
        String sql = "UPDATE autorizaciones SET idautorizado = ? WHERE idalumno = ?";

        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setInt(1, c.getIdautorizado());
        pstm.setInt(2, c.getIdalumno());

        int rowsUpdated = pstm.executeUpdate();

        pstm.close();
        cn.close();

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Autorización actualizada correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar la autorización");
        }

        return rowsUpdated;
    }

    @Override
    public Autorizaciones getById(int idalumno, int idautorizado) throws SQLException {
        Connection cn = MyDataSource.getConnection();
        String sql = "SELECT * FROM autorizaciones WHERE idalumno = ? AND idautorizado = ?";

        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setInt(1, idalumno);
        pstm.setInt(2, idautorizado);

        ResultSet rs = pstm.executeQuery();

        Autorizaciones autorizacion = null;
        if (rs.next()) {
            autorizacion = new Autorizaciones(idalumno, idautorizado);
        } else {
            JOptionPane.showMessageDialog(null, "Autorización no encontrada");
        }

        rs.close();
        pstm.close();
        cn.close();

        return autorizacion;
    }

    @Override
    public int delete(Autorizaciones autorizacion) throws SQLException {
        Connection cn = MyDataSource.getConnection();
        String sql = "DELETE FROM autorizaciones WHERE idalumno = ? AND idautorizado = ?";

        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setInt(1, autorizacion.getIdalumno());
        pstm.setInt(2, autorizacion.getIdautorizado());

        int rowsDeleted = pstm.executeUpdate();

        pstm.close();
        cn.close();

        return rowsDeleted;
    }

}
