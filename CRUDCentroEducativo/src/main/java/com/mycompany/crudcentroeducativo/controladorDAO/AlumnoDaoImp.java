/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudcentroeducativo.controladorDAO;

import com.mycompany.crudcentroeducativo.BD.MyDataSource;
import com.mycompany.crudcentroeducativo.Entidades.Alumno;
import com.mycompany.crudcentroeducativo.Entidades.CursoAcademico;
import java.sql.Connection;
import java.sql.Date;
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
public class AlumnoDaoImp implements AlumnoDao{

    private static AlumnoDaoImp instance;
    
    static{//SOLO SE EJECUTA UNA UNICA VEZ
        instance= new AlumnoDaoImp();
    }
    
    private AlumnoDaoImp(){
        
    }
    
    public static AlumnoDaoImp getInstance(){
        return instance;
    }
    
    public int add(Alumno c) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        Connection cn = MyDataSource.getConnection();
        String sql = "insert into alumno (dni,nombre,apellido1,apellido2,fNacimiento,telefono,email,direccion,cp,poblacion)"
                + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setString(1, c.getDni());
        pstm.setString(2, c.getNombre());
        pstm.setString(3, c.getApellido1());
        pstm.setString(4, c.getApellido2());
        pstm.setDate(5, (Date) c.getfNacimiento());
        pstm.setString(6, c.getTelefono());
        pstm.setString(7, c.getEmail());
        pstm.setString(8, c.getDireccion());
        pstm.setString(9, c.getCp());
        pstm.setString(10, c.getPoblacion());
        pstm.execute();
        return 0;
    }

    @Override
    public AlumnoDao getById(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    @Override
    public List<Alumno> getAll() throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        String sql = "select * from alumno";
        
        try( //CON ESTO ME CIERRA TODO LAS COSAS AUTOMATICAMENTE TRY-RESOURCES
            
            Connection cn=MyDataSource.getConnection();
        
            Statement stmt=cn.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                
                Alumno alumno = new Alumno();
                alumno.setId(rs.getInt("id"));
                alumno.setDni(rs.getString("dni"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido1(rs.getString("apellido1"));
                alumno.setApellido2(rs.getString("apellido2"));
                alumno.setfNacimiento(rs.getDate("fnacimiento"));
                alumno.setTelefono(rs.getString("telefono"));
                alumno.setEmail(rs.getString("email"));
                alumno.setDireccion(rs.getString("direccion"));
                alumno.setCp(rs.getString("cp"));
                alumno.setPoblacion(rs.getString("poblacion"));
                listaAlumnos.add(alumno);

            }
            
            rs.close();
            stmt.close();
            return listaAlumnos;
        }
    }

    @Override
    public int update(AlumnoDao c) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int add(AlumnoDao c) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
