/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author Ulion Pardede
 */

import java.util.List;
import daos.UserDao;
import models.CRUD;
import models.User;

public class UserController {
    private UserDao dao = new UserDao();
    
    private List<User> getUser(){
        return dao.getUser();
    }
}
