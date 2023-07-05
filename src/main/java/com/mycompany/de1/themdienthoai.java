/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.de1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import project.ConnectionProvider;
import project.InsertUpdateDelete;

/**
 *
 * @author admin
 */
public class themdienthoai extends JFrame implements ActionListener {
    JButton themButton;
    JLabel soIMEI, tenDT, loaiDT, hotenKH, SDTKH;
    JTextField tSoIMEI, tTenDT, tHoTenKH, tSoDTKH;
    JComboBox<String> cLoaiDT;
    String _soIMEI, _tenDT, _loaiDT, _hotenKH, _SDTKH;
    
     themdienthoai(){
        setSize(700, 400);
        soIMEI = new JLabel("soIMEI");
        tSoIMEI = new JTextField("1234567890");
        
        tenDT = new JLabel("Ten dien thoai");
        tTenDT = new JTextField("Ten dien thoai");
        
        loaiDT = new JLabel("Loai dien thoai");
       cLoaiDT = new JComboBox<String>();
       cLoaiDT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loai 1", "Loai 2" }));
        
       hotenKH = new JLabel("Ho ten khach hang");
       tHoTenKH = new JTextField("Ho ten khach hang");
       
       SDTKH = new JLabel(" So dien thoai khach hang");
       tSoDTKH = new JTextField("So dien thoai khach hang");
       
        themButton = new JButton("Them");
        
       
        this.add(soIMEI);
        this.add(tSoIMEI);
        this.add(tenDT);
        this.add(tTenDT);
        this.add(loaiDT);
        this.add(cLoaiDT);
        this.add(hotenKH);
        this.add(tHoTenKH);
        this.add(SDTKH);
        this.add(tSoDTKH);
         this.add(themButton);
        
        themButton.setActionCommand("them");
        themButton.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }
    
    public static void main(String[] args){
        themdienthoai themdienthoai = new themdienthoai();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("them".equals(e.getActionCommand())){
            try{
             _soIMEI = tSoIMEI.getText();
            _tenDT = tTenDT.getText();
            _loaiDT = (String)cLoaiDT.getSelectedItem();
            _hotenKH = tHoTenKH.getText();
            _SDTKH = tSoDTKH.getText();
              String query = "insert into DIENTHOAI (IMEI, TENDT, LOAIDT, HOTENKH, SDTKH) values ('"+_soIMEI+"','"+ _tenDT+"','"+_loaiDT+"','"+ _hotenKH+"','"+ _SDTKH+"')";
              InsertUpdateDelete.setData(query);
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
}
