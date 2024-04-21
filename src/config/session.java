/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author TABANG
 */
public class session {
    public static session instance;
        
        
        private String id;
        private String email;
        private String name;
        private String username;
        private String address;

        private session(){
                
        }

    public static synchronized session getInstance() {
        
        if(instance == null){
            instance = new session();
        }
        return instance;
    }
 
    public static boolean isInstanceEmpty() {
        return instance == null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
}

