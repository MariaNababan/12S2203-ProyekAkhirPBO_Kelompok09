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
public class User {
    private String TelephoneNum;
    private String email;
    private String vaccount;
    private String saldo;
    private String name;
    
    public User(String TelephoneNum, String email, String vaccount, String saldo, String name){
        this.TelephoneNum = TelephoneNum;
        this.email = email;
        this.vaccount = vaccount;
        this.saldo = saldo;
        this.name = name;
    }
    
}
