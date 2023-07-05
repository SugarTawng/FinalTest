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
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import project.ConnectionProvider;
import project.InsertUpdateDelete;
import project.Select;

/**
 *
 * @author admin
 */
public class thongTinSuaChua extends JFrame implements ActionListener {

    JButton themButton;
    JLabel LIMEI, LTenDT, LHoTenKH, LNgayLap, LND, LDSCV, LDSCVSC;
    JTextField TIMEI, TTenDT, THoTenKH, TNgayLap;
    JTextArea TAND;
    JTable DSCV, DSSC;
    JScrollPane SCV, SSC;
    String maPSC , imei, ngaylap;
    
     thongTinSuaChua() {
        CreateAndShow();
        showDSCV();
    }
    
    private void CreateAndShow(){
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
        TAND.setEditable(false);
        
        LDSCV = new JLabel("Danh sach cong viec");
        DSCV = new JTable();
        DSCV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
               "Ma cong viec", "Cong viec"
            }
        ));
        LDSCVSC = new JLabel("Danh sach sua chua");
        DSSC = new JTable();
        DSSC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
               "Cong viec", "Don gia"
            }
        ));
        SCV = new JScrollPane();
        SSC = new JScrollPane();
        SCV.setViewportView(DSCV);
        SSC.setViewportView(DSSC);
        

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
        this.add(LDSCV);
        this.add(SCV);
        this.add(LDSCVSC);
        this.add(SSC);
        
        this.add(themButton);
        
        
        themButton.setActionCommand("them");
        themButton.addActionListener(this);
        
        TIMEI.setActionCommand("enter");
        TIMEI.addActionListener(this);
        TNgayLap.setActionCommand("enter2");
        TNgayLap.addActionListener(this);
        
        DSCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DSCVMouseClicked(evt);
            } 
        });
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());   
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
          if("enter".equals(e.getActionCommand())){
            try{
                ResultSet rs;
                imei = TIMEI.getText();
                String query = "select * from DIENTHOAI where IMEI = '"+imei+"'";
               rs = Select.getData(query);
                while(rs.next()){
                    TTenDT.setText(rs.getString(2));
                    THoTenKH.setText(rs.getString(4));   
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
          
           if("enter2".equals(e.getActionCommand())){
            try{
                ResultSet rs;
                ngaylap = TNgayLap.getText();
                imei = TIMEI.getText();
                String query = "select * from SUACHUA where IMEI = '"+imei+"' and NGAYLAP = '"+ngaylap+"'";
                rs = Select.getData(query);
                while(rs.next()){
                    TAND.setText(rs.getString(3)); 
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
    }
           if("them".equals(e.getActionCommand())){
            try{
            ResultSet rs;
            String query = "select * from CONGVIEC CV, CT_SC CT where CV.MACV = CT.MACV and CT.MAPSC ='"+maPSC+"'";
            rs = Select.getData(query);
            long  tong = 0;
            while(rs.next()){
                tong += (rs.getInt(3));
            }
             query = "update SUACHUA set TONGTIEN = "+tong+" where MAPSC = '"+maPSC+"'";
             InsertUpdateDelete.setData(query);
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }      
}

    private void showDSCV() {
        try{
            String query = "select * from CONGVIEC";
           ResultSet rs = Select.getData(query);
            
            DefaultTableModel model = (DefaultTableModel) DSCV.getModel();
            model.setRowCount(0);
            
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString(1), rs.getString(2)
                });
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void DSCVMouseClicked(MouseEvent evt) {
          int index = DSCV.getSelectedRow();
        
        TableModel model = DSCV.getModel();
        String maCV = model.getValueAt(index,0).toString();
        try{
        ngaylap = TNgayLap.getText();
        imei = TIMEI.getText();
        String query = "select * from SUACHUA where IMEI = '"+imei+"' and NGAYLAP = '"+ngaylap+"'";
        ResultSet rs = Select.getData(query);
        while(rs.next()){
         maPSC = rs.getString(1);
        }
        query = "insert into CT_SC (MAPSC, MACV) values ('"+maPSC+"','"+ maCV+"')";
        InsertUpdateDelete.setData(query);
        showDSSC(maPSC);
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
   }
    
        public static void main(String[] args) {
        thongTinSuaChua ttsc = new thongTinSuaChua();
    }

    private void showDSSC(String maPSC) {
        try{
            String query = "select * from CONGVIEC CV, CT_SC CT where CV.MACV = CT.MACV and CT.MAPSC ='"+maPSC+"'";
            ResultSet rs = Select.getData(query);
            
            DefaultTableModel model = (DefaultTableModel) DSSC.getModel();
            model.setRowCount(0);
            
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString(2), rs.getString(3)
                });
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
    
