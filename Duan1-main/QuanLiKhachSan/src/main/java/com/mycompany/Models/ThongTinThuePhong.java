/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Models;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


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
    @JoinColumn(name = "IdCTP")
    private ChiTietPhong chiTietPhong;
    
    @ManyToOne
    @JoinColumn(name = "IDHD")
    private HoaDon hoaDon;
    
    @ManyToOne
    @JoinColumn(name = "IdKH")
    private KhachHang khachHang;
}
