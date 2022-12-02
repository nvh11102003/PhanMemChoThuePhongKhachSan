/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.hibernate.CRUD_HoaDonChiTiet;
import com.mycompany.service.HoaDonChiTietService;
import com.mycompany.model.HoaDonChiTiet;

import java.util.List;

/**
 *
 * @author HP
 */
public class HoaDonChiTietImpl implements HoaDonChiTietService {
    private CRUD_HoaDonChiTiet crud_hoaDonChiTiet = new CRUD_HoaDonChiTiet();

    @Override
    public Boolean add(HoaDonChiTiet hoaDonChiTiet) {
        return crud_hoaDonChiTiet.addNew(hoaDonChiTiet);
    }
}
