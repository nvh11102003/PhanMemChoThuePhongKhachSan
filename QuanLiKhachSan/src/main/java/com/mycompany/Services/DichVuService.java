
package com.mycompany.Services;

import com.mycompany.Domainmodel.DichVu;
import java.util.List;


public interface DichVuService {
    public List<DichVu> getAll();
    public Boolean add(DichVu dv);
    public Boolean update(DichVu dv, String id);
    public Boolean delete(String id);
    public DichVu findDichVuByMaDV(String madv);
}
