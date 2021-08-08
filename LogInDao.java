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
public interface LogInDao {
    
    
    //Methods
    public Employee getEmployeeInfoDB(int userID){}
    
    public boolean systemLogIn(int userID, String password){}
    
    public boolean verifyCredentials(Employee employee, String password){}
    
}
