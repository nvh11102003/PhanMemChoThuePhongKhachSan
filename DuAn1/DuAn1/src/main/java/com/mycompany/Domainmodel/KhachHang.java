/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Domainmodel;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "KhachHang")
public class KhachHang implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private String id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

    @Column(name = "tenDem")
    private String tenDem;

    @Column(name = "ho")
    private String ho;

    @Column(name = "gioiTinh")
    private String gioiTinh;

    @Column(name = "ngaySinh")
    private Date ngaySinh;

    @Column(name = "Sdt")
    private String sDT;

    @Column(name = "diaChi")
    private String diaChi;

    @Column(name = "sCCCD")
    private String sCCCD;

    public KhachHang() {
    }

    public KhachHang(String id, String ma, String ten, String tenDem, String ho, String gioiTinh, Date ngaySinh, String sDT, String diaChi, String sCCCD) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.tenDem = tenDem;
        this.ho = ho;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.sDT = sDT;
        this.diaChi = diaChi;
        this.sCCCD = sCCCD;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTenDem() {
        return tenDem;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getsCCCD() {
        return sCCCD;
    }

    public void setsCCCD(String sCCCD) {
        this.sCCCD = sCCCD;
    }

    @Override
    public String toString() {
        return  ma;
    }

}
