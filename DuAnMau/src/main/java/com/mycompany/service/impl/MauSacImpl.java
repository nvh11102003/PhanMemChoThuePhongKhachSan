/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.hibernate.CRUD_MauSac;
import com.mycompany.model.MauSac;
import com.mycompany.service.MauSacInterface;
import java.util.List;

/**
 *
 * @author HP
 */
public class MauSacImpl implements MauSacInterface{
    private CRUD_MauSac crudms = new CRUD_MauSac();

    @Override
    public Boolean add(MauSac mauSac) {
        return crudms.add(mauSac);
    }

    @Override
    public List<MauSac> getAll() {
        return crudms.getAll();
    }

    @Override
    public Boolean delete(String maMauSac) {
        return crudms.delete(maMauSac);
    }

    @Override
    public Boolean update(String maMauSac, MauSac mauSac) {
        return crudms.update(maMauSac, mauSac);
    }
}
