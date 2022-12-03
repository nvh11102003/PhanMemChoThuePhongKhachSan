/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Hibernate;

import com.mycompany.Domainmodel.KhachHang;
import com.mycompany.Utilities.HibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author ASUS
 */
public class CRUD_KhachHang {
    public List<KhachHang> getAll(){
        Session session = HibernateUtil.getFACTORY().openSession();
        List<KhachHang> list = (List<KhachHang>) session.createCriteria(KhachHang.class).list();
        return list;
   }
}
