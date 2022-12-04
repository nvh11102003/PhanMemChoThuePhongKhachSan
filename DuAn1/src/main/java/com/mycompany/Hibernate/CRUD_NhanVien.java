/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Hibernate;

import com.mycompany.Domainmodel.NhanVien;
import com.mycompany.Utilities.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;

/**
 *
 * @author HP
 */
public class CRUD_NhanVien {
    public List<NhanVien> getAll(){
        Session session = HibernateUtil.getFACTORY().openSession();
        List<NhanVien> list = (List<NhanVien>) session.createCriteria(NhanVien.class).list();
        return list;
   }
    public Boolean update(String id, NhanVien nhanVien) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            String hql = "Update NhanVien set  ma = :NT,ten = :NTP, tenDem = :TT, ho = :TKH, gioiTinh = :ST,ngaySinh =:NS, sdt=:sdt, diaChi=:DC where id = :Hello";
            Query query = session.createQuery(hql);
            query.setParameter("NT", nhanVien.getMa());
            query.setParameter("NTP", nhanVien.getTen());
            query.setParameter("TT",nhanVien.getTenDem());
            query.setParameter("TKH", nhanVien.getHo());

            query.setParameter("ST", nhanVien.getGioiTinh());
            query.setParameter("NS", nhanVien.getNgaySinh());
            query.setParameter("sdt", nhanVien.getSdt());
            query.setParameter("DC", nhanVien.getDiaChi());

            query.setParameter("Hello", id);
            if (query.executeUpdate() > 0) {
                transaction.commit();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
