/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.de1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import project.ConnectionProvider;
import project.InsertUpdateDelete;
import project.Select;

/**
 *
 * @author admin
 */
public class themSuaChua extends JFrame implements ActionListener {
    JButton themButton;
    JLabel LIMEI, LTenDT, LHoTenKH, LNgayLap, LND;
    JTextField TIMEI, TTenDT, THoTenKH, TNgayLap;
    JTextArea TAND;
    
    
    themSuaChua(){
        setSize(700, 400);
        LIMEI = new JLabel("So IMEI");
        TIMEI = new JTextField("123456789");
        LTenDT = new JLabel("Ten dien thoai");
        TTenDT = new JTextField("Iphone 13 Pro");
        LHoTenKH = new JLabel("Ho ten khach hang");
        THoTenKH = new JTextField("Nguyen C");
        LNgayLap = new JLabel("Ngay lap");
        TNgayLap = new JTextField("2022/06/1");
        LND = new JLabel("Noi dung sua chua");
        TAND = new JTextArea("Thay man hinh");
        themButton = new JButton("Them");
        TTenDT.setEditable(false);
        THoTenKH.setEditable(false);
        
        this.add(LIMEI);
        this.add(TIMEI);
        this.add(LTenDT);
        this.add(TTenDT);
        this.add(LHoTenKH);
        this.add(THoTenKH);
        this.add(LNgayLap);
        this.add(TNgayLap);
        this.add(LND);
        this.add(TAND);
        this.add(themButton);
        this.add(themButton);
        themButton.setActionCommand("them");
        themButton.addActionListener(this);
        TIMEI.setActionCommand("enter");
        TIMEI.addActionListener(this);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args){
        themSuaChua theSuaChua = new themSuaChua();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if("them".equals(e.getActionCommand())){
            try{
            String ngayLap = TNgayLap.getText();
            String noiDung = TAND.getText();
            String imei = TIMEI.getText();
            String query = "insert into SUACHUA (NGAYLAP, NOIDUNG, IMEI) values ('"+ngayLap+"','"+ noiDung+"','"+imei+"')";
            InsertUpdateDelete.setData(query);
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        
        if("enter".equals(e.getActionCommand())){
            try{
                String imei = TIMEI.getText();
                String query = "select * from DIENTHOAI where IMEI = '"+imei+"'";
                ResultSet rs = Select.getData(query);
                while(rs.next()){
                    TTenDT.setText(rs.getString(2));
                    THoTenKH.setText(rs.getString(4));   
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
}
