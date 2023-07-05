/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.de1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class test extends JFrame implements ActionListener{
    JTable table = new JTable();
    DefaultTableModel model = new DefaultTableModel();
    JScrollPane jScrollPane1 = new JScrollPane();
    test(){
          setSize(700, 400);

  table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Name", "Email", "Security Question", "Address", "Status"
            }
        ));
   model = (DefaultTableModel) table.getModel();
   model.addRow(new Object[]{
                   "Jim", "Jim@gmail.com", "How are you", "81 GL", "Hehe"
                });
  
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            } 
        });
        jScrollPane1.setViewportView(table);
        
        this.add(jScrollPane1);
        
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        
    }
    
    private void jTable1MouseClicked(MouseEvent evt) {
        int index = table.getSelectedRow();
        System.out.println(index);
    }
    
    public static void main(String[] args) {
        test t = new test();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
