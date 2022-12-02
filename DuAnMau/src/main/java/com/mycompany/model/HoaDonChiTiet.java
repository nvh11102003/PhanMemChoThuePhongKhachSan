/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import com.mycompany.model.ChiTietSP;
import com.mycompany.model.HoaDon;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "HoaDonChiTiet")
public class HoaDonChiTiet implements Serializable{

    @Id
    @ManyToOne
    @JoinColumn(name = "Idhoadon")
    private HoaDon hoaDon;

    @Id
    @ManyToOne
    @JoinColumn(name = "IdChitietSP")
    private ChiTietSP chiTietSP;

//    private HoaDonChiTietID idHoaDonChiTiet;
    @Column(name = "SoLuong")
    private int SoLuong;

    @Column(name = "DonGia")
    private long Dongia;

    public HoaDonChiTiet(int SoLuong, long Dongia) {
        this.SoLuong = SoLuong;
        this.Dongia = Dongia;
    }

    public HoaDonChiTiet() {

    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public ChiTietSP getChiTietSP() {
        return chiTietSP;
    }

    public void setChiTietSP(ChiTietSP chiTietSP) {
        this.chiTietSP = chiTietSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public long getDongia() {
        return Dongia;
    }

    public void setDongia(long Dongia) {
        this.Dongia = Dongia;
    }

}
