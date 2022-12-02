/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate;

import com.mycompany.Utilities.HibernateUtil;
import com.mycompany.model.DongSP;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author HP
 */
public class CRUD_DongSP {

    public List<DongSP> getAll() {
        Session session = HibernateUtil.getFACTORY().openSession();
        List<DongSP> list = (List<DongSP>) session.createCriteria(DongSP.class).list();
        return list;
    }

    public Boolean add(DongSP dongSP) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(dongSP);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean delete(String maDSP) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {

            transaction = session.beginTransaction();
            String hql = "Delete from DongSP where maDSP = :Hello";
            Query query = session.createQuery(hql);
            query.setParameter("Hello", maDSP);
            if (query.executeUpdate() > 0) {
                transaction.commit();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean update(String maDSP, DongSP dongSP) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            String hql = "Update DongSP set tenDSP= :LK   where maDSP = :Hello";
            Query query = session.createQuery(hql);
            query.setParameter("LK", dongSP.getTenDSP());
            query.setParameter("Hello", maDSP);
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
        List<DongSP> list = new CRUD_DongSP().getAll();
        for (DongSP dongSP : list) {
            System.out.println(dongSP.toString());
        }
    }
}
