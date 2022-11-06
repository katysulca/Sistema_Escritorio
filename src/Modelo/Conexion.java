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
Para conectar la base de datos
 */

//Creamos clase Conexion
public class Conexion {
    Connection conexion; //objeto creado de la clase Conexion

    //cramos un metodo 
    public Connection getConexion(){
        //try para capturar alguna excepciones
        try{
            //crear variable
            String url="jdbc:mysql://localhost:3306/sisventa";//url es la referencia donde tengo almacenada mi base de daatos
            conexion= DriverManager.getConnection(url, "root", "");
            return conexion;
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
        return null; //para cerrar la conexion
        
    }
}

