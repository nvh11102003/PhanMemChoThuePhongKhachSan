/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Hibernate;

import com.mycompany.Domainmodel.Phong;
import com.mycompany.Utilities.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author HP
 */
public class CRUD_Phong {
    public List<Phong> getAll() {
        Session session = HibernateUtil.getFACTORY().openSession();
        List<Phong> list = (List<Phong>) session.createCriteria(Phong.class).list();
        return list;
    }
    
}
