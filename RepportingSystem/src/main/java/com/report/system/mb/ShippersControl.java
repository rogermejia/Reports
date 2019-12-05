/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.report.system.mb;

import com.report.system.connection.Connector;
import com.report.system.dao.CategoriesDao;
import com.report.system.dao.ShippersDao;
import com.report.system.entities.Categories;
import com.report.system.entities.OrderDetails;
import com.report.system.entities.Orders;
import com.report.system.entities.Products;
import com.report.system.entities.Shippers;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author rogelio.mejia
 */
@ManagedBean
@ViewScoped
public class ShippersControl implements Serializable {

    private List<Shippers> listShip;
    private List<Categories> listCategories;
    private List<Products> listProducts;
    private List<OrderDetails> listOrderDetails;
    private List<Orders> listOrders;

    @EJB
    private CategoriesDao sh;

    @PostConstruct
    public void init() {
        sh = new CategoriesDao();
        listShip = new ArrayList<Shippers>();
        listCategories = new ArrayList<Categories>();
        listProducts = new ArrayList<Products>();
        listOrders = new ArrayList<Orders>();
        listOrderDetails = new ArrayList<OrderDetails>();
        listShippers();
        listCategories();
        listProducts();
        listOrders();
        //listOrderDetails();
    }

    public void listCategories() {
        listCategories = sh.selectAllCategories();
    }

    public void listShippers() {
        listShip = sh.selectAllShippers();
    }

    public void listProducts() {
        listProducts = sh.selectAllProducts();
    }

    public void listOrderDetails() {
        System.out.println("start time control" + new Date());
        listOrderDetails = sh.selectAllOrderDetails();
        System.out.println("end time contro" + new Date());
    }

    public void listOrders() {
        listOrders = sh.selectAllOrders();
    }

    //**************************************************************************
    public List<Shippers> getListShip() {
        return listShip;
    }

    public List<Categories> getListCategories() {
        return listCategories;
    }

    public List<Products> getListProducts() {
        return listProducts;
    }

    public List<OrderDetails> getListOrderDetails() {
        return listOrderDetails;
    }

    public List<Orders> getListOrders() {
        return listOrders;
    }

}
