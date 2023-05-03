/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudcentroeducativo.BD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author alejandrobalangutierrez
 */
public class MyDataSource {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/centroeducativo"; //?user=userCentroEducativo
    private static final String user = "userCentroEducativo";
    private static final String pass = "1234";
    private static Connection cn;
    
    
    public static void Conecta(){
        try {
            cn=DriverManager.getConnection(url,user,pass);
            System.out.println("Conexión establecida");
            
        } catch (Exception e) {
            System.out.println("Error al conectar"+e.getMessage());
        }
    }
    
   
    
    public static Connection getConnection(){
        Conecta();
        return cn;
    }
    
}
