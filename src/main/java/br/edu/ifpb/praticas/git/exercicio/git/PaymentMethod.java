/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.git.exercicio.git;

/**
 * Class representing a payment method
 * @author Pedro Arthur
 */
public abstract class PaymentMethod {
    
    private boolean confirmed;
    private int transactionCode;

    /**
     * Constructs a Payment method based on confirmed status and transaction code
     * @param confirmed
     * @param transactionCode 
     */
    public PaymentMethod(boolean confirmed, int transactionCode) {
        this.confirmed = confirmed;
        this.transactionCode = transactionCode;
    }

    /**
     * @return the confirmed
     */
    public boolean isConfirmed() {
        return confirmed;
    }

    /**
     * @param confirmed the confirmed to set
     */
    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    /**
     * @return the transactionCode
     */
    public int getTransactionCode() {
        return transactionCode;
    }

    /**
     * @param transactionCode the transactionCode to set
     */
    public void setTransactionCode(int transactionCode) {
        this.transactionCode = transactionCode;
    }

    @Override
    public String toString() {
        return "PaymentMethod{" + "confirmed=" + confirmed + ", transactionCode=" + transactionCode + '}';
    } 
}
