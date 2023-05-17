/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainapplication;

import java.io.Serializable;

/**
 *
 * @author LENEVO
 */
public class User implements Serializable{
    
    
    private String name;
    private String id;
    private String password;
    private String gender;
    private String type;
    private String venueName;

     
    @Override
    public String toString() {
        return " Name is: " + name + " ID: " + id + " Password: " + password +  " Type: " + type + " Gender: " + gender + " Venue: " + venueName;
        
    } 
    
    
    public User(String name, String id, String password, String gender, String type, String venueName, String value1) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.gender = gender;
        this.type = type;
        this.venueName = venueName;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }
    
    
    
}
