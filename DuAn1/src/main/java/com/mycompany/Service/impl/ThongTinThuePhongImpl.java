/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Service.impl;

import com.mycompany.Domainmodel.Phong;
import com.mycompany.Domainmodel.ThongTinThuePhong;
import com.mycompany.Hibernate.CRUD_Phong;
import com.mycompany.Hibernate.CRUD_ThongTinThuePhong;
import com.mycompany.Service.ThongTinThuePhongInterface;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ThongTinThuePhongImpl implements ThongTinThuePhongInterface {

    private CRUD_ThongTinThuePhong ct = new CRUD_ThongTinThuePhong();
    private CRUD_Phong cp = new CRUD_Phong();
    @Override
    public List<ThongTinThuePhong> getAll() {
        return ct.getAll();
    }

    @Override
    public Boolean add(ThongTinThuePhong tttp) {
        return ct.add(tttp);
    }

    @Override
    public Boolean delete(String id) {
        return ct.xoa(id);
    }

    @Override
    public Boolean update(String id, ThongTinThuePhong tttp) {

        return ct.update(id, tttp);
    }

}
