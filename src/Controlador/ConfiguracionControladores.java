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
    private PanelAdmin views;
    
    public ConfiguracionControladores(PanelAdmin views){
        this.views=views;
        this.views.JLabelCategorias.addMouseListener(this);
        this.views.JLabelClientes.addMouseListener(this);
        this.views.JLabelConfig.addMouseListener(this);
        this.views.JLabelNuevaCompra.addMouseListener(this);
        this.views.JLabelNuevaVenta.addMouseListener(this);
        this.views.JLabelProveedor.addMouseListener(this);
        this.views.JLabelUsuarios.addMouseListener(this);
        this.views.JLabelProductos.addMouseListener(this);
        
      

    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.JLabelNuevaCompra) {
            /*añadido-sacar*******************************************************
            Nueva_Compra nc = new Nueva_Compra();
            nc.setVisible(true);
            Login.setVisible(false);*/
            //añadido-sacar********************************************************
            views.JTabbedPanel.setSelectedIndex(6); 
        }else if (e.getSource() == views.JLabelNuevaVenta) {
         //añadido-sacar*******************************************************
           /*Nueva_Venta1 nv=new Nueva_Venta1();
           nv.setVisible(true);
           Login.setVisible(false);*/
        //añadido-sacar********************************************************
            views.JTabbedPanel.setSelectedIndex(5);
            }else if (e.getSource() == views.JLabelClientes) {
            views.JTabbedPanel.setSelectedIndex(0);
            }else if (e.getSource() == views.JLabelUsuarios) {
            views.JTabbedPanel.setSelectedIndex(2);
            } else if (e.getSource() == views.JLabelCategorias){
            views.JTabbedPanel.setSelectedIndex(3);
            } else if (e.getSource() == views.JLabelProductos) {
            views.JTabbedPanel.setSelectedIndex(4);
            } else if (e.getSource() == views.JLabelConfig) {
            views.JTabbedPanel.setSelectedIndex(7);
            } else if (e.getSource() == views.JLabelProveedor) {
            views.JTabbedPanel.setSelectedIndex(1);

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
        if (e.getSource() == views.JLabelCategorias) {
            views.JPanelCategorias.setBackground(new Color(241, 196, 15));
        } else if (e.getSource() == views.JLabelClientes){
            views.JPanleClientes.setBackground(new Color(241, 196, 15));
        }else if (e.getSource() == views.JLabelConfig){
            views.JPanelConfig.setBackground(new Color(241, 196, 15));
        } else if (e.getSource() == views.JLabelNuevaCompra){
            views.JPanelNuevaCompra.setBackground(new Color(241, 196, 15));
        }else if (e.getSource() == views.JLabelNuevaVenta) {
            views.JPanelNuevaVenta.setBackground(new Color(241, 196, 15));
        } else if (e.getSource() == views.JLabelProductos) {
            views.JPanelProductos.setBackground(new Color(241, 196, 15));
        }else if (e.getSource() == views.JLabelProveedor) {
            views.JPanelProveedor.setBackground(new Color(241, 196, 15));
        } else if (e.getSource() == views.JLabelUsuarios) {
            views.JPanelUsuarios.setBackground(new Color(241, 196, 15));
        }    
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == views.JLabelCategorias) {
            views.JPanelCategorias.setBackground(new Color(255,243,81));
        } else if (e.getSource() == views.JLabelClientes)
            views.JPanleClientes.setBackground(new Color(255,243,81));
        if (e.getSource() == views.JLabelConfig) {
            views.JPanelConfig.setBackground(new Color(255,243,81));
        } else if (e.getSource() == views.JLabelNuevaCompra) {
            views.JPanelNuevaCompra.setBackground(new Color(255,243,81));
        }
        if (e.getSource() == views.JLabelNuevaVenta) {
            views.JPanelNuevaVenta.setBackground(new Color(255,243,81));
        } else if (e.getSource() == views.JLabelProductos) {
            views.JPanelProductos.setBackground(new Color(255,243,81));
        }
        if (e.getSource() == views.JLabelProveedor) {
            views.JPanelProveedor.setBackground(new Color(255,243,81));
        } else if (e.getSource() == views.JLabelUsuarios) {
            views.JPanelUsuarios.setBackground(new Color(255,243,81));
        }
    }
    
}
