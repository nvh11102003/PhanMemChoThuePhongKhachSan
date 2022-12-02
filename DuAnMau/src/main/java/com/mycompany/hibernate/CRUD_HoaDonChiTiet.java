package com.mycompany.hibernate;

import com.mycompany.Utilities.HibernateUtil;
import com.mycompany.model.HoaDonChiTiet;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CRUD_HoaDonChiTiet {
    public Boolean addNew(HoaDonChiTiet hoaDonChiTiet){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(hoaDonChiTiet);
            transaction.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
