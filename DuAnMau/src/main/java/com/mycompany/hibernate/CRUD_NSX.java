/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate;

import com.mycompany.Utilities.HibernateUtil;
import com.mycompany.model.NSX;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author HP
 */
public class CRUD_NSX {
    public List<NSX> getAll() {
        Session session = HibernateUtil.getFACTORY().openSession();
        List<NSX> list = (List<NSX>) session.createCriteria(NSX.class).list();
        return list;
    }

    public Boolean add(NSX nsx) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(nsx);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean delete(String maSP) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {

            transaction = session.beginTransaction();
            String hql = "Delete from NSX where maNSX = :Hello";
            Query query = session.createQuery(hql);
            query.setParameter("Hello", maSP);
            if (query.executeUpdate() > 0) {
                transaction.commit();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean update(String maSP, NSX nsx) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            String hql = "Update NSX set tenNSX= :LK   where maNSX = :Hello";
            Query query = session.createQuery(hql);
            query.setParameter("LK", nsx.getTenNSX());
            query.setParameter("Hello", maSP);
            if (query.executeUpdate() > 0) {
                transaction.commit();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static void main(String[] args) {
        List<NSX> list = new CRUD_NSX().getAll();
        for (NSX nsx : list) {
            System.out.println(nsx.toString());
        }
    }
}
