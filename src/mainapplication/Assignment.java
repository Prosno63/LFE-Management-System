/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainapplication;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author LENEVO
 */
public class Assignment implements Serializable{
    
    
    private String Assign_Type;
    private String DoSub ;
    private Integer Marks;
    
    
    
    
    public Assignment(String Assign_Type, String DoSub, Integer Marks) {

        this.Assign_Type = Assign_Type;
        this.DoSub = DoSub;
        this.Marks = Marks;
     }    

    public String getAssign_Type() {
        return Assign_Type;
    }

    public void setAssign_Type(String Assign_Type) {
        this.Assign_Type = Assign_Type;
    }

    public String getDoSub() {
        return DoSub;
    }

    public void setDoSub(String DoSub) {
        this.DoSub = DoSub;
    }

    public Integer getMarks() {
        return Marks;
    }

    public void setMarks(Integer Marks) {
        this.Marks = Marks;
    }
    
    @Override
    public String toString() {
        return " Type is: " + Assign_Type + "DoSub: " + DoSub + " Marks: " + Marks ;
        
    }     

    String getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
