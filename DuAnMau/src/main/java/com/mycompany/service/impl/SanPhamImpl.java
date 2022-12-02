/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.hibernate.CRUD_SanPham;
import com.mycompany.model.SanPham;
import com.mycompany.service.SanPhamInterface;
import java.util.List;

/**
 *
 * @author HP
 */
public class SanPhamImpl implements SanPhamInterface {

    private CRUD_SanPham crudsp = new CRUD_SanPham();

    @Override
    public Boolean add(SanPham sanPham) {
        return crudsp.add(sanPham);
    }

    @Override
    public List<SanPham> getAll() {
        return crudsp.getAll();
    }

    @Override
    public Boolean delete(String maSP) {
        return crudsp.delete(maSP);
    }

    @Override
    public Boolean update(String maSP, SanPham sanPham) {
        return crudsp.update(maSP, sanPham);
    }

    



}
