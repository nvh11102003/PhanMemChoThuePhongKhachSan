/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author DangHieu
 */
@Entity
@Table(name = "DichVuDung")
public class DichVuDung {
    @Id 
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private String id;
    
    @Column(name = "thoiGianSuDung")
    private String thoiGianDung;
    
    @ManyToOne
    @JoinColumn(name = "IdDV")
    private DichVu dichVu;
    
    @ManyToOne
    @JoinColumn(name = "IdCTP")
    private ChiTietPhong chiTietPhong;
    
    @ManyToOne
    @JoinColumn(name = "IdHoaDon")
    private HoaDon hoaDon;

    public DichVuDung() {
    }

    public DichVuDung(String id, String thoiGianDung, DichVu dichVu, ChiTietPhong chiTietPhong, HoaDon hoaDon) {
        this.id = id;
        this.thoiGianDung = thoiGianDung;
        this.dichVu = dichVu;
        this.chiTietPhong = chiTietPhong;
        this.hoaDon = hoaDon;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getThoiGianDung() {
        return thoiGianDung;
    }

    public void setThoiGianDung(String thoiGianDung) {
        this.thoiGianDung = thoiGianDung;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }

    public ChiTietPhong getChiTietPhong() {
        return chiTietPhong;
    }

    public void setChiTietPhong(ChiTietPhong chiTietPhong) {
        this.chiTietPhong = chiTietPhong;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }
    
}

