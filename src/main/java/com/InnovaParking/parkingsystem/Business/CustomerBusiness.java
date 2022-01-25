/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InnovaParking.parkingsystem.Business;

import com.InnovaParking.parkingsystem.data.CustomerData;
import com.InnovaParking.parkingsystem.domain.Customer;
import com.InnovaParking.parkingsystem.domain.User;
import com.InnovaParking.parkingsystem.domain.UserOperations;
import java.util.ArrayList;

/**
 *
 * @author jodas
 */
public class CustomerBusiness implements UserOperations {

    CustomerData customerData;

    public CustomerBusiness() {
        customerData = new CustomerData();
    }

    @Override
    public User searchUser(String identification) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User searchUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<User> sortUsers(User[] allUsers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<User> sortUsers(String identification, User[] allUsers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String insertCustomer(Customer customer) {

        Customer customerToCheck = customerData.findCustomerById(customer.getId());
        String result = "fail";

        if (customerToCheck == null) {

            customerData.insertCustomer(customer);
            result = "success";
        }

        return result;

    }
}
