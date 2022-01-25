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
public class Customer extends User {

    private String id;
    private String name;
    private boolean disabilityPresented;

    public Customer(String id, String name, boolean disabilityPresented) {
        this.id = id;
        this.name = name;
        this.disabilityPresented = disabilityPresented;
    }

    public Customer() {

    }

    //ToDo: test default constructor
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the disabilityPresented
     */
    public boolean isDisabilityPresented() {
        return disabilityPresented;
    }

    /**
     * @param disabilityPresented the disabilityPresented to set
     */
    public void setDisabilityPresented(boolean disabilityPresented) {
        this.disabilityPresented = disabilityPresented;
    }

    @Override
    public boolean verifyUserLogin(String[] loginDetails) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
