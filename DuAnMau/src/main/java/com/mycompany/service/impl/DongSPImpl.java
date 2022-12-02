/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.hibernate.CRUD_DongSP;
import com.mycompany.model.DongSP;
import com.mycompany.service.DongSPInterface;
import java.util.List;

/**
 *
 * @author HP
 */
public class DongSPImpl implements DongSPInterface{
    private CRUD_DongSP crudddongSp = new CRUD_DongSP();

    @Override
    public List<DongSP> getAll() {
        return crudddongSp.getAll();
    }

    @Override
    public Boolean add(DongSP dongSP) {
        return crudddongSp.add(dongSP);
    }

    @Override
    public Boolean delete(String ma) {
        return crudddongSp.delete(ma);
    }

    @Override
    public Boolean update(String ma, DongSP dongSP) {
        return crudddongSp.update(ma, dongSP);
    }
    
}
