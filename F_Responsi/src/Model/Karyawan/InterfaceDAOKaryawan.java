/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model.Karyawan;
import java.util.List;

/**
 *
 * @author Lab Informatika
 */
public interface InterfaceDAOKaryawan {
   public void insert (ModelKaryawan karyawan);
   public void update (ModelKaryawan karyawan);
   public void delete (Integer id);
   
   public List<ModelKaryawan> getaAll();
}
