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
}
