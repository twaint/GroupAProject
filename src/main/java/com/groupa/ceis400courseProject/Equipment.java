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
public class Equipment {
    
    //Declare Variables
    private String equipmentName;
    private int equipmentNumber;
    private String description;
    private boolean equipmentDamaged;
    private String buildingLocation;
    private String shelfLocation;
    private boolean isAssigned;
    private int borrowerID;
    
    //Methods
    public Equipment(){}
    public void setEquipmentName(String toolName){}
    public String getEquipmentName(){}
    public void setEquipmentNumber(int toolNum){}
    public int getEquipmentNumber(){}
    public void setDescription(String description){}
    public String getDescription(){}
    public void setEquipmentDamaged(boolean toolDamage){}
    public boolean getEquipmentDamaged(){}
    public void setBuildingLocation(String buildLoc){}
    public String getBuildingLocation(){}
    public void setShelfLocation(String shelfLoc){}
    public String getShelfLocation(){}
    public void setIsAssigned(boolean assign){}
    public boolean getIsAssigned(){}
    public void setBorrower(int borrowID){}
    public int getBorrower(){}
}
