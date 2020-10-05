/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author minho
 */
public class AccountService implements Serializable{
    
    private String[] userPool = {"adam", "betty"};
    private String[] passwordPool = {"password"};
    private User user;
    
    public AccountService(String n, String p){
        this.user = new User(n, p);
    }
    
    public User login() {
        
        String name = user.getName();
        System.out.println(name);
        String pass = user.getPassword();
        System.out.println(pass);
        
        for(int i=0; i<userPool.length; i++) {
            if(userPool[i].equals(name)) {
                if(passwordPool[0].equals(pass)) {
                    return this.user;
                    }
                }
            }
        
        return null;
    }
    
    public User getUser() {
        return this.user;
    }
}
