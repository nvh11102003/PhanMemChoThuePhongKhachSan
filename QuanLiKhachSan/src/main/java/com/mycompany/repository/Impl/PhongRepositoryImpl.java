/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repository.Impl;

import com.mycompany.Domainmodel.Phong;
import com.mycompany.Domainmodel.Phong;
import com.mycompany.Utilities.HibernateUtil;
import java.util.List;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.mycompany.repository.IPhongRepository;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author DELL
 */
public class PhongRepositoryImpl implements IPhongRepository {

    @Override
    public List<Phong> findAll() {
        Session session = HibernateUtil.getFACTORY().openSession();
        List<Phong> list = (ArrayList<Phong>) session.createCriteria(Phong.class).list();

        return list;    
    }

    @Override
    public boolean add(Phong phong) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(phong);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(String id, Phong phong) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(id, phong);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        Phong phong = new Phong();
        phong.setId(id);
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(phong);
            transaction.commit();
            return true;
        } catch (Exception e) {
        }

        return false;
    }

    @Override
    public Phong findByRoomNumber(String roomNumber) {
        Session session = HibernateUtil.getFACTORY().openSession();
        Criteria criteria = session.createCriteria(Phong.class);
        Phong phong = (Phong) criteria.add(Restrictions.eq("maPhong", roomNumber))
                             .uniqueResult();
        return phong;
    }
}
