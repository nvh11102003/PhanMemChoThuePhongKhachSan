/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Models;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "KhachHang")
public class KhachHang implements Serializable{
    
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
    
    @Column(name = "Sđt")
    private String sDT;
    
    @Column(name = "diaChi")
    private String diaChi;
    
    
}
