/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InnovaParking.parkingsystem.data;

import com.InnovaParking.parkingsystem.domain.Customer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONObject;

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
 final String JSONFILEPATH = "C:\\Users\\Fabio\\Desktop";

//    public void insertCustomer(Customer customer) throws IOException{
//
//        JSONObject customerObject = new JSONObject();
//        customerObject.put("name", customer.getName());
//        customerObject.put("id", customer.getId());
//        customerObject.put("disabilityPresented", customer.DisabilutyPresented());
// 
//
//        //true allows multiple insertions in the file
//        try (FileWriter file = new FileWriter(JSONFILEPATH, true)) {
//            file.write(customerObject.toJSONString() + "\r\n");
//
//        }
//
//    }//Fin del método insertar
//
//    public ArrayList<Customer> getAllCustomers() throws ParseException, FileNotFoundException, IOException {
//        LinkedList<Customer> customers = new LinkedList<>();
//        JSONObject jsonObject;
//
//        // This will reference one line at a time
//        String line = null;
//
//        // FileReader reads text files in the default encoding.
//        FileReader fileReader = new FileReader(JSONFILEPATH);
//
//        // Always wrap FileReader in BufferedReader.
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//        while ((line = bufferedReader.readLine()) != null) {
//
//            jsonObject = (JSONObject) new JSONParser().parse(line);
//
//            Customer customer = new Customer();
//            customer.setName(jsonObject.get("name").toString());
//            customer.setEmail(jsonObject.get("id").toString());
//            customer.setPhone(jsonObject.get("disabilityPresented").toString());
//            System.out.println(customer.toString());
//            customers.add(customer);
//        }
//        // Always close files.
//        bufferedReader.close();
//
//        return customers;
//    }
//
//    public Customer getCustomer(String id) throws ParseException, FileNotFoundException, IOException {
//
//        Customer customer = new Customer();
//        JSONObject jsonObject;
//
//        // This will reference one line at a time
//        String line = null;
//
//        // FileReader reads text files in the default encoding.
//        FileReader fileReader = new FileReader(JSONFILEPATH);
//
//        // Always wrap FileReader in BufferedReader.
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//        while ((line = bufferedReader.readLine()) != null) {
//
//            jsonObject = (JSONObject) new JSONParser().parse(line);
//
//            if (jsonObject.get("id").toString().equals(id)) {
//                customer.setName(jsonObject.get("name").toString());
//                customer.setEmail(jsonObject.get("email").toString());
//                customer.setPhone(jsonObject.get("phone").toString());
//                customer.setAddress(jsonObject.get("address").toString());
//                customer.setUsername(jsonObject.get("username").toString());
//                customer.setPassword(jsonObject.get("password").toString());
//            }
//
//        }
//        // Always close files.
//        bufferedReader.close();
//
//        return customer;
//    }
//
//    public Customer getCustomer(String username, String password) throws ParseException, IOException {
//
//        Customer customer = new Customer();
//        JSONObject jsonObject;//THIRD PARTY
//
//        // This will reference one line at a time
//        String line = null;
//
//        // FileReader reads text files in the default encoding.
//        FileReader fileReader = new FileReader(JSONFILEPATH);
//
//        // Always wrap FileReader in BufferedReader.
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//        while ((line = bufferedReader.readLine()) != null) {
//
//            jsonObject = (JSONObject) new JSONParser().parse(line);
//
//            if (jsonObject.get("username").toString().equals(username) && jsonObject.get("password").toString().equals(password)) {
//                customer.setName(jsonObject.get("name").toString());
//                customer.setEmail(jsonObject.get("email").toString());
//                customer.setPhone(jsonObject.get("phone").toString());
//                customer.setAddress(jsonObject.get("address").toString());
//                customer.setUsername(jsonObject.get("username").toString());
//                customer.setPassword(jsonObject.get("password").toString());
//               
//            }
//
//        }
//        // Always close files.
//        bufferedReader.close();
//
//        return customer;
//    }
}
