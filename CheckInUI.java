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
public interface CheckInUI {
    
    //Methods
    public void startCheckInInterface(){}
    
    public boolean checkInEquipment(int employeeID, String equipmentType, int equipmentID, 
            boolean damage){}
    
    public boolean checkInLocation(String building, String shelf){}
    
    public boolean updateTransactionLog(String toolName, int toolNum, boolean toolDamage, 
            String buildingLoc, String shelfLoc){}
    
    public ArrayList<Transaction> checkEquipmentBorrowed(int employeeID){}
}
