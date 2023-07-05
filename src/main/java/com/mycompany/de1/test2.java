/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.de1;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import project.Select;

/**
 *
 * @author admin
 */
public class test2 extends JFrame implements ActionListener {
JComboBox<String> cLoaiDT;
  JButton themButton;
String a;
    test2(){
        setSize(700, 400);
        cLoaiDT = new JComboBox<String>();
        themButton = new JButton("Them");

        this.add(cLoaiDT);
        this.add(themButton);
        
        
        try{
            ResultSet rs = Select.getData("select * from congviec");
            while(rs.next()){
                cLoaiDT.addItem(rs.getString(2));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        themButton.setActionCommand("them");
        themButton.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        test2 t = new test2();
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        a = (String)cLoaiDT.getSelectedItem();
        
        if("them".equals(e.getActionCommand())){
            System.out.println(a);
        }
    }   
}
