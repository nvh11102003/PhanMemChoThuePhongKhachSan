/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.service;

import com.mycompany.model.MauSac;
import java.util.List;

/**
 *
 * @author HP
 */
public interface MauSacInterface {
    public Boolean add(MauSac mauSac);
    public List<MauSac> getAll();
    public Boolean delete(String maMauSac);
    public Boolean update(String maMauSac, MauSac mauSac);
}
