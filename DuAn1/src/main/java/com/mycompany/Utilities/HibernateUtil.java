/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Utilities;

import com.mycompany.Domainmodel.DichVu;
import com.mycompany.Domainmodel.DichVuDung;
import com.mycompany.Domainmodel.HoaDon;
import com.mycompany.Domainmodel.KhachHang;
import com.mycompany.Domainmodel.ChiTietPhong;
import com.mycompany.Domainmodel.NhanVien;
import com.mycompany.Domainmodel.Phong;
import com.mycompany.Domainmodel.ThongTinThuePhong;
import org.hibernate.cfg.Configuration;
import java.util.Properties;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

/**
 *
 * @author HP
 */
public class HibernateUtil {
    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=DuAn1");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "08102003");
        properties.put(Environment.SHOW_SQL, "true");
//        gen DB tự động
         properties.put(Environment.HBM2DDL_AUTO, "update");

        conf.setProperties(properties);
        conf.addAnnotatedClass(NhanVien.class);
        conf.addAnnotatedClass(Phong.class);
        conf.addAnnotatedClass(ThongTinThuePhong.class);
        conf.addAnnotatedClass(KhachHang.class);
        conf.addAnnotatedClass(HoaDon.class);
        conf.addAnnotatedClass(DichVu.class);
        conf.addAnnotatedClass(DichVuDung.class);
        conf.addAnnotatedClass(ChiTietPhong.class);
        


        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);


    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }

    public static void main(String[] args) {
        getFACTORY();
    }
}

