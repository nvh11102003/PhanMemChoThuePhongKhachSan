
package com.mycompany.Services.Impl;

import com.mycompany.Domainmodel.DichVu;
import com.mycompany.Repositories.DichVu_Repo;
import com.mycompany.Services.DichVuService;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class DichVuImpl implements DichVuService{

    private DichVu_Repo QLDV = new DichVu_Repo();
    @Override
    public List<DichVu> getAll() {
        return QLDV.getAll();
    }

    @Override
    public Boolean add(DichVu dv) {
        return QLDV.add(dv);
    }

    @Override
    public Boolean update(DichVu dv, String id) {
        return QLDV.update(dv, id);
    }

    @Override
    public Boolean delete(String id) {
        return QLDV.delete(id);
    }

    @Override
    public DichVu findDichVuByMaDV(String madv) {
        return QLDV.findDichVuByMaDV(madv);
    }
}
