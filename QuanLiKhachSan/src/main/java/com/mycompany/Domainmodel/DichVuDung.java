/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Domainmodel;

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
 * @author HP
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
    @JoinColumn(name = "IdP")
    private Phong phong;
    
    @ManyToOne
    @JoinColumn(name = "IdHoaDon")
    private HoaDon hoaDon;

    public DichVuDung(String id, String thoiGianDung, DichVu dichVu, Phong phong, HoaDon hoaDon) {
        this.id = id;
        this.thoiGianDung = thoiGianDung;
        this.dichVu = dichVu;
        this.phong = phong;
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

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }
    
    
    
}
