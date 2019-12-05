/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.report.system.dao;

import com.report.system.entities.Categories;
import com.report.system.entities.Products;
import com.report.system.entities.Shippers;
import java.util.ArrayList;
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

    
    public List<Categories> selectAllCategories(){
        List<Categories> list = new ArrayList<Categories>();
        try{
            list = em.createNamedQuery("Categories.findAll").getResultList();
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    
    public List<Shippers> selectAllShippers(){
        List<Shippers> list = new ArrayList<Shippers>();
        try{
            list = em.createNamedQuery("Shippers.findAll").getResultList();
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    
    public List<Products> selectAllProducts(){
        List<Products> list = new ArrayList<Products>();
        try{
            System.out.println("********************DAO list prod up******************************");
            list = em.createNamedQuery("Products.findAll").getResultList();
            System.out.println("List size " + list.size());
            System.out.println("********************DAO list prod down****************************");
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
