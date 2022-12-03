/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Service.impl;

import com.mycompany.Domainmodel.Phong;
import com.mycompany.Hibernate.CRUD_Phong;
import com.mycompany.Service.PhongService;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class PhongServiceImp implements PhongService{

    private CRUD_Phong cp = new CRUD_Phong();
    
    @Override
    public List<Phong> getCbbPhong() {
        return cp.getAll();
    }
    
}
