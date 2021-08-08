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
public interface WarehouseOrderUI {
    
    //Methods
    public void startOrderManagementInterface(){}
    
    public void createEquipmentOrderInterface(){}
    
    public void completeEquipmentOrderInterface(){}
    
    public void notificationNewEquipmentOrderInterface(){}
    
    public void openEquipmentOrderInterface(){}
    
    public boolean createEquipmentOrder(String equipmentName, String equipmentStartLocation, 
            String equipmentDeliveryLocation){}
    
    public boolean completeEquipmentOrder(String equipmentName, int equipmentNumber){}
    
    public ArrayList<WarehouseOrder> notificationNewEquipmentOrder(Employee signedOnEmployee){}
    
    public ArrayList<WarehouseOrder> getOpenEquipmentOrder(){}
    
    public Employee getSignedOnEmployeeType(){}
}
