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
        if (e.getSource() == Login.JLabelNuevaCompra) {
            Login.JTabbedPanel.setSelectedIndex(5);  
        }else if (e.getSource() == Login.JLabelNuevaVenta) {
            Login.JTabbedPanel.setSelectedIndex(6);
            }else if (e.getSource() == Login.JLabelClientes) {
            Login.JTabbedPanel.setSelectedIndex(0);
            }else if (e.getSource() == Login.JLabelUsuarios) {
            Login.JTabbedPanel.setSelectedIndex(2);
            } else if (e.getSource() == Login.JLabelCategorias){
            Login.JTabbedPanel.setSelectedIndex(3);
            } else if (e.getSource() == Login.JLabelProductos) {
            Login.JTabbedPanel.setSelectedIndex(4);
            } else if (e.getSource() == Login.JLabelConfig) {
            Login.JTabbedPanel.setSelectedIndex(7);
            } else if (e.getSource() == Login.JLabelProveedor) {
            Login.JTabbedPanel.setSelectedIndex(1);

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == Login.JLabelCategorias) {
            Login.JPanelCategorias.setBackground(new Color(241, 196, 15));
        } else if (e.getSource() == Login.JLabelClientes){
            Login.JPanleClientes.setBackground(new Color(241, 196, 15));
        }else if (e.getSource() == Login.JLabelConfig){
            Login.JPanelConfig.setBackground(new Color(241, 196, 15));
        } else if (e.getSource() == Login.JLabelNuevaCompra){
            Login.JPanelNuevaCompra.setBackground(new Color(241, 196, 15));
        }else if (e.getSource() == Login.JLabelNuevaVenta) {
            Login.JPanelNuevaVenta.setBackground(new Color(241, 196, 15));
        } else if (e.getSource() == Login.JLabelProductos) {
            Login.JPanelProductos.setBackground(new Color(241, 196, 15));
        }else if (e.getSource() == Login.JLabelProveedor) {
            Login.JPanelProveedor.setBackground(new Color(241, 196, 15));
        } else if (e.getSource() == Login.JLabelUsuarios) {
            Login.JPanelUsuarios.setBackground(new Color(241, 196, 15));
        }    
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == Login.JLabelCategorias) {
            Login.JPanelCategorias.setBackground(new Color(255,243,81));
        } else if (e.getSource() == Login.JLabelClientes)
            Login.JPanleClientes.setBackground(new Color(255,243,81));
        if (e.getSource() == Login.JLabelConfig) {
            Login.JPanelConfig.setBackground(new Color(255,243,81));
        } else if (e.getSource() == Login.JLabelNuevaCompra) {
            Login.JPanelNuevaCompra.setBackground(new Color(255,243,81));
        }
        if (e.getSource() == Login.JLabelNuevaVenta) {
            Login.JPanelNuevaVenta.setBackground(new Color(255,243,81));
        } else if (e.getSource() == Login.JLabelProductos) {
            Login.JPanelProductos.setBackground(new Color(255,243,81));
        }
        if (e.getSource() == Login.JLabelProveedor) {
            Login.JPanelProveedor.setBackground(new Color(255,243,81));
        } else if (e.getSource() == Login.JLabelUsuarios) {
            Login.JPanelUsuarios.setBackground(new Color(255,243,81));
        }
    }
    
}
