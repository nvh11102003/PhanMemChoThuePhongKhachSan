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
    @JoinColumn(name = "IdChiTietPhong")
    private ChiTietPhong loaiPhong;
    
    @Column(name = "TenPhong")
    private String tenPhong;
    
    @Column(name = "Tang")
    private String tang;

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getTang() {
        return tang;
    }

    public void setTang(String tang) {
        this.tang = tang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
    @Column(name = "TinhTrang")
    private String tinhTrang;
    
    
    @OneToMany(mappedBy = "phong")
    private List<DichVuDung> listdvd;
    
    @OneToMany(mappedBy = "phong")
    private List<ThongTinThuePhong> listTTTP;

    public Phong() {
    }

    public Phong(String id, String maPhong, ChiTietPhong loaiPhong, String tenPhong, String tang, String tinhTrang, List<DichVuDung> listdvd, List<ThongTinThuePhong> listTTTP) {
        this.id = id;
        this.maPhong = maPhong;
        this.loaiPhong = loaiPhong;
        this.tenPhong = tenPhong;
        this.tang = tang;
        this.tinhTrang = tinhTrang;
        this.listdvd = listdvd;
        this.listTTTP = listTTTP;
    }

    

    

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

    public ChiTietPhong getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(ChiTietPhong loaiPhong) {
        this.loaiPhong = loaiPhong;
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

    @Override
    public String toString() {
        return maPhong;
    }

}
