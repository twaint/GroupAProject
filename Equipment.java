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
    private int equipmentNumber;
    private String equipmentName;
    private String description;
    private boolean equipmentDamaged;
    private String buildingLocation;
    private String shelfLocation;
    private boolean isAssigned;
    private int borrowerID;
    
    //Methods
    public Equipment(){
        this.equipmentNumber = 0;
        this.equipmentName = null;
        this.description = null;
        this.equipmentDamaged = false;
        this.buildingLocation = null;
        this.shelfLocation = null;
        this.isAssigned = false;
        this.borrowerID = 0;
    }
    
    
    public Equipment(int equipmentNumber, String equipmentName, String description,
            boolean equipmentDamaged, String buildingLocation, String shelfLocation,
            boolean isAssigned, int borrowerID){
        
        this.equipmentNumber = equipmentNumber;
        this.equipmentName = equipmentName;
        this.description = description;
        this.equipmentDamaged = equipmentDamaged;
        this.buildingLocation = buildingLocation;
        this.shelfLocation = shelfLocation;
        this.isAssigned = isAssigned;
        this.borrowerID = borrowerID;
    }
    
    public void setEquipmentNumber(int equipmentNumber){
        this.equipmentNumber = equipmentNumber;
    }
    
    public int getEquipmentNumber(){
        return equipmentNumber;
    }
    
    public void setEquipmentName(String equipmentName){
        this.equipmentName = equipmentName;
    }
    
    public String getEquipmentName(){
        return equipmentName;
    }

    public void setDescription(String description){
        this.description = description;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setEquipmentDamaged(boolean equipmentDamaged){
        this.equipmentDamaged = equipmentDamaged;
    }
    
    public boolean getEquipmentDamaged(){
        return equipmentDamaged;
    }
    
    public void setBuildingLocation(String buildingLocation){
        this.buildingLocation = buildingLocation;
    }
    
    public String getBuildingLocation(){
        return buildingLocation;
    }
    
    public void setShelfLocation(String shelfLocation){
        this.shelfLocation = shelfLocation;
    }
    
    public String getShelfLocation(){
        return shelfLocation;
    }
    
    public void setIsAssigned(boolean isAssigned){
        this.isAssigned = isAssigned;
    }
    
    public boolean getIsAssigned(){
        return isAssigned;
    }
    
    public void setBorrowerID(int borrowerID){
        this.borrowerID = borrowerID;
    }
    
    public int getBorrowerID(){
        return borrowerID;
    }
}
