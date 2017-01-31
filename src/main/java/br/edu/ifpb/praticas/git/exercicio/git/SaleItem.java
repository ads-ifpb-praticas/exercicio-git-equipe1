/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.git.exercicio.git;

/**
 * Class representing a SaleItem
 * @author Pedro Arthur
 */
public class SaleItem {
    
    private int quantity;

    /**
     * Constructs a SaleItem based on quantity
     * @param quantity 
     */
    public SaleItem(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "SaleItem{" + "quantity=" + quantity + '}';
    }
}
