/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupa.ceis400courseProject;

/**
 *
 * @author joebe
 */
public interface EquipmentDao {
    
    //Methods
    public boolean createEquipmentDB(String equipmentName, int equipmentNumber, String buildingLoc, String shelfLoc){}
    
    public boolean checkOutEquipmentDB(String toolName, int toolNumber, boolean assigned, int borrowID){}
    
    public boolean checkInEquipmentDB(String toolName, int toolNumber, String shelfLocation, boolean damage){}
    
    public Equipment getEquipmentDB(String toolName, int toolNumber){}
    
    public ArrayList<Equipment> getEquipmentListDB(String toolName){}
}
