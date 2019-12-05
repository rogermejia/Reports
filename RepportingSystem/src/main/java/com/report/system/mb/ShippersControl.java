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
import com.report.system.entities.Products;
import com.report.system.entities.Shippers;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
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
    
    private CategoriesDao sh;
//    private ShippersDao sh;
//    
//    public ShippersControl() throws ClassNotFoundException {
//        super();
//        Connector cnx = new Connector();
//        sh = new ShippersDao(cnx);
//    }

    @PostConstruct
    public void init() {
        listShip = new ArrayList<Shippers>();
        listCategories = new ArrayList<Categories>();
        listProducts = new ArrayList<Products>();
        sh = new CategoriesDao();
        listShippers();
        listCategories();
        listProducts();
    }
    
    public void listCategories() {
        listCategories = sh.selectAllCategories();
    }

    public void listShippers() {
        listShip = sh.selectAllShippers();
    }
    
    public void listProducts(){
        listProducts = sh.selectAllProducts();
    }

    public List<Shippers> getListShip() {
        return listShip;
    }

    public List<Categories> getListCategories() {
        return listCategories;
    }

    public List<Products> getListProducts() {
        return listProducts;
    }
}
