/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudcentroeducativo.controladorDAO;

import com.mycompany.crudcentroeducativo.BD.MyDataSource;
import com.mycompany.crudcentroeducativo.Entidades.Aula;
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
public class AulaDaoImp implements AulaDao{
    private static AulaDaoImp instance;
    
    static{//SOLO SE EJECUTA UNA UNICA VEZ
        instance= new AulaDaoImp();
    }
    
    private AulaDaoImp(){
        
    }
    
    public static AulaDaoImp getInstance(){
        return instance;
    }
    
    @Override
    public int add(Aula c) throws SQLException {
        Connection cn = MyDataSource.getConnection();
        String sql = "INSERT INTO aula (codigo, descripcion) VALUES (?, ?)";

        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setString(1, c.getCodigo());
        pstm.setString(2, c.getDescripcion());

        int rowsAffected = pstm.executeUpdate();
         JOptionPane.showMessageDialog(null, "Añadido correctamente");
        return rowsAffected;
    }

        @Override
    public Aula getById(int id) throws SQLException {
        Connection cn = MyDataSource.getConnection();
        String sql = "SELECT * FROM aula WHERE id = ?";

        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setInt(1, id);

        ResultSet rs = pstm.executeQuery();

        if (rs.next()) {
            Aula aula = new Aula();
            aula.setId(rs.getInt("id"));
            aula.setCodigo(rs.getString("codigo"));
            aula.setDescripcion(rs.getString("descripcion"));
            return aula;
        }

        return null;
    }
    public Aula getByCodigo(String codigo) throws SQLException {
        Connection cn = MyDataSource.getConnection();
        String sql = "SELECT * FROM aula WHERE codigo = ?";

        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setString(1, codigo);

        ResultSet rs = pstm.executeQuery();

        if (rs.next()) {
            Aula aula = new Aula();
            aula.setId(rs.getInt("id"));
            aula.setCodigo(rs.getString("codigo"));
            aula.setDescripcion(rs.getString("descripcion"));
            JOptionPane.showMessageDialog(null, "Encontrado");
            return aula;
        }
         JOptionPane.showMessageDialog(null, "No se ha encontrado");
        return null;
    }
    
    @Override
    public List<Aula> getAll() throws SQLException {
        Connection cn = MyDataSource.getConnection();
        String sql = "SELECT * FROM aula";

        Statement stmt = cn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        List<Aula> aulas = new ArrayList<>();

        while (rs.next()) {
            Aula aula = new Aula();
            aula.setId(rs.getInt("id"));
            aula.setCodigo(rs.getString("codigo"));
            aula.setDescripcion(rs.getString("descripcion"));
            aulas.add(aula);
        }

        return aulas;
    }

    @Override
    public int update(Aula c) throws SQLException {
        Connection cn = MyDataSource.getConnection();
        String sql = "UPDATE aula SET codigo = ?, descripcion = ? WHERE id = ?";

        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setString(1, c.getCodigo());
        pstm.setString(2, c.getDescripcion());
        pstm.setInt(3, c.getId());

        int rowsAffected = pstm.executeUpdate();
         JOptionPane.showMessageDialog(null, "Actualizado");
        return rowsAffected;
    }

    @Override
    public void delete(int id) throws SQLException {
        Connection cn = MyDataSource.getConnection();
        String sql = "DELETE FROM aula WHERE id = ?";

        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setInt(1, id);
        pstm.execute();
         JOptionPane.showMessageDialog(null, "Eliminado correctamente");
    }
    
}
