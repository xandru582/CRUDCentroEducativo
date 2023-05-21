/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudcentroeducativo.controladorDAO;

import com.mycompany.crudcentroeducativo.BD.MyDataSource;
import com.mycompany.crudcentroeducativo.Entidades.Unidad;
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
public class UnidadDaoImp implements UnidadDao {
    private static UnidadDaoImp instance;

    static {//SOLO SE EJECUTA UNA UNICA VEZ
        instance = new UnidadDaoImp();
    }

    private UnidadDaoImp() {

    }

    public static UnidadDaoImp getInstance() {
        return instance;
    }

    @Override
    public int add(Unidad unidad) throws SQLException {
        Connection cn = MyDataSource.getConnection();
        String sql = "INSERT INTO unidad (codigo, nombre, Observaciones, idCurso, idTutor, idAula) VALUES (?, ?, ?, ?, ?, ?)";

        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setString(1, unidad.getCodigo());
        pstm.setString(2, unidad.getNombre());
        pstm.setString(3, unidad.getObservaciones());
        pstm.setInt(4, unidad.getIdCurso());
        pstm.setInt(5, unidad.getIdTutor());
        pstm.setInt(6, unidad.getIdAula());

        int rowsInserted = pstm.executeUpdate();

        pstm.close();
        cn.close();

        return rowsInserted;
    }

    @Override
    public Unidad getById(int id) throws SQLException {
        Connection cn = MyDataSource.getConnection();
        String sql = "SELECT * FROM unidad WHERE id = ?";

        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setInt(1, id);

        ResultSet rs = pstm.executeQuery();

        Unidad unidad = null;
        if (rs.next()) {
            int unidadId = rs.getInt("id");
            String codigo = rs.getString("codigo");
            String nombre = rs.getString("nombre");
            String observaciones = rs.getString("Observaciones");
            int idCurso = rs.getInt("idCurso");
            int idTutor = rs.getInt("idTutor");
            int idAula = rs.getInt("idAula");

            unidad = new Unidad(unidadId, codigo, nombre, observaciones, idCurso, idTutor, idAula);
        }

        rs.close();
        pstm.close();
        cn.close();

        return unidad;
    }
    public Unidad getByCodigo(String codigoP) throws SQLException {
        Connection cn = MyDataSource.getConnection();
        String sql = "SELECT * FROM unidad WHERE codigo = ?";

        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setString(1, codigoP);

        ResultSet rs = pstm.executeQuery();

        Unidad unidad = null;
        if (rs.next()) {
            int unidadId = rs.getInt("id");
            String codigo = rs.getString("codigo");
            String nombre = rs.getString("nombre");
            String observaciones = rs.getString("Observaciones");
            int idCurso = rs.getInt("idCurso");
            int idTutor = rs.getInt("idTutor");
            int idAula = rs.getInt("idAula");

            unidad = new Unidad(unidadId, codigo, nombre, observaciones, idCurso, idTutor, idAula);
        }

        rs.close();
        pstm.close();
        cn.close();

        return unidad;
    }

    @Override
    public List<Unidad> getAll() throws SQLException {
        List<Unidad> unidades = new ArrayList<>();
        Connection cn = MyDataSource.getConnection();
        String sql = "SELECT * FROM unidad";

        Statement stmt = cn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int unidadId = rs.getInt("id");
            String codigo = rs.getString("codigo");
            String nombre = rs.getString("nombre");
            String observaciones = rs.getString("Observaciones");
            int idCurso = rs.getInt("idCurso");
            int idTutor = rs.getInt("idTutor");
            int idAula = rs.getInt("idAula");

            Unidad unidad = new Unidad(unidadId, codigo, nombre, observaciones, idCurso, idTutor, idAula);
            unidades.add(unidad);
        }

        rs.close();
        stmt.close();
        cn.close();

        return unidades;
    }

    @Override
    public int update(Unidad c) throws SQLException {
        Connection cn = MyDataSource.getConnection();
        String sql = "UPDATE unidad SET codigo = ?, nombre = ?, Observaciones = ?, idCurso = ?, idTutor = ?, idAula = ? WHERE id = ?";

        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setString(1, c.getCodigo());
        pstm.setString(2, c.getNombre());
        pstm.setString(3, c.getObservaciones());
        pstm.setInt(4, c.getIdCurso());
        pstm.setInt(5, c.getIdTutor());
        pstm.setInt(6, c.getIdAula());
        pstm.setInt(7, c.getId());

        int rowsUpdated = pstm.executeUpdate();

        pstm.close();
        cn.close();

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Unidad actualizada correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar la unidad");
        }

        return rowsUpdated;
    }

    @Override
    public void delete(int id) throws SQLException {
        Connection cn = MyDataSource.getConnection();
        String sql = "DELETE FROM unidad WHERE id = ?";

        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setInt(1, id);

        int rowsDeleted = pstm.executeUpdate();

        pstm.close();
        cn.close();

        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(null, "Unidad eliminada correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar la unidad");
        }
    }

}
