/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;
import java.sql.Date;
import java.util.List;

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
    private String idHD;

    @ManyToOne
    @JoinColumn(name = "IdKH")
    private KhachHang khachHang;

    @ManyToOne
    @JoinColumn(name = "IdNV")
    private NhanVien nhanVien;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "NgayTao")
    private Date NgayTao;

    @Column(name = "NgayThanhToan")
    private Date NgayThanhToan;

    @Column(name = "NgayShip")
    private Date NgayShip;

    @Column(name = "NgayNhan")
    private Date NgayNhan;

    @Column(name = "TinhTrang")
    private int tinhtrang;

    @Column(name = "TenNguoiNhan")
    private String tennguoinhan;

    @Column(name = "DiaChi")
    private String diachi;


    @OneToMany(mappedBy = "hoaDon", fetch = FetchType.EAGER)
    private List<HoaDonChiTiet> listhoadonCT;

    public HoaDon() {
    }

    public HoaDon(String idHD, Date NgayTao) {
        this.idHD = idHD;
        this.NgayTao = NgayTao;
    }

    public HoaDon(NhanVien nhanVien, String ma, Date NgayTao, int tinhtrang) {
        this.nhanVien = nhanVien;
        this.ma = ma;
        this.NgayTao = NgayTao;
        this.tinhtrang = tinhtrang;
    }

   

    public HoaDon(String ma, Date NgayTao, int tinhtrang) {
        this.ma = ma;
        this.NgayTao = NgayTao;
        this.tinhtrang = tinhtrang;
    }

    

    public String tinhTrang(){
        if(tinhtrang == 0){
            return "Chưa thanh toán";
           
        }
        return "Đã thanh toán";
    }
   

    public String getIdHD() {
        return idHD;
    }

    public void setIdHD(String idHD) {
        this.idHD = idHD;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public Date getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(Date NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }

    public Date getNgayShip() {
        return NgayShip;
    }

    public void setNgayShip(Date NgayShip) {
        this.NgayShip = NgayShip;
    }

    public Date getNgayNhan() {
        return NgayNhan;
    }

    public void setNgayNhan(Date NgayNhan) {
        this.NgayNhan = NgayNhan;
    }

    public int getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(int tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public String getTennguoinhan() {
        return tennguoinhan;
    }

    public void setTennguoinhan(String tennguoinhan) {
        this.tennguoinhan = tennguoinhan;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public List<HoaDonChiTiet> getListhoadonCT() {
        return listhoadonCT;
    }

    public void setListhoadonCT(List<HoaDonChiTiet> listhoadonCT) {
        this.listhoadonCT = listhoadonCT;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "idHD=" + idHD + ", khachHang=" + khachHang + ", nhanVien=" + nhanVien + ", ma=" + ma + ", NgayTao=" + NgayTao + ", NgayThanhToan=" + NgayThanhToan + ", NgayShip=" + NgayShip + ", NgayNhan=" + NgayNhan + ", tinhtrang=" + tinhtrang + ", tennguoinhan=" + tennguoinhan + ", diachi=" + diachi + ", listhoadonCT=" + listhoadonCT + '}';
    }
}
