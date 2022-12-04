/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Service.impl;

import com.mycompany.Domainmodel.HoaDon;
import com.mycompany.Hibernate.CRUD_HoaDon;
import com.mycompany.Service.HoaDonInterface;
import java.util.List;

/**
 *
 * @author HP
 */
public class HoaDonimpl implements HoaDonInterface{

    private CRUD_HoaDon cRUD_HoaDon = new CRUD_HoaDon();
    @Override
    public List<HoaDon> getAll() {
        return cRUD_HoaDon.getAll();
    }

    @Override
    public Boolean add(HoaDon hoaDon) {
        return cRUD_HoaDon.add(hoaDon);
    }

    @Override
    public Boolean delete(String id) {
        return cRUD_HoaDon.delete(id);
    }

    @Override
    public Boolean update(String id, HoaDon hoaDon) {
        return cRUD_HoaDon.update(id, hoaDon);
    }
    
}
