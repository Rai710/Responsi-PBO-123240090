/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Karyawan;

import Model.Connector;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lab Informatika
 */
public class DAOKaryawan implements InterfaceDAOKaryawan{
    
    @Override
    public void insert(ModelKaryawan karyawan){
        try{
            String query = "INSERT INTO evaluasi (nama, divisi, nilai_target"
                    + "nilai_disiplin, nilai_inovasi) VALUES"
                    + "(?,?,?,?,>);";
            PreparedStatement statement = Connector.connect().prepareStatement(query);
            
            statement.setString(1, karyawan.getNama());
            statement.setString(2, karyawan.getDivisi());
            statement.setFloat(3, karyawan.getTarget());
            statement.setFloat(4, karyawan.getDisiplin());
            statement.setFloat(5, karyawan.getInovasi());
            
            statement.executeUpdate();
            
            statement.close();
        } catch (SQLException e){
            System.out.println("Input gagal : " + e.getLocalizedMessage());
        }
    }
    
    @Override
    public void update(ModelKaryawan karyawan){
        try{
            String query = "UPDATE evaluasi SET nama = ?, divisi = ?,"
                    + " nilai_target =?, nilai_disiplin = ? , nilai_inovasi =?"
                    + "WHERE id = ? ;";
            PreparedStatement statement = Connector.connect().prepareStatement(query);
            
            statement.setString(1, karyawan.getNama());
            statement.setString(2, karyawan.getDivisi());
            statement.setFloat(3, karyawan.getTarget());
            statement.setFloat(4, karyawan.getDisiplin());
            statement.setFloat(5, karyawan.getInovasi());
            statement.setInt(6, karyawan.getId());
            statement.executeUpdate();
            
            statement.close();
        } catch (SQLException e){
            System.out.println("Input gagal : " + e.getLocalizedMessage());
        }
    }
    
    @Override
    public void delete (Integer id){
        try{
            String query = "DELETE FORM evaluasi WHERE id = ?";
            PreparedStatement statement = Connector.connect().prepareStatement(query);
            
            statement.setInt(6, id);
            statement.executeUpdate();
            
            statement.close();
        } catch (SQLException e){
            System.out.println("Input gagal : " + e.getLocalizedMessage());
        }
    }

    @Override
    public List<ModelKaryawan> getaAll(){
        List<ModelKaryawan> listKaryawan = null;
        try{
            listKaryawan = new ArrayList<>();
            String query = "SELECT * FROM evaluasi";
            
            Statement statement = Connector.connect().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            while(resultSet.next()){
                ModelKaryawan karyawan = new ModelKaryawan();
                karyawan.setId(resultSet.getInt("id"));
                karyawan.setNama(resultSet.getString("nama"));
                karyawan.setDivisi(resultSet.getString("divisi"));
                karyawan.setTarget(resultSet.getFloat("nilai_target"));
                karyawan.setDisiplin(resultSet.getFloat("nilai_disiplin"));
                karyawan.setInovasi(resultSet.getFloat("nilai_inovasi"));
                karyawan.setAkhir(resultSet.getFloat("nilai_akhir"));
                karyawan.setStatus(resultSet.getString("status"));
                
                listKaryawan.add(karyawan);
                
            }
            
            statement.close();
        } catch (SQLException e){
            System.out.println("Input gagal : " + e.getLocalizedMessage());
        }
        
        return listKaryawan;
        
        
    }
}
