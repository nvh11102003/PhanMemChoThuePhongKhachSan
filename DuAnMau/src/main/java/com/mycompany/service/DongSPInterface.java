/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.service;

import com.mycompany.model.DongSP;
import java.util.List;

/**
 *
 * @author HP
 */
public interface DongSPInterface {
    public List<DongSP> getAll();
    public Boolean add(DongSP dongSP);
    public Boolean delete(String ma);
    public Boolean update(String ma, DongSP dongSP);
}
