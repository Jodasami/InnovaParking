/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InnovaParking.parkingsystem.data;

import com.InnovaParking.parkingsystem.domain.ParkingLot;
import com.InnovaParking.parkingsystem.domain.Space;
import com.InnovaParking.parkingsystem.domain.Vehicle;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author jodas
 */
public class ParkingLotData {

    public LinkedList<ParkingLot> parkingLots;
    static int parkingLotId = 0;

    public ParkingLotData() {

        parkingLots = new LinkedList<>();
    }

    public ParkingLot registerParkingLot(String name, Space spaces[]) {

        ParkingLot parkingLot = new ParkingLot();
        parkingLotId++;//bug
        parkingLot.setId(parkingLotId);
        parkingLot.setName(name);
        parkingLot.setSpaces(spaces);

        //THIS WAS MISSING!!
        parkingLots.add(parkingLot);

        return parkingLot;

    }

    public int registerVehicleInParkingLot(Vehicle vehicle, ParkingLot parkingLot) {

        ArrayList<Vehicle> vehiclesInParkingLot = parkingLot.getVehicles();
        Space spaces[] = parkingLot.getSpaces();
        int spaceId = 0;
        //recorre la lista de vehículos para ver en qué posición
        //podemos ingresar al vehículo actual
        for (int i = 0; i < spaces.length; i++) {

            if (!spaces[i].isSpaceTaken()) {

                //preguntamos si el cliente presenta una capacidad particular
                //y requiere de un espacio adaptado
                if (vehicle.getOwner().isDisabilityPresented()) {

                    if (spaces[i].isDisabilityAdaptation()) {

                        //compara el tipo de vehículo del espacio y del vehículo que se va a 
                        //estacionar (tipos: moto, automóvil, bus, etc)
                        if (spaces[i].getVehicleType().getId() == vehicle.getVehicleType().getId()) {
                            vehiclesInParkingLot.add(vehicle);
                            spaces[i].setSpaceTaken(true);
                            //este es el número del espacio que se va a retornar
                            spaceId = spaces[i].getId();
                            break;
                        }

                    }

                } else {

                    if (!spaces[i].isDisabilityAdaptation()) {
                        //compara el tipo de vehículo del espacio y del vehículo que se va a 
                        //estacionar (tipos: moto, automóvil, bus, etc)
                        if (spaces[i].getVehicleType().getId() == vehicle.getVehicleType().getId()) {

                            vehiclesInParkingLot.add(vehicle);
                            spaces[i].setSpaceTaken(true);
                            //este es el número del espacio que se va a retornar
                            spaceId = spaces[i].getId();
                            break;
                        }

                    }
                }

            }

        }

        //*************actualizamos los espacios tomados
        //y los vehículos registrados en el parqueo
        parkingLot.setSpaces(spaces);//maybe not needed
        parkingLot.setVehicles(vehiclesInParkingLot);//maybe not needed

        return spaceId;
    }

    public void removeVehicleFromParkingLot(Vehicle vehicle, ParkingLot parkingLot) {

        ArrayList<Vehicle> vehiclesInParkingLot = parkingLot.getVehicles();
        Space spaces[] = parkingLot.getSpaces();
        int spaceId = 0;
        //recorre la lista de vehículos para ver en qué posición
        //debemos retirar al vehículo actual
        for (int i = 0; i < vehiclesInParkingLot.size(); i++) {

            if (vehiclesInParkingLot.get(i) == vehicle) {

                vehiclesInParkingLot.remove(vehicle);
                spaces[i].setSpaceTaken(false);
                break;
            }

        }
        //*************actualizamos los espacios liberados
        //y los vehículos registrados en el parqueo

        parkingLot.setSpaces(spaces);
        parkingLot.setVehicles(vehiclesInParkingLot);

    }

    public ParkingLot findParkingLotById(int id) {

        ParkingLot parkingLotToBeReturned = null;

        for (ParkingLot parkingLot : parkingLots) {

            //ToDo = test with int and String IDs
            if (parkingLot.getId() == id) {

                parkingLotToBeReturned = parkingLot;
                break;
            }
        }
        /*for (Iterator it = customerDatabase.iterator(); it.hasNext();) {
            Customer obj = (Customer)it.next();
            System.out.println(obj);
        }*/
        return parkingLotToBeReturned;
    }

    public LinkedList<ParkingLot> getAllParkingLots() {

        return parkingLots;

    }

}
