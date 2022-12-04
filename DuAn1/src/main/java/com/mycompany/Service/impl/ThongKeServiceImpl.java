/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Service.impl;

import com.mycompany.Hibernate.CRUD_ThongKe;
import com.mycompany.Service.ThongKeService;
import com.mycompany.ViewModels.ThongKeView;
import java.util.List;

/**
 *
 * @author DELL
 */
public class ThongKeServiceImpl implements ThongKeService{
    CRUD_ThongKe thongkeRepo = new CRUD_ThongKe();
    @Override
    public List<ThongKeView> queryByDay(String date) {
        return thongkeRepo.queryByDay(date);
    }

    @Override
    public List<ThongKeView> queryByMonth(String month, String year) {
        return thongkeRepo.queryByMonth(month, year);
    }

    @Override
    public List<ThongKeView> queryByYear(String year) {
        return thongkeRepo.queryByYear(year);
    }
    
}
