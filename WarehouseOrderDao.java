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
public interface WarehouseOrderDao {
    
    //Methods
    
    public boolean createWarehouseOrderDB(String equipmentName, 
            String equipmentStartLocation, String equipmentDeliveryLocation){}
    
    public boolean completeWarehouseOrderDB(int orderNum, String equipmentName, 
            int equipmentNumber){}
    
    public ArrayList<WarehouseOrder> getOpenWarehouseOrdersDB(){}
    
    public ArrayList<WarehouseOrder> getOpenWarehouseOrdersByLocationDB(String employeeType){}
    
    public boolean createWarehouseOrder(String equipmentName, String equipmentStartLocation, 
            String equipmentDeliveryLocation){}
    
    public boolean completeWarehouseOrder(String equipmentName, int equipmentNumber){}
    
    public ArrayList<WarehouseOrder> notificationNewWarehouseOrder(Employee signedOnEmployee){}
    
    public ArrayList<WarehouseOrder> getEarliestOpenEquipmentOrder(String equipmentName, 
            ArrayList<WarehouseOrder> arrayList){}
}
