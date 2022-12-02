/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "SanPham")
public class SanPham implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private String idSanPham;

    @Column(name = "ma", unique = true)
    private String maSP;
    
    @Column(name = "ten", columnDefinition = "Nvarchar(100)")
    private String tenSp;
    
    @OneToMany(mappedBy = "sanPham", fetch = FetchType.EAGER)
    private List<ChiTietSP> lstSP;

    public SanPham() {
    }

    public SanPham(String idSanPham, String maSP, String tenSp, List<ChiTietSP> lstSP) {
        this.idSanPham = idSanPham;
        this.maSP = maSP;
        this.tenSp = tenSp;
        this.lstSP = lstSP;
    }

    public SanPham(String idSanPham, String maSP, String tenSp) {
        this.idSanPham = idSanPham;
        this.maSP = maSP;
        this.tenSp = tenSp;
    }

    public SanPham(String maSP, String tenSp) {
        this.maSP = maSP;
        this.tenSp = tenSp;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public List<ChiTietSP> getLstSP() {
        return lstSP;
    }

    public void setLstSP(List<ChiTietSP> lstSP) {
        this.lstSP = lstSP;
    }

    @Override
    public String toString() {
        return tenSp ;
    }

}
