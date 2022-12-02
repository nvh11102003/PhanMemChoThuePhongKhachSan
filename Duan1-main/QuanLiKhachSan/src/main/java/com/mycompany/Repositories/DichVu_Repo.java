package com.mycompany.Repositories;

import com.mycompany.Models.DichVu;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class DichVu_Repo {

    public List<DichVu> getAll() {
        Session session = HibernateUtil.getFACTORY().openSession();
        List<DichVu> listDV = session.createCriteria(DichVu.class).list();
        return listDV;
    }

    public Boolean add(DichVu dv) {
        Transaction transac = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transac = session.beginTransaction();
            session.save(dv);
            transac.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean update(DichVu Dv, String Id) {
        Transaction transac = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transac = session.beginTransaction();
            String hql = "UPDATE DichVu SET loaiDichVu = :LDV, soTien = :gia WHERE maDichVu = :MaDV";
            Query query = session.createQuery(hql);
            query.setParameter("gia", Dv.getSoTien());
            query.setParameter("LDV", Dv.getLoaiDichVu());
            query.setParameter("MaDV", Id);
            if (query.executeUpdate() > 0) {
                transac.commit();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean delete(String id) {
        Transaction transac = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transac = session.beginTransaction();
            String hql = "DELETE DichVu WHERE maDichVu = :hid";
            Query query = session.createQuery(hql);
            query.setParameter("hid", id);
            if (query.executeUpdate() > 0) {
                transac.commit();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
