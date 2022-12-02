/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.hibernate.CRUD_NSX;
import com.mycompany.model.NSX;
import com.mycompany.service.NSXInterface;
import java.util.List;

/**
 *
 * @author HP
 */
public class NSXImpl implements NSXInterface{
    private CRUD_NSX crudnsx = new CRUD_NSX();

    @Override
    public Boolean add(NSX nsx) {
        return crudnsx.add(nsx);
    }

    @Override
    public List<NSX> getAll() {
        return crudnsx.getAll();
    }

    @Override
    public Boolean delete(String maNSX) {
        return crudnsx.delete(maNSX);
    }

    @Override
    public Boolean update(String maNSX, NSX nsx) {
        return crudnsx.update(maNSX, nsx);
    }
}
