/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Service;


import com.mycompany.Domainmodel.Phong;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface IPhongRepository {
    public List<Phong> findAll();
    public boolean add(Phong phong);
    public boolean update(String id, Phong phong);
    public boolean delete(String id);
    public Phong findByRoomNumber(String roomNumber);
}
