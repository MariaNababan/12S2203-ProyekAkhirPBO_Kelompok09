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
public class UserLoginInfo {
    private String TelephoneNum;
    private String password;
    
    public UserLoginInfo(String TelephoneNum, String password){
        this.TelephoneNum = TelephoneNum;
        this.password = password;
    }
    
}
