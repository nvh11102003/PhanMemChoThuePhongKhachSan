/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "MauSac")
public class MauSac implements Serializable{
 
    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private String idMS;

    @Column(name = "ma", unique = true)
    private String maMauSac;
    @Column(name = "ten", columnDefinition = "Nvarchar(100)")
    private String tenMauSac;
    @OneToMany(mappedBy = "mauSac", fetch = FetchType.EAGER)
    private List<ChiTietSP> lstSP;

    public MauSac() {
    }

    public MauSac(String idMS, String maMauSac, String tenMauSac, List<ChiTietSP> lstSP) {
        this.idMS = idMS;
        this.maMauSac = maMauSac;
        this.tenMauSac = tenMauSac;
        this.lstSP = lstSP;
    }

    public MauSac(String idMS, String maMauSac, String tenMauSac) {
        this.idMS = idMS;
        this.maMauSac = maMauSac;
        this.tenMauSac = tenMauSac;
    }

    public MauSac(String maMauSac, String tenMauSac) {
        this.maMauSac = maMauSac;
        this.tenMauSac = tenMauSac;
    }

    public String getIdMS() {
        return idMS;
    }

    public void setIdMS(String idMS) {
        this.idMS = idMS;
    }

    public String getMaMauSac() {
        return maMauSac;
    }

    public void setMaMauSac(String maMauSac) {
        this.maMauSac = maMauSac;
    }

    public String getTenMauSac() {
        return tenMauSac;
    }

    public void setTenMauSac(String tenMauSac) {
        this.tenMauSac = tenMauSac;
    }

    public List<ChiTietSP> getLstSP() {
        return lstSP;
    }

    public void setLstSP(List<ChiTietSP> lstSP) {
        this.lstSP = lstSP;
    }

    @Override
    public String toString() {
        return tenMauSac;
    }
    

}
