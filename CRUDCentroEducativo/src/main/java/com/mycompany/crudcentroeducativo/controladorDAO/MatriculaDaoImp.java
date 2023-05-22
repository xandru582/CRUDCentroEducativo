/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudcentroeducativo.controladorDAO;

import com.mycompany.crudcentroeducativo.BD.MyDataSource;
import com.mycompany.crudcentroeducativo.Entidades.Matricula;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author alejandrobalangutierrez
 */
public class MatriculaDaoImp implements MatriculaDao {
    
    private static MatriculaDaoImp instance;
    
    static{//SOLO SE EJECUTA UNA UNICA VEZ
        instance= new MatriculaDaoImp();
    }
    
    private MatriculaDaoImp(){
        
    }
    
    public static MatriculaDaoImp getInstance(){
        return instance;
    }

    @Override
    public int add(Matricula c) throws SQLException {
        Connection cn = MyDataSource.getConnection();
        String sql = "INSERT INTO matricula (idalumno, idunidad, fmatricula, fBaja) VALUES (?, ?, ?, ?)";

        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setInt(1, c.getIdalumno());
        pstm.setInt(2, c.getIdunidad());
        pstm.setDate(3, c.getFmatricula());
        pstm.setDate(4, c.getfBaja());

        int rowsAffected = pstm.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Matrícula añadida correctamente");
        } else {
            System.out.println("Error al añadir la matrícula");
        }

        return 0;
    }

    @Override
    public Matricula getById(int id) throws SQLException {
        Matricula matricula = null;
        String sql = "SELECT * FROM matricula WHERE idmatricula = ?";

        try (Connection cn = MyDataSource.getConnection(); PreparedStatement sentencia = cn.prepareStatement(sql)) {
            sentencia.setInt(1, id);
            ResultSet rs = sentencia.executeQuery();

            if (rs.next()) {
                int idMatricula = rs.getInt("idmatricula");
                int idAlumno = rs.getInt("idalumno");
                int idUnidad = rs.getInt("idunidad");
                Date fMatricula = rs.getDate("fmatricula");
                Date fBaja = rs.getDate("fBaja");

                matricula = new Matricula(idMatricula, idAlumno, idUnidad, fMatricula, fBaja);
            }

            rs.close();
        }

        return matricula;
    }

    @Override
    public List<Matricula> getAll() throws SQLException {
        List<Matricula> listaMatriculas = new ArrayList<>();
        Connection cn = MyDataSource.getConnection();
        String sql = "SELECT * FROM matricula";

        PreparedStatement pstm = cn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            Matricula matricula = new Matricula();
            matricula.setIdmatricula(rs.getInt("idmatricula"));
            matricula.setIdalumno(rs.getInt("idalumno"));
            matricula.setIdunidad(rs.getInt("idunidad"));
            matricula.setFmatricula(rs.getDate("fmatricula"));
            matricula.setfBaja(rs.getDate("fBaja"));
            listaMatriculas.add(matricula);
        }

        rs.close();
        pstm.close();

        return listaMatriculas;
    }

    @Override
    public int update(Matricula c) throws SQLException {
        Connection cn = MyDataSource.getConnection();
        String sql = "UPDATE matricula SET idalumno = ?, idunidad = ?, fmatricula = ?, fBaja = ? WHERE idmatricula = ?";

        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setInt(1, c.getIdalumno());
        pstm.setInt(2, c.getIdunidad());
        pstm.setDate(3, c.getFmatricula());
        pstm.setDate(4, c.getfBaja());
        pstm.setInt(5, c.getIdmatricula());

        int rowsAffected = pstm.executeUpdate();
        if (rowsAffected > 0) {
            //JOptionPane.showMessageDialog(null, "Actualizado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar el registro");
        }

        pstm.close();

        return rowsAffected;
    }

    @Override
    public void delete(int id) throws SQLException {
        Connection cn = MyDataSource.getConnection();
        String sql = "DELETE FROM matricula WHERE idmatricula = ?";

        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setInt(1, id);

        int rowsAffected = pstm.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Eliminado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
        }

        pstm.close();
    }
    

}
