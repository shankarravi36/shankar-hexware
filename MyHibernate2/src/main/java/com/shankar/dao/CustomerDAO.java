/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shankar.dao;
import com.shankar.entity.Customer;
import com.shankar.entity.Customer;
import com.shankar.utility.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Training
 */
public class CustomerDAO {
    
    public static Customer getCustomer(int id){
        Session session= HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        Customer customer= (Customer) session.get(Customer.class,id);
        transaction.commit();
        return customer;        
    }
    public static void setCustomer(Customer customer){
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session;
        session = sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(customer);
        transaction.commit();
    } 
}
