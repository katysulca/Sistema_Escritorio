/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author YOSELYN
 */
public class Conexion {
    Connection con;
    public Connection getConexion(){
        try{
            //crear variable
            String db="jdbc:mysql://localhost:3306/SV_ferreteria";
            con= DriverManager.getConexion(db, "root", "");
            
        }
        return null;
        
    }
}

