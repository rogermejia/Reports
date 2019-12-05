/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.report.system.dao;

import com.report.system.entities.Categories;
import com.report.system.entities.OrderDetails;
import com.report.system.entities.Orders;
import com.report.system.entities.Products;
import com.report.system.entities.Shippers;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author rogelio.mejia
 */
@Stateless
public class CategoriesDao {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.report_RepportingSystem_war_1.0-SNAPSHOTPU");
    private final EntityManager em = emf.createEntityManager();

    public List<Categories> selectAllCategories() {
        List<Categories> list = new ArrayList<Categories>();
        try {
            list = em.createNamedQuery("Categories.findAll").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Shippers> selectAllShippers() {
        List<Shippers> list = new ArrayList<Shippers>();
        try {
            list = em.createNamedQuery("Shippers.findAll").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Products> selectAllProducts() {
        List<Products> list = new ArrayList<Products>();
        try {
            list = em.createNamedQuery("Products.findAll").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<OrderDetails> selectAllOrderDetails() {
        List<OrderDetails> list = new ArrayList<OrderDetails>();
        try {
            list = em.createNamedQuery("OrderDetails.findAll").getResultList();
            System.out.print("     Unit Price     ");
            System.out.print("     Quantity     ");
            System.out.println("     Discount     ");
            
            for (OrderDetails o : list) {
                System.out.print("     " +o.getUnitPrice() + "     ");
                System.out.print("            " +o.getQuantity() + "     ");
                System.out.println("         " +o.getDiscount());
            }
            System.out.println("   ");
            System.out.println(" ******************** OrderDetails List size " + list.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Orders> selectAllOrders() {
        List<Orders> list = new ArrayList<Orders>();
        try {
            System.out.println(" ******************** List Orders size ");
            list = em.createNamedQuery("Orders.findAll").getResultList();
            System.out.println(" ******************** List Orders size " + list.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
