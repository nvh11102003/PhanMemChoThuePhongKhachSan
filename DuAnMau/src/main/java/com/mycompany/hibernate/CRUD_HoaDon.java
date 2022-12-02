package com.mycompany.hibernate;

import com.mycompany.Utilities.HibernateUtil;
import com.mycompany.model.ChiTietSP;
import com.mycompany.model.HoaDon;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CRUD_HoaDon {
    public List<HoaDon> getAll() {
        Session session = HibernateUtil.getFACTORY().openSession();
        List<HoaDon> list = (List<HoaDon>) session.createCriteria(HoaDon.class).list();
        return list;
    }

    public Boolean add(HoaDon hoaDon){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.save(hoaDon);
            transaction.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        List<HoaDon> list = new CRUD_HoaDon().getAll();
        for (HoaDon hoaDon : list) {
            System.out.println(hoaDon.toString());
        }
    }
}
