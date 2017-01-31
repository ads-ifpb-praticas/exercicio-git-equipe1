/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.git.exercicio.git;

import java.math.BigDecimal;

/**
 *
 * @author Zilderlan
 */
public class Product {
    private String productName;
    private int code;
    private BigDecimal value;
    
    
    /**
     * 
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
     * 
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }
    /**
     * 
     * @param productName the confirmed to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * 
     * @param code the confirmed to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * 
     * @return the value
     */
    public BigDecimal getValue() {
        return value;
    }
    
    /**
     * 
     * @param value the confirmed to set
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }
    
    
    
}
