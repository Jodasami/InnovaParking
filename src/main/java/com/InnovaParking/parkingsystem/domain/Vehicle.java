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
public class Vehicle {

    private String plate;
    private String color;
    private String brand;
    private String model;
    private Customer owner;
    private VehicleType vehicleType;
    private int space;
    private Customer p1;
    private Customer p2;
    private Customer p3;
    private Customer p4;
    private int numberPassengers;

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public Vehicle() {

    }

    public Vehicle(String plate, String color, String brand, String model, Customer owner, VehicleType vehicleType, int space, int numberPassengers) {
        this.plate = plate;
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.owner = owner;
        this.vehicleType = vehicleType;
        this.space = space;
        this.numberPassengers = numberPassengers;
    }

    public Vehicle(String plate, String color, String brand, String model, Customer owner, Customer p1, VehicleType vehicleType, int space, int numberPassengers) {
        this.plate = plate;
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.owner = owner;
        this.vehicleType = vehicleType;
        this.space = space;
        this.numberPassengers = numberPassengers;
    }

    public Vehicle(String plate, String color, String brand, String model, Customer owner, Customer p1, Customer p2, VehicleType vehicleType, int space, int numberPassengers) {
        this.plate = plate;
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.owner = owner;
        this.vehicleType = vehicleType;
        this.space = space;
        this.numberPassengers = numberPassengers;
    }

    public Vehicle(String plate, String color, String brand, String model, Customer owner, Customer p1, Customer p2, Customer p3, VehicleType vehicleType, int space, int numberPassengers) {
        this.plate = plate;
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.owner = owner;
        this.vehicleType = vehicleType;
        this.space = space;
        this.numberPassengers = numberPassengers;
    }

    public Vehicle(String plate, String color, String brand, String model, Customer owner, Customer p1, Customer p2, Customer p3, Customer p4, VehicleType vehicleType, int space, int numberPassengers) {
        this.plate = plate;
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.owner = owner;
        this.vehicleType = vehicleType;
        this.space = space;
        this.numberPassengers = numberPassengers;
    }

    /**
     * @return the plate
     */
    public String getPlate() {
        return plate;
    }

    /**
     * @param plate the plate to set
     */
    public void setPlate(String plate) {
        this.plate = plate;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the owner
     */
    public Customer getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    /**
     * @return the vehicleType
     */
    public VehicleType getVehicleType() {
        return vehicleType;
    }

    /**
     * @param vehicleType the vehicleType to set
     */
    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }


    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }
    

}
