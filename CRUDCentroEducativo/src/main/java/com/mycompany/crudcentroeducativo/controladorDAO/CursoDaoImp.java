/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudcentroeducativo.controladorDAO;

import com.mycompany.crudcentroeducativo.BD.MyDataSource;
import com.mycompany.crudcentroeducativo.Entidades.Curso;
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
public class CursoDaoImp implements CursoDao {

    private static CursoDaoImp instance;

    static {//SOLO SE EJECUTA UNA UNICA VEZ
        instance = new CursoDaoImp();
    }

    private CursoDaoImp() {

    }

    public static CursoDaoImp getInstance() {
        return instance;
    }

    @Override
    public int add(Curso u) throws SQLException {
        String sql = "INSERT INTO curso (codigo, nombre, observaciones, idcursoacademico) VALUES (?, ?, ?, ?)";

        try (Connection cn = MyDataSource.getConnection(); PreparedStatement statement = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, u.getCodigo());
            statement.setString(2, u.getNombre());
            statement.setString(3, u.getObservaciones());
            statement.setInt(4, u.getIdcursoacademico());

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                ResultSet rs = statement.getGeneratedKeys();
                if (rs.next()) {
                    int generatedId = rs.getInt(1);
                    return generatedId;
                }
            }
        }

        throw new SQLException("Error al agregar el curso. No se generó el ID del curso.");
    }

    @Override
    public Curso getById(int id) throws SQLException {
        Connection cn = MyDataSource.getConnection();
        String sql = "SELECT * FROM curso WHERE id = ?";

        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setInt(1, id);

        ResultSet rs = pstm.executeQuery();

        if (rs.next()) {
            Curso curso = new Curso();
            curso.setId(rs.getInt("id"));
            curso.setCodigo(rs.getString("codigo"));
            curso.setNombre(rs.getString("nombre"));
            curso.setObservaciones(rs.getString("observaciones"));
            curso.setIdcursoacademico(rs.getInt("idcursoacademico"));
            return curso;
        } else {
            return null; // Devuelve null si no se encuentra el curso
        }
    }

    @Override
    public List<Curso> getAll() throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        ArrayList<Curso> listaCursos = new ArrayList<>();
        String sql = "select * from curso";

        try ( //CON ESTO ME CIERRA TODO LAS COSAS AUTOMATICAMENTE TRY-RESOURCES

                Connection cn = MyDataSource.getConnection(); Statement stmt = cn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {

                Curso curso = new Curso();
                curso.setId(rs.getInt("id"));
                curso.setCodigo(rs.getString("codigo"));
                curso.setNombre(rs.getString("nombre"));
                curso.setObservaciones(rs.getString("observaciones"));
                curso.setIdcursoacademico(rs.getInt("idcursoacademico"));
                listaCursos.add(curso);

            }

            rs.close();
            stmt.close();
            return listaCursos;
        }
    }

    @Override
    public int update(Curso curso) throws SQLException {
        String sql = "UPDATE curso SET codigo=?, nombre=?, observaciones=?, idcursoacademico=? WHERE id=?";

        try (Connection cn = MyDataSource.getConnection(); PreparedStatement stmt = cn.prepareStatement(sql)) {
            stmt.setString(1, curso.getCodigo());
            stmt.setString(2, curso.getNombre());
            stmt.setString(3, curso.getObservaciones());
            stmt.setInt(4, curso.getIdcursoacademico());
            stmt.setInt(5, curso.getId());

            return stmt.executeUpdate();
        }
    }

    @Override
    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM curso WHERE id = ?";

        try (Connection cn = MyDataSource.getConnection(); PreparedStatement stmt = cn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    @Override
    public CursoAcademico getCursoAcademico(Curso cu) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Curso> getAllByCursoAcademico(int idCursoAcademico) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Curso getByCodigo(String codigo) throws SQLException {
        Connection cn = MyDataSource.getConnection();
        String sql = "SELECT * FROM curso WHERE codigo = ?";

        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setString(1, codigo);

        ResultSet rs = pstm.executeQuery();

        if (rs.next()) {
            Curso curso = new Curso();
            curso.setId(rs.getInt("id"));
            curso.setCodigo(rs.getString("codigo"));
            curso.setNombre(rs.getString("nombre"));
            curso.setObservaciones(rs.getString("observaciones"));
            curso.setIdcursoacademico(rs.getInt("idcursoacademico"));
            return curso;
        }

        return null;
    }

}
