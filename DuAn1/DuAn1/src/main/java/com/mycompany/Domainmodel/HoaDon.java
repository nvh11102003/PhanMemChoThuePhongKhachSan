/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Domainmodel;

import java.sql.Date;
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
@Table(name = "HoaDon")
public class HoaDon {
    @Id 
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private String id;
    
    @Column(name = "ma")
    private String ma;
    
    @Column(name = "ngayTao")
    private Date ngayTao;
    
    @Column(name = "ngayTraPhong")
    private Date ngayTraPhong;
    
    @Column(name = "tinhTrang")
    private String tinhTrang;
    
    @Column(name = "tenKH")
    private String tenKH;
    
    @Column(name = "soTien")
    private float soTien;
    
    @OneToMany(mappedBy = "hoaDon")
    private List<ThongTinThuePhong> listTTTP;
    
    @ManyToOne
    @JoinColumn(name = "IdNV")
    private NhanVien nhanVien;
   
    @OneToMany(mappedBy = "hoaDon")
    private List<DichVuDung> listDVD;

    @OneToMany(mappedBy = "hoaDon")
    private List<DichVu> listDV;

    public List<DichVu> getListDV() {
        return listDV;
    }

    public void setListDV(List<DichVu> listDV) {
        this.listDV = listDV;
    }
    
    @Override
    public String toString() {
        return "HoaDon{" + "id=" + id + ", ma=" + ma + ", ngayTao=" + ngayTao + ", ngayTraPhong=" + ngayTraPhong + ", tinhTrang=" + tinhTrang + ", tenKH=" + tenKH + ", soTien=" + soTien + ", listTTTP=" + listTTTP + ", nhanVien=" + nhanVien + ", listDVD=" + listDVD + '}';
    }

    public HoaDon(String id, String ma, Date ngayTao, Date ngayTraPhong, String tinhTrang, String tenKH, float soTien, List<ThongTinThuePhong> listTTTP, NhanVien nhanVien, List<DichVuDung> listDVD) {
        this.id = id;
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.ngayTraPhong = ngayTraPhong;
        this.tinhTrang = tinhTrang;
        this.tenKH = tenKH;
        this.soTien = soTien;
        this.listTTTP = listTTTP;
        this.nhanVien = nhanVien;
        this.listDVD = listDVD;
    }

    public HoaDon() {
    }

    public HoaDon(String ma, Date ngayTao, Date ngayTraPhong, String tinhTrang, String tenKH, float soTien) {
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.ngayTraPhong = ngayTraPhong;
        this.tinhTrang = tinhTrang;
        this.tenKH = tenKH;
        this.soTien = soTien;
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

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayTraPhong() {
        return ngayTraPhong;
    }

    public void setNgayTraPhong(Date ngayTraPhong) {
        this.ngayTraPhong = ngayTraPhong;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public float getSoTien() {
        return soTien;
    }

    public void setSoTien(float soTien) {
        this.soTien = soTien;
    }

    public List<ThongTinThuePhong> getListTTTP() {
        return listTTTP;
    }

    public void setListTTTP(List<ThongTinThuePhong> listTTTP) {
        this.listTTTP = listTTTP;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public List<DichVuDung> getListDVD() {
        return listDVD;
    }

    public void setListDVD(List<DichVuDung> listDVD) {
        this.listDVD = listDVD;
    }


}
