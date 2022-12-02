/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate;

import com.mycompany.Utilities.HibernateUtil;
import com.mycompany.model.ChiTietSP;
import com.mycompany.model.SanPham;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author HP
 */
public class CRUD_CTSP {

    public List<ChiTietSP> getAll() {
        Session session = HibernateUtil.getFACTORY().openSession();
        List<ChiTietSP> list = (List<ChiTietSP>) session.createCriteria(ChiTietSP.class).list();
        return list;
    }

    public Boolean add(ChiTietSP chiTietSP) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
//            session.getEntityManagerFactory().createEntityManager().persist(chiTietSP);
            session.save(chiTietSP);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

//    public String findByIdSp() {
//        String uuid;
//        SanPham sanPham = new SanPham();
//        try (Session session = HibernateUtil.getFACTORY().openSession()) {
//            String statement = "select ms.idSanPham from SanPham ms where ms.tenSp = :ten";
//            TypedQuery<String> query = session.createQuery(statement, String.class);
//            query.setParameter("ten", sanPham.getTenSp());
//            uuid = query.getSingleResult();
//        }
//        return uuid;
//    }
//
//    public String findByIdDSP(String ten) {
//        String uuid;
//        try (Session session = HibernateUtil.getFACTORY().openSession()) {
//            String statement = "select ms.idDSP from DongSP ms where ms.tenDSP = :ten";
//            TypedQuery<String> query = session.createQuery(statement, String.class);
//            query.setParameter("ten", ten);
//            uuid = query.getSingleResult();
//        }
//        return uuid;
//    }
//
//    public String findByIdDMS(String ten) {
//        String uuid;
//        try (Session session = HibernateUtil.getFACTORY().openSession()) {
//            String statement = "select ms.idMS from MauSac ms where ms.tenMauSac = :ten";
//            TypedQuery<String> query = session.createQuery(statement, String.class);
//            query.setParameter("ten", ten);
//            uuid = query.getSingleResult();
//        }
//        return uuid;
//    }
//
//    public String findByIdDNSX(String ten) {
//        String uuid;
//        try (Session session = HibernateUtil.getFACTORY().openSession()) {
//            String statement = "select ms.idNSX from NSX ms where ms.tenNSX = :ten";
//            TypedQuery<String> query = session.createQuery(statement, String.class);
//            query.setParameter("ten", ten);
//            uuid = query.getSingleResult();
//        }
//        return uuid;
//    }

    public Boolean delete(String id){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {

            transaction = session.beginTransaction();
            String hql = "Delete from ChiTietSP where id = :Hello";
            Query query = session.createQuery(hql);
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
    public Boolean update(String ID , ChiTietSP chiTietSP){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            String hql = "Update ChiTietSP set soLuongTon = :LK, moTa = :LJ,namBH = :LS, giaNhap = :LU, giaBan = :LH  where id = :Hello";
            Query query = session.createQuery(hql);
            query.setParameter("LK", chiTietSP.getSoLuongTon());
            query.setParameter("LJ", chiTietSP.getMoTa());
            query.setParameter("LS", chiTietSP.getNamBH());
            query.setParameter("LU", chiTietSP.getGiaNhap());
            query.setParameter("LH", chiTietSP.getGiaBan());
            query.setParameter("Hello", ID);
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
        List<ChiTietSP> ctsp = new CRUD_CTSP().getAll();
        for (ChiTietSP chiTietSP : ctsp) {
            System.out.println(chiTietSP.toString());
        }
    }
}
