package Controlador;

import Modelo.Cliente;
import Modelo.ClienteDao;
import Vista.PanelAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ClienteController implements ActionListener{

    private Cliente cl;
    private ClienteDao clDao;
    private PanelAdmin views;

    public ClienteController(Cliente cl, ClienteDao clDao, PanelAdmin views) {
        this.cl = cl;
        this.clDao = clDao;
        this.views = views;
        this.views.btnRegistrarCliente.addActionListener(this);
    }   
  
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==views.btnRegistrarCliente){
            if(views.txtNombreCliente.getText().equals("")||views.txtApellidoCliente.getText().equals("")
                    ||views.txtTelefonoCliente.getText().equals("")||views.txtDireccionCliente.getText().equals("")
                    ||views.txtRucCliente.getText().equals("")||views.txtEmailCliente.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios");
            }else{
                cl.setNombres(views.txtNombreCliente.getText());
                cl.setApellidos(views.txtApellidoCliente.getText());
                cl.setDireccion(views.txtDireccionCliente.getText());
                cl.setRuc(views.txtRucCliente.getText());
                cl.setTelefono(views.txtTelefonoCliente.getText());
                cl.setEmail(views.txtEmailCliente.getText());
                if(clDao.registrar(cl)){
                    JOptionPane.showMessageDialog(null,"Cliente registrado con exito");
                }else{
                    JOptionPane.showMessageDialog(null,"Error al registrar al Cliente");
                }
                
            }
        }
   }
    
}
