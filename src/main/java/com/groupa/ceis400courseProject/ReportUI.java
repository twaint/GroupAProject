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
public interface ReportUI {
    
    //Methods
    public void startReportChoiceInterface(){}
    
    public void startPredefinedReportInterface(){}
    
    public void startSavedReportInterface(){}
    
    public void startCustomReportInterface(){}
    
    public void startGenerateReportInterface(){}
    
    public void startOrderReportInterface(){}
    
    public void generateReport(Report report){}
    
    public Report employeeTransactionReport(String fName, String lName){}
    
    public Report openTransactionReport(){}
    
    public Report exceptionReport(){}
    
    public Report openOrderReport(){}
    
    public ArrayList<EquipmentOrder> orderReport(Date startSearch, Date endSearch){}
    
    public Report customReport(boolean includeEmployees, boolean includeEquipment, 
            boolean checkedOut, boolean damaged, boolean location, Date searchStart, 
            Date searchEnd, boolean includeTransactions, boolean includeTraining, 
            boolean includeOrders){}
    
    public boolean saveCustomReport(String reportName, ArrayList<Employee> employees, 
            boolean includeEmployee, ArrayList<Equipment> equipment, boolean includeEquipment, 
            boolean damaged, boolean location, Date searchStart, Date searchEnd, 
            boolean includeTransactions, boolean includeTraining, boolean includeOrders){}
    
    public boolean deleteReport(String reportName){}
    
    public ArrayList<Equipment> getEquipmentList(){}
    
    public ArrayList<Employee> getEmployeeList(){}
}
