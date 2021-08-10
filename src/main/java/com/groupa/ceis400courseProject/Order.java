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
public class Order {

    private int orderId;
    private String equipmentName;
    private Date orderStartDate;
    private Date orderEndDate;
    private Instant orderStartTime;
    private Instant orderEndTime;
    private String equipmentStartLocation;
    private String equipmentDeliveryLocation;
    private Equipment equipmentTransferred;


    //Getters and Setters
    public int getOrderId(){}

    public void setOrderId(int orderId){}

    public String getEquipmentName(){}

    public void setEquipmentName(String equipmentName){}

    public Date getOrderStartDate(){}

    public void setOrderStartDate(Date orderStartDate){}

    public Date getOrderEndDate(){}

    public void setOrderEndDate(Date orderEndDate){}

    public Instant getOrderStartTime(){}

    public void setOrderStartTime(Instant orderStartTime){}

    public Instant getOrderEndTime(){}

    public void setOrderEndTime(Instant orderEndTime){}

    public String getEquipmentStartLocation(){}

    public void setEquipmentStartLocation(String equipmentStartLocation){}

    public String getEquipmentDeliveryLocation(){}

    public void setEquipmentDeliveryLocation(String equipmentDeliveryLocation){}

    public Equipment getEquipmentTransferred(){}

    public void setEquipmentTransferred(Equipment equipmentTransferred){}
}
