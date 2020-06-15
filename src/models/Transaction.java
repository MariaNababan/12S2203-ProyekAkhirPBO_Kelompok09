/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Maria
 */
public class Transaction {
    private String ID;
    private String type;
    private String senderTN;
    private String receiverTN;
    private String vaccountpay;
    
    public Transaction(String ID, String type, String senderTN, String receiverTN, String vaccountpay){
        this.ID = ID;
        this.type = type;
        this.senderTN = senderTN;
        this.receiverTN = receiverTN;
        this.vaccountpay = vaccountpay;
    }
    
}
