/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Service.impl;

import com.mycompany.Domainmodel.KhachHang;
import com.mycompany.Hibernate.CRUD_KhachHang;
import com.mycompany.Service.KhachHangService;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class KhachHangImp implements KhachHangService {

    private CRUD_KhachHang ck = new CRUD_KhachHang();

    @Override
    public boolean Them(KhachHang khachHang) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Sua(String Ma, KhachHang khachHang) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Xoa(String Ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<KhachHang> Getlist() {
        return ck.getAll();
    }

}
