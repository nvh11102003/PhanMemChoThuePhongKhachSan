/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.service;

import com.mycompany.model.SanPham;
import java.util.List;

/**
 *
 * @author HP
 */
public interface SanPhamInterface {
    public Boolean add(SanPham sanPham);
    public List<SanPham> getAll();
    public Boolean delete(String maSP);
    public Boolean update(String maSP, SanPham sanPham);


}
