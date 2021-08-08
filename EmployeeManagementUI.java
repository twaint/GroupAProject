/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupa.ceis400courseProject;
import java.util.Date;
/**
 *
 * @author joebe
 */
public interface EmployeeManagementUI {
    
    //Methods
    public void startEmployeeManagementInterface(){}
    
    public void startAddEmployeeInterface(){}
    
    public void startTerminateEmployeeInterface(){}
    
    public void startAddTrainingInterface(){}
    
    public boolean addEmployee(String fName, String lName, String employeeType){}
    
    public boolean updateTraining(String fName, String lName, String equipmentType, 
            Date trainingDate, boolean complete){}
    
    public boolean deleteEmployee(int employeeID){}
    
    public boolean equipmentCheckedOut(int employeeID){}
    
    public int getEmployeeID(String fName, String lName){}
}
