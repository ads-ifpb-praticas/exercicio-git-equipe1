/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.edu.br.praticas.classes;

/**
 *
 * @author claudio
 */
public class SaleItem {
    private int quantity;

    public SaleItem() {
    }

    public SaleItem(int quantity) {
        this.quantity = quantity;
    }    
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }        
}