/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shankar.main;

import com.shankar.entity.Customer;
import com.shankar.dao.CustomerDAO;
import com.shankar.entity.Loan;
import com.shankar.dao.LoanDAO;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Training
 */
public class LoanApplicationManager {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("josue");
        customer.setAddress("4010 linkwood drive");
        customer.setEmailID("shankece@gmail.com");
        customer.setPhoneNumber(71335788);
        Loan loan = new Loan();
        loan.setType("car");        
        loan.setAmount(100);
       // loan.setCustomer(customer);
        Set<Loan> loans= new HashSet<>();
        loans.add(loan);
        customer.setLoans(loans);
      //  LoanDAO.setLoan(loan);
        CustomerDAO.setCustomer(customer);

        Customer cust = CustomerDAO.getCustomer(1);
        if (cust != null) {
            System.out.println("Customer name is:" + cust.getName());
            System.out.println("Customer ID is:" + cust.getId());
            // System.out.println
        }
    }
}
