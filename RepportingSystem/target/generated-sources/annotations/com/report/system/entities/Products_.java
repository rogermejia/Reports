package com.report.system.entities;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-05T11:49:18")
@StaticMetamodel(Products.class)
public class Products_ { 

    public static volatile SingularAttribute<Products, BigDecimal> unitPrice;
    public static volatile SingularAttribute<Products, Integer> unitsInStock;
    public static volatile SingularAttribute<Products, Integer> reorderLevel;
    public static volatile SingularAttribute<Products, Integer> supplierID;
    public static volatile SingularAttribute<Products, Integer> productID;
    public static volatile SingularAttribute<Products, String> quantityPerUnit;
    public static volatile SingularAttribute<Products, Boolean> discontinued;
    public static volatile SingularAttribute<Products, String> productName;
    public static volatile SingularAttribute<Products, Integer> categoryID;
    public static volatile SingularAttribute<Products, Integer> unitsOnOrder;

}