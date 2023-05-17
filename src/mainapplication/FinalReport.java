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
public class FinalReport extends Assignment implements Serializable  {
    
    private String GroupNo;
    private String NoOfPages;
    
    
    public FinalReport(String Assign_Type, String DoSub, Integer Marks) {
        super(Assign_Type, DoSub, Marks);
        this.GroupNo = GroupNo;
        this.NoOfPages = NoOfPages;
        
    }

    public String getGroupNo() {
        return GroupNo;
    }

    public void setGroupNo(String GroupNo) {
        this.GroupNo = GroupNo;
    }

    public String getNoOfPages() {
        return NoOfPages;
    }

    public void setNoOfPages(String NoOfPages) {
        this.NoOfPages = NoOfPages;
    }
    
    @Override
    public String toString() {
        return " Type: " + super.getAssign_Type() + " DoSub: " + super.getDoSub() + " Marks: " + super.getMarks() +  "Student Id: " + super.getId() + "Group Number: " + GroupNo + "NoOfPages: " + NoOfPages;   
    }    
    
}
