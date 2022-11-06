/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
//clase para realizar las consultas a nuestras bases de datos

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuariosDao {
    Conexion consulta=new Conexion(); //instancia de la conexion
    Connection conexion; //importar conecction
    PreparedStatement preparedstament; //PreparedStatement permite someter a una base de datos varios mandatos SQL
    ResultSet resultset; //Un ResultSet contiene todas las filas que satisfacen las condiciones de una sentencia SQL y proporciona el acceso a los datos de estas filas

    
    //creamos metodo login
    public Usuarios login(String usuario, String clave){ //parametros 
        //creamos variable para ejecutar nuestras consultas
        String sql= "SELECT * from usuarios WHERE  usuario =? AND clave =?";
        Usuarios user=new Usuarios();
        
        //CREAMOS TRY CATCH PARA CAPTURAR LAS EXCEPCIONES************************
        try{
        conexion =consulta.getConexion();//creamos metodo getconexion
        preparedstament=conexion.prepareStatement(sql);
        preparedstament.setString(1, usuario);//en el indice 1 mandamos usuario
        preparedstament.setString(2, clave);
        //para ejecutar consulta
        resultset=preparedstament.executeQuery();
        
        if(resultset.next()){
            user.setId(resultset.getInt("id"));
            user.setUsuario(resultset.getString("usuario"));
            user.setNombre(resultset.getString("nombre"));
            user.setCaja(resultset.getString("caja"));
            user.setRol(resultset.getString("rol"));
            user.setEstado(resultset.getString("estado"));

        }
    }catch (SQLException e){
    JOptionPane.showMessageDialog(null, e.toString());
    }
    return user; //retornar usuarios
    }
}


