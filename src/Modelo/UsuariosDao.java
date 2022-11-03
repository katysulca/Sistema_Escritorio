/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
//clase para realizar las 
//consultas a nuestras bases de datos

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuariosDao {
    Conexion cn=new Conexion(); //instancia de la conexion
    Connection con; //importar conecction
    PreparedStatement ps; //PreparedStatement permite someter a una base de datos varios mandatos SQL
    ResultSet rs; //Un ResultSet contiene todas las filas que satisfacen las condiciones de una sentencia SQL y proporciona el acceso a los datos de estas filas

    
    //creamos metodo login
    public Usuarios login(String usuario, String clave){ //parametros 
        //creamos variable para ejecutar nuestras consultas
        String sql= "SELECT * from usuarios WHERE  usuario =? AND clave =?";
        Usuarios us=new Usuarios();
        //CREAMOS TRY CATCH PARA CAPTURAR LAS EXCEPCIONES
        try{
        con =cn.getConexion();
        ps=con.prepareStatement(sql);
        ps.setString(1, usuario);
        ps.setString(2, clave);
        rs=ps.executeQuery();
        
        if(rs.next()){
            us.setId(rs.getInt("id"));
            us.setUsuario(rs.getString("usuario"));
            us.setNombre(rs.getString("nombre"));
            us.setCaja(rs.getString("caja"));
            us.setRol(rs.getString("rol"));
            us.setEstado(rs.getString("estado"));

        }
    }catch (SQLException e){
    JOptionPane.showMessageDialog(null, e.toString());
    }
    return us;
    }
}


