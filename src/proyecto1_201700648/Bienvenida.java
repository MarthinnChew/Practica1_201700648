/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_201700648;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
/**
 *
 * @author Marthinn Chew
 */
public class Bienvenida {
    
     public JLabel label1, label2;
     public JButton boton1, boton2, boton3, boton4;
    
    public void Ventana(){                  //Jframe
        JFrame ventana = new JFrame("Sistema de Control de Remesas");
        ventana.setBounds(0,0,600, 400);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);//Sistema de coordenadas
      
    
    label1 = new JLabel("Bienvenido");
    label1.setBounds(140,30,300,100);
    label1.setFont(new Font("Segoe UI", 1, 54)); //1 negrita 2 cursica 3 negrita y cursiva
    label1.setForeground(Color.BLACK);  
    ventana.add(label1);
    
    label2 = new JLabel("Seleccione:");
    label2.setBounds(90,125,100,25);
    label2.setFont(new Font("Segoe UI", 3, 18));
    label2.setForeground(Color.BLACK);
    ventana.add(label2);
    
    boton1 = new JButton("Vendedor");
    boton1.setBounds(140,175,140,30);
    boton1.setBackground(new Color(255,255,255)); //RGB
    boton1.setFont(new Font("Segoe UI", 1, 14));
    boton1.setForeground(new Color(0,0,0));
    //boton1.addActionListener((ActionListener) this);
    ventana.add(boton1); 
    
    boton2 = new JButton("Administrador");
    boton2.setBounds(290,175,140,30);
    boton2.setBackground(new Color(255,255,255));
    boton2.setFont(new Font("Segoe UI", 1, 14));
    boton2.setForeground(new Color(0,0,0));
    //boton2.addActionListener(this);
    ventana.add(boton2);  
    
    boton3 = new JButton("Pagador");
    boton3.setBounds(140,215,140,30);
    boton3.setBackground(new Color(255,255,255));
    boton3.setFont(new Font("Segoe UI", 1, 14));
    boton3.setForeground(new Color(0,0,0));
    //boton3.addActionListener(this);
    ventana.add(boton3);    

    boton4 = new JButton("Observador");
    boton4.setBounds(290,215,140,30);
    boton4.setBackground(new Color(255,255,255));
    boton4.setFont(new Font("Segoe UI", 1, 14));
    boton4.setForeground(new Color(0,0,0));
    //boton4.addActionListener(this);
    ventana.add(boton4);
    
    }

 
}
