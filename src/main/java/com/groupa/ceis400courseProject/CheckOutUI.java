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
public interface CheckOutUI {
    
    //Methods
    public void startCheckOutInterface(){}
    
    public boolean checkOutEquipment(int employeeID, String equipmentType){}
    
    public boolean updateEquipment(String toolName, int toolNumber, boolean assigned, int borrowerID){}
    
    public boolean verifyTraining(int employeeID, String equipName, int equipNum){}
    
    public ArrayList<Equipment> locateToolType(String equipmentType){}
    
    public boolean createTransactionLog(int employeeID, String equipName, int equipNum){}
    
    public Equipment getEquipmentChoice(String equipmentName, int equipmentID){}
    
    public boolean checkDepotQuantity(ArrayList<Equipment> equipment){}
    
    public void newWarehouseOrder(String equipmentName, String equipmentStartLocation, 
            String equipmentDeliveryLocation){}
}
