/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.service;

import com.mycompany.model.NSX;
import java.util.List;

/**
 *
 * @author HP
 */
public interface NSXInterface {
    public Boolean add(NSX nsx);
    public List<NSX> getAll();
    public Boolean delete(String maNSX);
    public Boolean update(String maNSX, NSX nsx);
}
