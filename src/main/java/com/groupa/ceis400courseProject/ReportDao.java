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
public interface ReportDao {
    
    //Methods
    
    public Report generateTransactionReport(String fName, String lName){}
    
    public Report generateTransactionReport(){}
    
    public Report generateOpenTransactionReport(String fName, String lName){}
    
    public ArrayList<Transaction> transactionReportEmployeeDB(int employeeID){}
    
    public ArrayList<Transaction> transactionReportOpenDB(){}
    
    public ArrayList<Transaction> transactionReportOpenDB(int employeeID){}
    
    public Report generateExceptionReport(){}
    
    public ArrayList<Transaction> exceptionReportDB(boolean equipmentDamage){}
    
    public Report generateOpenOrderReport(){}
    
    public ArrayList<EquipmentOrder> openOrderReportDB(){}
    
    public Report generateOrderReport(Date searchStart, Date searchEnd){}
    
    public ArrayList<EquipmentOrder> orderReportDB(Date searchStart, Date searchEnd){}
    
    public Report generateCustomReport(boolean includeEmployees, boolean includeEquipment, 
            boolean checkedOut, boolean damaged, boolean location, Date searchStart, 
            Date searchEnd, boolean includeTransactions, boolean includeTraining, 
            boolean includeOrders){}
    
    public boolean saveCustomReportDB(String reportName, boolean includeEmployees, 
            boolean includeEquipment, boolean checkedOut, boolean damaged, 
            boolean location, Date searchStart, Date searchEnd, 
            boolean includeTransactions, boolean includeTraining, boolean includeOrders){}
    
    public ArrayList<Equipment> customReportEquipmentCheckedOutDB(boolean checkedOut){}
    
    public ArrayList<Equipment> customReportEquipmentCheckedOutDB(boolean checkedOut, 
            Date searchStart, Date searchEnd){}
    
    public ArrayList<Equipment> customReportEquipmentDamagedDB(boolean damaged){}
    
    public ArrayList<Equipment> customReportEquipmentDamagedDB(boolean damaged, 
            Date searchStart, Date searchEnd){}
    
    public ArrayList<EquipmentOrder> customReportOrdersDB(){}
    
    public ArrayList<EquipmentOrder> customReportOrdersDB(Date searchStart, Date searchEnd){}
    
    public ArrayList<Employee> getEmployeeForTransaction(ArrayList<Transaction>){}
    
    public Employee getEmployeeDB(String fName, String lName){}
}
