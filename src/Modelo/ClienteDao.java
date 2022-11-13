/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class ClienteDao {
  Conexion consulta=new Conexion(); //instancia de la conexion
    Connection conexion; //importar conecction
    PreparedStatement preparedstament; //PreparedStatement permite someter a una base de datos varios mandatos SQL
    ResultSet resultset; 
    
    public boolean registrar(Cliente cl){
        String sql ="insert into cliente(nombres,apellidos, ruc, direccion, telefono,email)values(??????)";
        try {
            conexion=consulta.getConexion();
            preparedstament=conexion.prepareStatement(sql);
            preparedstament.setString(1, cl.getNombres());
            preparedstament.setString(2, cl.getApellidos());
            preparedstament.setString(3, cl.getRuc());
            preparedstament.setString(4, cl.getDireccion());
            preparedstament.setString(5, cl.getTelefono());
            preparedstament.setString(6, cl.getEmail());
            preparedstament.execute();
            return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
}
