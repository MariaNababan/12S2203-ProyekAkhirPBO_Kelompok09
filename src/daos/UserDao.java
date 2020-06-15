/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.User;

/**
 *
 * @author toto
 */
public class UserDao {
    
    public List<User> getUser(){
        List<User> userlogin = new ArrayList<User>();
        String sql = "select * from user where 'username' =?";
        try {
            if (koneksi.bukaKoneksi() == null) {
                return null;
            } else {
                PreparedStatement statement = koneksi.bukaKoneksi().prepareStatement(sql);
                ResultSet rs = statement.executeQuery();
                while (rs.next()) {
                    User usr = new User(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                    userlogin.add(usr);
                }
                statement.close();
            }
        } catch (Exception e) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, e);
        }
        return userlogin;
    }
}
