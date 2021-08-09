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
public interface EmployeeDao {
    
    //Methods
    public boolean createEmployeeDB(String fName, String lName, String empType){}
    
    public boolean addTrainingDB(int empID, String equipName, String requirement, boolean complete){}
    
    public Employee getEmployeeDB(int empNum){}
    
    public Employee getEmployeeDB(String fName, String lName){}
    
    public ArrayList<Employee> getGroupEmployeeDB(ArrayList<String> fName, ArrayList<String> lName){}
    
    public ArrayList<Employee> getEmployeeListDB(){}
    
    public boolean deleteEmployeeDB(int empID){}
    
    public boolean checkEmployeeTraining(int empID, String toolName){}
    
    public ArrayList<Training> getTraining(int empNum){}
}
