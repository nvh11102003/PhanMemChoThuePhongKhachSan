/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Models;

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


@Entity
@Table(name = "NhanVien")
public class NhanVien {

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
    
    @Column(name = "sdt")
    private String sdt;
    
    @Column(name = "diaChi")
    private String diaChi;
    
    @ManyToOne
    @JoinColumn(name = "IdCV")
    private ChucVu chucVu;
    
    @OneToMany(mappedBy = "nhanVien")
    private List<HoaDon> listHD;
}
