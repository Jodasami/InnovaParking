/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InnovaParking.parkingsystem.data;

import com.InnovaParking.parkingsystem.domain.Customer;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author jodas
 */
public class CustomerData {

    ArrayList<Customer> customerDatabase;

    public CustomerData() {

        customerDatabase = new ArrayList<>();
    }

    //CRUD -- ACME 
    public void insertCustomer(Customer customer) {

        customerDatabase.add(customer);

    }

    public ArrayList<Customer> getAllCustomers() {

        return customerDatabase;

    }

    public Customer findCustomerById(String customerId) {

        Customer customerToBeReturned = null;

        for (Customer customer : customerDatabase) {

            //ToDo = test with int and String IDs
            if (customer.getId().equals(customerId)) {
                
                customerToBeReturned = customer;
                break;
            }
        }
        /*for (Iterator it = customerDatabase.iterator(); it.hasNext();) {
            Customer obj = (Customer)it.next();
            System.out.println(obj);
        }*/
        return customerToBeReturned;
    }

}
