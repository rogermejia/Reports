/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.report.system.dao;

import com.report.system.connection.Connector;
import com.report.system.entities.Categories;
import com.report.system.entities.Products;
import com.report.system.entities.Shippers;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rogelio.mejia
 */
public class ShippersDao {

    Connector cnx;

    public ShippersDao(Connector cnx) {
        this.cnx = cnx;
    }

    public List<Shippers> selectAllShippers() {
        List<Shippers> list = new ArrayList<Shippers>();
        String sql = "SELECT * FROM shippers";
        try {
            Statement st = cnx.connect().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Shippers ship = new Shippers();
                ship.setShipperID(rs.getInt("ShipperID"));
                ship.setCompanyName(rs.getString("CompanyName"));
                ship.setPhone(rs.getString("Phone"));
                list.add(ship);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Categories> selectAllCategories() {
        List<Categories> list = new ArrayList<Categories>();
        String sql = "SELECT * FROM categories";
        try {
            Statement st = cnx.connect().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Categories obj = new Categories();
                obj.setCategoryID(rs.getInt("CategoryID"));
                obj.setCategoryName(rs.getString("CategoryName"));
                obj.setDescription(rs.getString("Description"));
                list.add(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

//    public List<Products> selectAllProducts() {
//        List<Products> list = new ArrayList<Products>();
//        String sql = "SELECT * FROM products";
//        try {
//            Statement st = cnx.connect().createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            while (rs.next()) {
//                Products obj = new Products();
//                obj.setProductID(rs.getInt("ProductID"));
//                obj.setProductName(rs.getString("ProductName"));
//                obj.setCategoryID(rs.getObject("CategoryID"), Categories.class);
//                obj.setSupplierID(rs.getInt("SupplierID"));
//                obj.setQuantityPerUnit(rs.getString("QuantityPerUnit"));
//                obj.setDiscontinued(rs.getBoolean("Discontinued"));
//                list.add(obj);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
}
