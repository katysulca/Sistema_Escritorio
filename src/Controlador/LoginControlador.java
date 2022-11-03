/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuarios;
import Modelo.UsuariosDao;
import Vista.Login;
import Vista.PanelAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 
 */
public class LoginControlador implements ActionListener{ //implementamos librería
    //encapsular la clase usuarios
    private Usuarios us;
    private UsuariosDao usDao;
    private Login v_login;
    
    //creeamos constructor

    public LoginControlador(Usuarios us, UsuariosDao usDao, Login v_login) {
        this.us = us;
        this.usDao = usDao;
        this.v_login = v_login;
        this.v_login.btnLogin.addActionListener(this);
        this.v_login.btnCancelar.addActionListener(this);
        this.v_login.setLocationRelativeTo(null);
    }   
    @Override
    public void actionPerformed(ActionEvent e) {
        //hacer validación
        //que boton se ha presionado
        if(e.getSource()==v_login.btnLogin){
            if(v_login.txtUsuario.getText().equals("")|| String.valueOf(v_login.txtClave.getPassword()).equals("")){
               JOptionPane.showMessageDialog(null, "Los campos estan vacíos");
            }else{
                String usuario = v_login.txtUsuario.getText();
                String clave=String.valueOf(v_login.txtClave.getPassword());
                us=usDao.login(usuario, clave);
                if (us.getUsuario()!=null) {
                    PanelAdmin admin=new PanelAdmin();
                    admin.setVisible(true);
                    this.v_login.dispose();
                    //si el usuario y password no coinciden
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario o contraseñpa incorrecta");

                }
            }
        
        }else{
            int pregunta=JOptionPane.showConfirmDialog(null, "Estas seguro que deseas salir", "Pregunta",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (pregunta==0) {
                System.exit(0);
            }
        }
    }
    
    
    
}
