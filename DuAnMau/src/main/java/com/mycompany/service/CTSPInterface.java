/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.service;

import com.mycompany.service.impl.*;
import com.mycompany.model.ChiTietSP;
import com.mycompany.model.NSX;
import java.util.List;

/**
 *
 * @author HP
 */
public interface CTSPInterface {

    public List<ChiTietSP> getAll();

    public Boolean add(ChiTietSP chiTietSP);

    public Boolean delete(String id);

    public Boolean update(String id, ChiTietSP chiTietSP);



}
