/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Karyawan;

/**
 *
 * @author Lab Informatika
 */
public class ModelKaryawan {
    private String nama;
    private String divisi;
    private String status;
    
    private Integer id;
    private Float target;
    private Float disiplin;
    private Float inovasi;
    private Float akhir;
    
    
    public Integer getId(){
        return id;
    }
    public String getNama(){
        return nama;
    }
    public String getDivisi(){
        return divisi;
    }
    public String getStatus(){
        return status;
    }
    
    public Float getTarget(){
        return target;
    }
    public Float getDisiplin(){
        return disiplin;
    }
    public Float getInovasi(){
        return inovasi;
    }
    public Float getAkhir(){
        return akhir;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setDivisi(String divisi){
        this.divisi = divisi;
    }
    public void setStatus(String status){
        this.status = status;
    }
    
    public void setTarget(Float target){
        this.target = target;
    }
    public void setDisiplin(Float disiplin){
        this.disiplin = disiplin;
    }
    public void setInovasi(Float inovasi){
        this.inovasi = inovasi;
    }
    public void setAkhir(Float akhir){
        this.akhir = akhir;
    }
}
