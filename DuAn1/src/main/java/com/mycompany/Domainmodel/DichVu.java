
        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Domainmodel;

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

/**
 *
 * @author HP
 */
@Entity
@Table(name = "DichVu")
public class DichVu {
    @Id 
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private String id;
    
    @Column(name = "maDichVu")
    private String maDichVu;
    
    @Column(name = "loaiDichVu")
    private String loaiDichVu;
    
    @Column(name = "PhiDichVu")
    private float PhiDichVu;
    
    @OneToMany(mappedBy = "dichVu")
    private List<DichVuDung> listDVD;
    
    @ManyToOne
    @JoinColumn(name = "IdHoaDon")
    private HoaDon hoaDon;

    public DichVu() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    public float getPhiDichVu() {
        return PhiDichVu;
    }

    public void setPhiDichVu(float PhiDichVu) {
        this.PhiDichVu = PhiDichVu;
    }

    public List<DichVuDung> getListDVD() {
        return listDVD;
    }

    public void setListDVD(List<DichVuDung> listDVD) {
        this.listDVD = listDVD;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }
    
}
