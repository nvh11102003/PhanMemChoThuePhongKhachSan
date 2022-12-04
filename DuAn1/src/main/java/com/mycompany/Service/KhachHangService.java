/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.Service;

import com.mycompany.Domainmodel.KhachHang;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author My PC
 */
public interface KhachHangService {


    public boolean Them(KhachHang khachHang);

    public boolean Sua(String Ma, KhachHang khachHang);

    public boolean Xoa(String Ma);

    public List<KhachHang> Getlist();

}
