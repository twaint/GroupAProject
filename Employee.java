/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupa.ceis400courseProject;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author joebe
 */
public class Employee extends Training {

    private int employeeNumber;
    private String firstName;
    private String lastName;
    private String employeeType;
    private String password;
    private Date hireDate;
    private ArrayList<Training> training;


    //Getters and Setters
    public Employee(){
        this.employeeNumber = 0;
        this.firstName = null;
        this.lastName = null;
        this.employeeType = null;
        this.password = null;
        this.hireDate = null;
        this.training = new ArrayList<Training>();
    }
    
    public Employee(int employeeNumber, String firstName, String lastName, 
            String employeeType, String password, Date hireDate,
            ArrayList<Training> training){
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeType = employeeType;
        this.password = password;
        this.hireDate = hireDate;
        
        this.training = new ArrayList<Training>();
        this.training = training;
    }
    
    public int getEmployeeNumber(){
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber){
        this.employeeNumber = employeeNumber;
    }
        
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmployeeType(){
        return employeeType;
    }

    public void setEmployeeType(String employeeType){
        this.employeeType = employeeType;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public Date getHireDate(){
        return hireDate;
    }

    public void setHireDate(Date hireDate){
        this.hireDate = hireDate;
    }

    public ArrayList<Training> getArrayList(){
        return training;
    }

    public void setTraining(Training training){
        this.training = new ArrayList<Training>();
        this.training.add(training);
    }

    public void setTraining(ArrayList<Training> training){
        this.training = new ArrayList<Training>();
        this.training = training;
    }
}

