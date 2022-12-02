/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Domainmodel;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "LoaiPhong")
public class LoaiPhong {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "maPhong")
    private String maPhong;
    
    @Column(name = "LoaiPhong")
    private String loaiPhong;
    
    @Column(name = "DonGia")
    private String donGia;
    
    @Column(name = "soNguoiToiDa")
    private Integer soNguoiToiDa;
    
    @OneToMany(mappedBy = "loaiPhong")
    private List<Phong> listPhong;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    public Integer getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(Integer soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public List<Phong> getListPhong() {
        return listPhong;
    }

    public void setListPhong(List<Phong> listPhong) {
        this.listPhong = listPhong;
    }

    @Override
    public String toString() {
        return this.loaiPhong;
    }
    
    
    
}
