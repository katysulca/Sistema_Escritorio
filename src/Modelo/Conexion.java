/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
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
            con= DriverManager.getConnection(db, "root", "");
            return con;
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
        return null; //para cerrar la conexion
        
    }
}

