
package com.mycompany.Repositories;

import com.mycompany.Models.ChiTietPhong;
import com.mycompany.Models.ChucVu;
import com.mycompany.Models.DichVu;
import com.mycompany.Models.DichVuDung;
import com.mycompany.Models.HoaDon;
import com.mycompany.Models.KhachHang;
import com.mycompany.Models.LoaiPhong;
import com.mycompany.Models.NhanVien;
import com.mycompany.Models.Phong;
import com.mycompany.Models.ThongTinThuePhong;
import org.hibernate.cfg.Configuration;
import java.util.Properties;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class HibernateUtil {
    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=DuAn1");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "123456");
        properties.put(Environment.SHOW_SQL, "true");
//        gen DB tự động
        //properties.put(Environment.HBM2DDL_AUTO, "create");

        conf.setProperties(properties);
        conf.addAnnotatedClass(NhanVien.class);
        conf.addAnnotatedClass(ChucVu.class);
        conf.addAnnotatedClass(ChiTietPhong.class);
        conf.addAnnotatedClass(Phong.class);
        conf.addAnnotatedClass(ThongTinThuePhong.class);
        conf.addAnnotatedClass(KhachHang.class);
        conf.addAnnotatedClass(HoaDon.class);
        conf.addAnnotatedClass(DichVu.class);
        conf.addAnnotatedClass(DichVuDung.class);
        conf.addAnnotatedClass(LoaiPhong.class);
        


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

