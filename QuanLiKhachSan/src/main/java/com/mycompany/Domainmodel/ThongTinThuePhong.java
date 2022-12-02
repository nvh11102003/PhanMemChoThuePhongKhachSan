/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Domainmodel;

import java.sql.Date;
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
@Table(name = "ThongTinThuePhong")
public class ThongTinThuePhong {
    @Id 
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private String id;
    
    @Column(name = "thoiGianThue")
    private  Date thoiGianThue;
    
    @Column(name = "thoiGianTra")
    private Date thoiGianTra;
    
    @Column(name = "soNguoi")
    private Integer soNguoi;
    
    @ManyToOne
    @JoinColumn(name = "IdP")
    private Phong phong;
    
    @ManyToOne
    @JoinColumn(name = "IDHD")
    private HoaDon hoaDon;
    
    @ManyToOne
    @JoinColumn(name = "IdKH")
    private KhachHang khachHang;

    public ThongTinThuePhong() {
    }

    public ThongTinThuePhong(String id, Date thoiGianThue, Date thoiGianTra, Integer soNguoi, Phong phong, HoaDon hoaDon, KhachHang khachHang) {
        this.id = id;
        this.thoiGianThue = thoiGianThue;
        this.thoiGianTra = thoiGianTra;
        this.soNguoi = soNguoi;
        this.phong = phong;
        this.hoaDon = hoaDon;
        this.khachHang = khachHang;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getThoiGianThue() {
        return thoiGianThue;
    }

    public void setThoiGianThue(Date thoiGianThue) {
        this.thoiGianThue = thoiGianThue;
    }

    public Date getThoiGianTra() {
        return thoiGianTra;
    }

    public void setThoiGianTra(Date thoiGianTra) {
        this.thoiGianTra = thoiGianTra;
    }

    public Integer getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(Integer soNguoi) {
        this.soNguoi = soNguoi;
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

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }
    
    
}
