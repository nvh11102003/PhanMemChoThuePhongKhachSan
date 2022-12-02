/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repository.Impl;

import com.mycompany.Domainmodel.LoaiPhong;
import com.mycompany.Domainmodel.Phong;
import com.mycompany.Utilities.HibernateUtil;
import com.mycompany.repository.ILoaiPhongRepository;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author DELL
 */
public class LoaiPhongRepositoryImpl implements ILoaiPhongRepository {

    @Override
    public List<LoaiPhong> findAll() {
        Session session = HibernateUtil.getFACTORY().openSession();
        List<LoaiPhong> list = (ArrayList<LoaiPhong>) session.createCriteria(LoaiPhong.class).list();

        return list;
    }
}
