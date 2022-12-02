/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.hibernate.CRUD_CTSP;
import com.mycompany.model.ChiTietSP;
import com.mycompany.model.NSX;
import com.mycompany.service.CTSPInterface;
import java.util.List;

/**
 *
 * @author HP
 */
public class CTSPImpl implements CTSPInterface{

    private CRUD_CTSP crud_ctsp = new CRUD_CTSP();
    @Override
    public List<ChiTietSP> getAll() {
        return crud_ctsp.getAll();
    }

    @Override
    public Boolean add(ChiTietSP chiTietSP) {
        return crud_ctsp.add(chiTietSP);
    }


    @Override
    public Boolean delete(String id) {
        return  crud_ctsp.delete(id);
    }

    @Override
    public Boolean update(String id, ChiTietSP chiTietSP) {
        return crud_ctsp.update(id, chiTietSP);
    }




}
