/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.repository;

import com.mycompany.Domainmodel.LoaiPhong;
import com.mycompany.Domainmodel.Phong;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface ILoaiPhongRepository {
    public List<LoaiPhong> findAll();
}
