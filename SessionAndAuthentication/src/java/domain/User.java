/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author minho
 */
public class User implements Serializable{
    
    private String name;
    private String password;
    
    public User(String n, String p) {
        this.name = n;
        this.password = p;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getPassword(){
        return this.password;
    }
}
