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
public class Transaction {

    private int transactionId;
    private int borrowerId;
    private int equipmentId;

    private String equipmentName;
    private Date checkOutDate;
    private Instant CheckOutTime;
    private Date checkInDate;
    private Instant CheckInTime;
    private boolean isDamaged;


    //Getters and Setters
    public int getTransactionId(){}

    public void setTransactionId(int transactionId){}

    public int getBorrowerId(){}

    public void setBorrowerId(int borrowerId){}

    public int getEquipmentId(){}

    public void setEquipmentId(int equipmentId){}

    public String getEquipmentName(){}

    public void setEquipmentName(String equipmentName){}

    public Date getCheckOutDate(){}

    public void setCheckOutDate(Date checkOutDate){}

    public Instant getCheckOutTime(){}

    public void setCheckOutTime(Instant checkOutTime){}

    public Date getCheckInDate(){}

    public void setCheckInDate(Date checkInDate){}

    public Instant getCheckInTime(){}

    public void setCheckInTime(Instant checkInTime){}

    public boolean isDamaged(){}

    public void setDamaged(boolean damaged){}
}
