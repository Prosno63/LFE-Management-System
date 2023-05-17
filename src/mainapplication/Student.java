/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainapplication;

import java.io.Serializable;

/**
 *
 * @author LENEVO
 */
public class Student extends User implements Serializable {
    String Schoolname;

    public Student(String name, String id, String password, String gender, String type, String venueName, String Schoolname) {
        super(name, id, password, gender, type, venueName, Schoolname);
        this.Schoolname = Schoolname;
    }



   
    
    public String getSchoolname() {
        return Schoolname;
    }

    public void setSchoolname(String Schoolname) {
        this.Schoolname = Schoolname;
    }


    
    @Override
    public String toString() {
        return " Name is: " + super.getName() + " ID: " + super.getId() + " Password: " + super.getPassword() +  " Gender: " + super.getGender() + "Type: " + super.getType() + "Venue: "+ super.getVenueName();
    } 
    
}
