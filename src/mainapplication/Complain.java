/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainapplication;

/**
 *
 * @author LENEVO
 */
public class Complain {
    
    private String name;
    private String id;
    private String description;
    
    


    public Complain(String name, String id, String description) {
        this.name = name;
        this.id = id;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return " Name is: " + name + " ID: " + id + " \n " +  " Description " + description;
        
    } 
    
}
