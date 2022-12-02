/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.hibernate.CRUD_HoaDon;
import com.mycompany.model.HoaDon;
import com.mycompany.service.HoaDonInterface;

import java.util.List;

/**
 *
 * @author HP
 */
public class HoaDonImpl implements HoaDonInterface {

    private CRUD_HoaDon crud_hoaDon = new CRUD_HoaDon();

    @Override
    public List<HoaDon> getAll() {
        return crud_hoaDon.getAll();
    }

    @Override
    public Boolean add(HoaDon hoaDon) {
        return crud_hoaDon.add(hoaDon);
    }
}
