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
public class Journal extends Assignment implements Serializable  {
    
    private String Id;
    
    public Journal(String Assign_Type, String DoSub, Integer Marks) {
        super(Assign_Type, DoSub, Marks);
        this.Id = Id;
     }

    @Override
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    @Override
    public String toString() {
        return " Type: " + super.getAssign_Type() + " DoSub: " + super.getDoSub() + " Marks: " + super.getMarks() +  "Student Id: " + super.getId();
    } 
    
}
