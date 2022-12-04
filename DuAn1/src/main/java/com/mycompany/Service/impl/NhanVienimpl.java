/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Service.impl;

import com.mycompany.Domainmodel.NhanVien;
import com.mycompany.Hibernate.CRUD_NhanVien;
import com.mycompany.Service.NhanVienInterface;
import java.util.List;

/**
 *
 * @author HP
 */
public class NhanVienimpl implements NhanVienInterface {

    private CRUD_NhanVien cRUD_NhanVien = new CRUD_NhanVien();
    
    @Override
    public List<NhanVien> getAll() {
        return cRUD_NhanVien.getAll();
    }

}
