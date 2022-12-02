/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.service;

import com.mycompany.model.HoaDon;

import java.util.List;

/**
 *
 * @author HP
 */
public interface HoaDonInterface {
    public List<HoaDon> getAll();
    public Boolean add(HoaDon hoaDon);
}
