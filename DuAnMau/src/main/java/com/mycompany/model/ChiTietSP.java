/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author HP
 */

 @Entity
@Table(name = "ChiTietSP")
public class ChiTietSP  {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private String id;
    
    @ManyToOne
    @JoinColumn(name = "idSp")
    private SanPham sanPham;

  
    @Column(name = "NamBH")
    private Integer namBH;
    
    @Column(name = "MoTa")
    private String moTa;
    
    @Column(name = "SoLuongTon")
    private Integer soLuongTon;
    
    @Column(name = "GiaNhap")
    private float giaNhap;
    
    @Column(name = "GiaBan")
    private float giaBan;


    @ManyToOne
    @JoinColumn(name = "idNSX")
    private NSX nSX;
    
    @ManyToOne
    @JoinColumn(name = "idMauSac")
    private MauSac mauSac;
    
    @ManyToOne
    @JoinColumn(name = "idDongSP")
    private DongSP dongSP;

    @OneToMany(mappedBy = "chiTietSP")
    private List<HoaDonChiTiet> listHoaDonChiTiet;
    public ChiTietSP() {
    }

    public ChiTietSP(Integer namBH, String moTa, Integer soLuongTon, float giaNhap, float giaBan) {
        this.namBH = namBH;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public ChiTietSP(String id, SanPham sanPham, Integer namBH, String moTa, Integer soLuongTon, float giaNhap, float giaBan, NSX nSX, MauSac mauSac, DongSP dongSP) {
        this.id = id;
        this.sanPham = sanPham;
        this.namBH = namBH;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.nSX = nSX;
        this.mauSac = mauSac;
        this.dongSP = dongSP;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public Integer getNamBH() {
        return namBH;
    }

    public void setNamBH(Integer namBH) {
        this.namBH = namBH;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Integer getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(Integer soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public NSX getnSX() {
        return nSX;
    }

    public void setnSX(NSX nSX) {
        this.nSX = nSX;
    }

    public MauSac getMauSac() {
        return mauSac;
    }

    public void setMauSac(MauSac mauSac) {
        this.mauSac = mauSac;
    }

    public DongSP getDongSP() {
        return dongSP;
    }

    public void setDongSP(DongSP dongSP) {
        this.dongSP = dongSP;
    }

    @Override
    public String toString() {
        return "ChiTietSP{"+sanPham.getTenSp() + ", namBH=" + namBH + ", moTa=" + moTa + ", soLuongTon=" + soLuongTon + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + ", nSX=" + nSX.getIdNSX() + ", mauSac=" + mauSac.getIdMS() + ", dongSP=" + dongSP.getIdDSP() + '}';
    }
    

    
}
