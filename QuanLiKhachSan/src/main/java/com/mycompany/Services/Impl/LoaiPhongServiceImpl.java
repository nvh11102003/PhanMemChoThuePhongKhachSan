/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Services.Impl;

import com.mycompany.Domainmodel.LoaiPhong;
import com.mycompany.Services.ILoaiPhongService;
import com.mycompany.repository.ILoaiPhongRepository;
import com.mycompany.repository.Impl.LoaiPhongRepositoryImpl;

import java.util.List;

/**
 *
 * @author DELL
 */
public class LoaiPhongServiceImpl implements ILoaiPhongService {

    private ILoaiPhongRepository loaiPhongRepo = new LoaiPhongRepositoryImpl();

    @Override
    public List<LoaiPhong> findAll() {
        return loaiPhongRepo.findAll();
    }
}
