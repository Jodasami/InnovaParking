/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InnovaParking.parkingsystem.domain;

/**
 *
 * @author jodas
 */
public interface Employee {
    
    public float calculateSalary(float dailySalary);
        
   public ParkingLot assignWorkplace(int parkingLotId);
    
}
