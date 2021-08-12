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
public class Training {

    private String equipmentName;
    private String requirements;
    private boolean isCompleted;


    //Getters and Setters
    public Training(){
        equipmentName = null;
        requirements = null;
        isCompleted = false;
    }
    public Training(String equipmentName, String requirements, boolean isCompleted){
        this.equipmentName = equipmentName;
        this.requirements = requirements;
        this.isCompleted = isCompleted;
    }
    
    public String getEquipmentName(){
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName){
        this.equipmentName = equipmentName;
    }

    public String getRequirements(){
        return requirements;
    }

    public void setRequirements(String requirements){
        this.requirements = requirements;
    }

    public boolean getIsCompleted(){
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted){
        this.isCompleted = isCompleted;
    }
}
