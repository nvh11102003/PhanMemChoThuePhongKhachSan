/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Hibernate;

import com.mycompany.Domainmodel.Phong;
import com.mycompany.Domainmodel.ThongTinThuePhong;
import com.mycompany.Utilities.HibernateUtil;
import java.sql.Date;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ASUS
 */
public class CRUD_ThongTinThuePhong {

    public List<ThongTinThuePhong> getAll() {
        Session session = HibernateUtil.getFACTORY().openSession();
        List<ThongTinThuePhong> list = (List<ThongTinThuePhong>) session.createCriteria(ThongTinThuePhong.class).list();
        return list;
    }

    public boolean xoa(String id) {
        Transaction transaction = null;
        
         try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            String hql = "DELETE ThongTinThuePhong WHERE idp = :hid";
             Query query = session.createQuery(hql);
            query.setParameter("hid", id);
            if (query.executeUpdate() > 0) {
                transaction.commit();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean add(ThongTinThuePhong tttp) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(tttp);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(String id, ThongTinThuePhong tttp) {
        tttp.setId(id);
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(id, tttp);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
