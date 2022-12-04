/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Service.impl;

import com.mycompany.Domainmodel.Phong;
import com.mycompany.Service.IPhongRepository;
import com.mycompany.Service.IPhongService;

import java.util.List;


/**
 *
 * @author DELL
 */
public class PhongServiceImpl implements IPhongService {

    private IPhongRepository PhongRepository = new PhongRepositoryImpl();

    @Override
    public List<Phong> findAll() {
        return PhongRepository.findAll();
    }

    @Override
    public boolean add(Phong phong) {
        return PhongRepository.add(phong);
    }

    @Override
    public boolean update(String id, Phong phong) {
        return PhongRepository.update(id, phong);
    }

    @Override
    public boolean delete(String id) {
        return PhongRepository.delete(id);
    }

    @Override
    public Phong findByRoomNumber(String roomNumber) {
        return PhongRepository.findByRoomNumber(roomNumber);
    }

}
