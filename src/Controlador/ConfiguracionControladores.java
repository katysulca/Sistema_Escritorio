/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.PanelAdmin;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author YOSELYN
 */
public class ConfiguracionControladores implements MouseListener {

    //instanciar
    private PanelAdmin Login;
    
    public ConfiguracionControladores(PanelAdmin Login){
        this.Login=Login;
        this.Login.JLabelCategorias.addMouseListener(this);
        this.Login.JLabelClientes.addMouseListener(this);
        this.Login.JLabelConfig.addMouseListener(this);
        this.Login.JLabelNuevaCompra.addMouseListener(this);
        this.Login.JLabelNuevaVenta.addMouseListener(this);
        this.Login.JLabelProveedor.addMouseListener(this);
        this.Login.JLabelUsuarios.addMouseListener(this);
        this.Login.JLabelProductos.addMouseListener(this);
      

    }
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
                if (e.getSource()== Login.JLabelCategorias) {
            Login.JPanelCategorias.setBackground(new Color (255,51,51));
        }else if(e.getSource()==Login.JLabelClientes)
                Login.JPanleClientes.setBackground(new Color(255, 51, 51));


    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
