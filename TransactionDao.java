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
public interface TransactionDao {
    
    public boolean newTransactionDB(int empID, String equipName, int equipID){}
    
    public Transaction getTransactionDB(int transactionID){}
    
    public Transaction getTransactionDB(String equipmentName, int equipmentID){}
    
    public ArrayList<Transaction> getGroupEquipmentTransactionDB(String equipmentName){}
    
    public ArrayList<Transaction> getEmployeeTransactionDB(int borrowerID){}
    
    public boolean updateTransactionDB(int transactionID, String toolName, int toolNum, boolean toolDamage, String buildingLoc, String shelfLoc){}
    
    public ArrayList<Transaction> outstandingEquipmentListDB(int borrowerID){}
}
