/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.git.exercicio.git;

import java.math.BigDecimal;

/**
 * Represents a Product
 * @author Pedro Arthur
 */
public class Product {
    
    private String productName;
    private int code;
    private BigDecimal value;

    
    /**
     * Cronstructs a new Product
     * @param productName
     * @param code
     * @param value 
     */
    public Product(String productName, int code, BigDecimal value) {
        this.productName = productName;
        this.code = code;
        this.value = value;
    }  

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the value
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return "Product{" + "productName=" + getProductName() + ", code=" + getCode() + ", value=" + getValue() + '}';
    }
}
