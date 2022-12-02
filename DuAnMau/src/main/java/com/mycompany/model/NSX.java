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
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "NSX")
public class NSX implements Serializable{
    
    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private String idNSX;

    @Column(name = "ma", unique = true)
    private String maNSX;
    
    @Column(name = "ten", columnDefinition = "Nvarchar(100)")
    private String tenNSX;
    
    @OneToMany(mappedBy = "nSX", fetch = FetchType.EAGER)
    private List<ChiTietSP> lstSP;
    public NSX() {
    }

    public NSX(String idNSX, String maNSX, String tenNSX) {
        this.idNSX = idNSX;
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
    }

    public NSX(String maNSX, String tenNSX) {
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
    }

    public NSX(String idNSX, String maNSX, String tenNSX, List<ChiTietSP> lstSP) {
        this.idNSX = idNSX;
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
        this.lstSP = lstSP;
    }

    public String getIdNSX() {
        return idNSX;
    }

    public void setIdNSX(String idNSX) {
        this.idNSX = idNSX;
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public List<ChiTietSP> getLstSP() {
        return lstSP;
    }

    public void setLstSP(List<ChiTietSP> lstSP) {
        this.lstSP = lstSP;
    }

    @Override
    public String toString() {
        return tenNSX ;
    }


}
