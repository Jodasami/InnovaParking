/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InnovaParking.parkingsystem.data;

import com.InnovaParking.parkingsystem.domain.Customer;
import com.InnovaParking.parkingsystem.domain.ParkingLot;
import com.InnovaParking.parkingsystem.domain.Vehicle;
import java.util.ArrayList;

/**
 *
 * @author jodas
 */
public class VehicleData {

    ArrayList<Vehicle> vehicleDatabase;

    public VehicleData() {

        vehicleDatabase = new ArrayList<>();

    }

    public Vehicle insertVehicle(Vehicle vehicle) {

        vehicleDatabase.add(vehicle);

        return vehicle;
    }

    public ArrayList<Vehicle> getAllVehicles() {

        return vehicleDatabase;

    }
    //why is null

    public Vehicle findVehicle(Customer customer) {

        Vehicle vehicleToBeReturned = null;

//        for (Vehicle vehicle : vehicleDatabase) {
//
//            if (vehicle.getOwner().getId().equals(customer.getId())) {
//
//                vehicleToBeReturned = vehicle;
//                break;
//            }
//        }
        System.out.println("Customer parametro: "+ customer.getId());
          for (int i = 0; i < vehicleDatabase.size(); i++) {
         
//            comparamos cada cliente de los vehículos
//            con el cliente pasado por parámetro
System.out.println("Owner: "+ vehicleDatabase.get(i).getOwner().getId());
            if (vehicleDatabase.get(i).getOwner().getId().equals(customer.getId())) {
                
//                cliente asociado al vehículo fue encontrado
//                por ende, vamos a retornar el vehículo
                vehicleToBeReturned=vehicleDatabase.get(i);
                break;
                   
            }
        }
        return vehicleToBeReturned;

    }

    public ArrayList<Vehicle> findVehiclesByParkingLot(ParkingLot parkingLot) {

        return parkingLot.getVehicles();
    }
}
