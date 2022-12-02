/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Domainmodel;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "Phong")
public class Phong implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private String id;

    @Column(name = "MaPhong")
    private String maPhong;

    @ManyToOne
    @JoinColumn(name = "IdLoaiPhong")
    private LoaiPhong loaiPhong;
    
    @Column(name = "MoTa")
    private String moTa;
    
    @Column(name = "TinhTrang")
    private String tinhTrang;
    
    @Column(name = "GiaPhong")
    private float giaPhong;
    
    @Column(name = "Anh1")
    private String anh1;
    
    @Column(name = "Anh2")
    private String anh2;
    
    @Column(name = "soLuong")
    private int soLuong;
    
    @OneToMany(mappedBy = "phong")
    private List<DichVuDung> listdvd;
    
     @OneToMany(mappedBy = "phong")
    private List<ThongTinThuePhong> listTTTP;

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public LoaiPhong getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(LoaiPhong loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public float getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(float giaPhong) {
        this.giaPhong = giaPhong;
    }

    public String getAnh1() {
        return anh1;
    }

    public void setAnh1(String anh1) {
        this.anh1 = anh1;
    }

    public String getAnh2() {
        return anh2;
    }

    public void setAnh2(String anh2) {
        this.anh2 = anh2;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public List<DichVuDung> getListdvd() {
        return listdvd;
    }

    public void setListdvd(List<DichVuDung> listdvd) {
        this.listdvd = listdvd;
    }

    public List<ThongTinThuePhong> getListTTTP() {
        return listTTTP;
    }

    public void setListTTTP(List<ThongTinThuePhong> listTTTP) {
        this.listTTTP = listTTTP;
    }
    
    
}
