/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Lab Informatika
 */

import View.Karyawan.ViewData;
import Model.Karyawan.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class controllerKaryawan {
    ViewData halamanView;
    InterfaceDAOKaryawan DAOKaryawan;
    List<ModelKaryawan> daftarKaryawan;
    
    public controllerKaryawan(ViewData halamanView){
        this.halamanView = halamanView;
        this. DAOKaryawan = new DAOKaryawan();
    }
    
    public void showAllKaryawan(){
        daftarKaryawan = DAOKaryawan.getaAll();
        ModelTableKaryawan modelTabel =  new ModelTableKaryawan(daftarKaryawan);
    }
    public void insertKaryawan(){
        try {
            
        } catch (Exception e) {
        }
    }
    
}
