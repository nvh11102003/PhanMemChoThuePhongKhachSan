/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "Phong")
public class Phong implements Serializable{
    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private String id;
    
    @Column(name = "MaPhong")
    private String maPhong;
    
    @ManyToOne
    @JoinColumn(name = "IdLoaiPhong")
    private LoaiPhong loaiPhong;
    
    
    @OneToOne
    @PrimaryKeyJoinColumn
    private ChiTietPhong chiTietPhong;

    @Override
    public String toString() {
        return "Phong{" + "id=" + id + ", maPhong=" + maPhong + ", loaiPhong=" + loaiPhong + ", chiTietPhong=" + chiTietPhong + '}';
    }

    
    
}
