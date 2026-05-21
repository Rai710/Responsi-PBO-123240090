/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Karyawan;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Lab Informatika
 */
public class ModelTableKaryawan extends AbstractTableModel{
    List<ModelKaryawan> daftarKaryawan;
      
    String kolom[] = {"id","nama","divisi","target","disiplin","inovasi", "Nilai_akhir","status"};
    public ModelTableKaryawan(List <ModelKaryawan> daftarKaryawan){
          this.daftarKaryawan = daftarKaryawan;
    }
      
     
      @Override
     public int getRowCount(){
          return daftarKaryawan.size();
     }
     
      @Override
     public int getColumnCount(){
         return kolom.length;
     }
     
    @Override
     public Object getValueAt(int rowIndex, int ColumnIndex){
         switch (ColumnIndex) {
             case 0:
                return daftarKaryawan.get(rowIndex).getId();
             case 1 :
                 return daftarKaryawan.get(rowIndex).getNama();
             case 2 :
                 return daftarKaryawan.get(rowIndex).getTarget();
             case 3 :
                 return daftarKaryawan.get(rowIndex).getDisiplin();
             case 4 :
                 return daftarKaryawan.get(rowIndex).getInovasi();
             case 5 : 
                 return daftarKaryawan.get(rowIndex).getAkhir();
             case 6 :
                 return daftarKaryawan.get(rowIndex).getStatus();
             default:
                 return null;
                 
         }
     }
}   
