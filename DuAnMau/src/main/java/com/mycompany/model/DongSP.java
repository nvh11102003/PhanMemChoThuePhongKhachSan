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
@Table(name = "DongSP")
public class DongSP implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private String idDSP;

    @Column(name = "ma", unique = true)
    private String maDSP;

    @Column(name = "ten", columnDefinition = "Nvarchar(100)")
    private String tenDSP;

    @OneToMany(mappedBy = "dongSP", fetch = FetchType.EAGER)
    private List<ChiTietSP> lstSP;

    public DongSP() {
    }

    public DongSP(String idDSP, String maDSP, String tenDSP, List<ChiTietSP> lstSP) {
        this.idDSP = idDSP;
        this.maDSP = maDSP;
        this.tenDSP = tenDSP;
        this.lstSP = lstSP;
    }

    public DongSP(String idDSP, String maDSP, String tenDSP) {
        this.idDSP = idDSP;
        this.maDSP = maDSP;
        this.tenDSP = tenDSP;
    }

    public DongSP(String maDSP, String tenDSP) {
        this.maDSP = maDSP;
        this.tenDSP = tenDSP;
    }

    public String getIdDSP() {
        return idDSP;
    }

    public void setIdDSP(String idDSP) {
        this.idDSP = idDSP;
    }

    public String getMaDSP() {
        return maDSP;
    }

    public void setMaDSP(String maDSP) {
        this.maDSP = maDSP;
    }

    public String getTenDSP() {
        return tenDSP;
    }

    public void setTenDSP(String tenDSP) {
        this.tenDSP = tenDSP;
    }

    public List<ChiTietSP> getLstSP() {
        return lstSP;
    }

    public void setLstSP(List<ChiTietSP> lstSP) {
        this.lstSP = lstSP;
    }

    @Override
    public String toString() {
        return tenDSP ;
    }

}
