/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Models;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author DangHieu
 */
@Entity
@Table(name = "DichVu")
public class DichVu {
    @Id 
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private String id;
    
    @Column(name = "maDichVu")
    private String maDichVu;
    
    @Column(name = "loaiDichVu")
    private String loaiDichVu;
    
    @Column(name = "soTien")
    private float soTien;
    
    @OneToMany(mappedBy = "dichVu")
    private List<DichVuDung> listDVD;

    public DichVu() {
    }

    public DichVu(String id, String maDichVu, String loaiDichVu, float soTien, List<DichVuDung> listDVD) {
        this.id = id;
        this.maDichVu = maDichVu;
        this.loaiDichVu = loaiDichVu;
        this.soTien = soTien;
        this.listDVD = listDVD;
    }

    public DichVu(String maDichVu, String loaiDichVu, float soTien) {
        this.maDichVu = maDichVu;
        this.loaiDichVu = loaiDichVu;
        this.soTien = soTien;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    public float getSoTien() {
        return soTien;
    }

    public void setSoTien(float soTien) {
        this.soTien = soTien;
    }

    public List<DichVuDung> getListDVD() {
        return listDVD;
    }

    public void setListDVD(List<DichVuDung> listDVD) {
        this.listDVD = listDVD;
    }
    
    
}
