/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate;

import com.mycompany.Utilities.HibernateUtil;
import com.mycompany.model.MauSac;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author HP
 */
public class CRUD_MauSac {
    public List<MauSac> getAll() {
        Session session = HibernateUtil.getFACTORY().openSession();
        List<MauSac> list = (List<MauSac>) session.createCriteria(MauSac.class).list();
        return list;
    }

    public Boolean add(MauSac mauSac) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(mauSac);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean delete(String maMS) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {

            transaction = session.beginTransaction();
            String hql = "Delete from MauSac where maMauSac = :Hello";
            Query query = session.createQuery(hql);
            query.setParameter("Hello", maMS);
            if (query.executeUpdate() > 0) {
                transaction.commit();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean update(String maSP, MauSac mauSac) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            String hql = "Update MauSac set tenMauSac= :LK   where MauSac = :Hello";
            Query query = session.createQuery(hql);
            query.setParameter("LK", mauSac.getTenMauSac());
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
        List<MauSac> list = new CRUD_MauSac().getAll();
        for (MauSac mauSac : list) {
            System.out.println(mauSac.toString());
        }
    }
}
