/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 *
 * @author HP
 */

@Entity
@Table(name = "KhachHang")
public class KhachHang {
    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private String idKH;

    @Column(name = "Ma")
    private String maKH;

    @Column(name = "Ten")
    private String tenKH;

    @Column(name = "TenDem")
    private String Tendem;

    @Column(name = "Ho")
    private String ho;

    @Column(name = "NgaySinh")
    private Date Ngaysinh;

    @Column(name = "Sdt")
    private String sdt;

    @Column(name = "DiaChi")
    private String diachi;

    @Column(name = "ThanhPho")
    private String thanhpho;

    @Column(name = "QuocGia")
    private String quocgia;



    @OneToMany(mappedBy = "khachHang")
    private List<HoaDon> listHoaDon;

    public KhachHang() {
    }
}
