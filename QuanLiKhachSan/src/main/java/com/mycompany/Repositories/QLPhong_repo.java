
package com.mycompany.Repositories;

import com.mycompany.Domainmodel.Phong;
import com.mycompany.viewModels.ChiTietPhongViewModel;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;


public class QLPhong_repo {
    public List<Phong> getAll(){
        Session session = HibernateUtil.getFACTORY().openSession();
        List<Phong> listPhong = session.createCriteria(Phong.class).list();
        return listPhong;
    }
    public static void main(String[] args) {
        List<Phong> list = new QLPhong_repo().getAll();
        for (Phong hoaDon : list) {
            System.out.println(hoaDon.toString());
        }
    }     
    
    
}
