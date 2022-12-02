/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "CuaHang")
public class CuaHang {
    
    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private String idCH;
    
    @Column(name = "Ma")
    private String maCH;
    
    @Column(name = "Ten")
    private String tenCV;
    
    @Column(name = "DiaChi")
    private String diachi;
    
    @Column(name = "ThanhPho")
    private String thanhpho;
    
    @Column(name = "QuocGia")
    private String quocgia;
    
    @OneToMany(mappedBy = "cuaHang")
    private List<NhanVien> nhanVien;
    
}
