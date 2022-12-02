/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate;

import com.mycompany.Utilities.HibernateUtil;
import com.mycompany.model.SanPham;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author HP
 */
public class CRUD_SanPham {

    public List<SanPham> getAll() {
        Session session = HibernateUtil.getFACTORY().openSession();
        List<SanPham> list = (List<SanPham>) session.createCriteria(SanPham.class).list();
        return list;
    }

    public Boolean add(SanPham sanPham) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(sanPham);
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
            String hql = "Delete from SanPham where maSP = :Hello";
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

    public Boolean update(String maSP, SanPham sanPham) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            String hql = "Update SanPham set tenSp = :LK   where maSP = :Hello";
            Query query = session.createQuery(hql);
            query.setParameter("LK", sanPham.getTenSp());
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
        List<SanPham> list = new CRUD_SanPham().getAll();
        for (SanPham sanPham : list) {
            System.out.println(sanPham.toString());
        }
        
    }
}
