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
public class ArtWork extends Assignment implements Serializable {
    
    private String TopicName;
    private String GroupNo;
    
    public ArtWork(String Assign_Type, String DoSub, Integer Marks) {
        super(Assign_Type, DoSub, Marks);
        this.TopicName = TopicName;
        this.GroupNo = GroupNo;
    }

    public String getGroupNo() {
        return GroupNo;
    }

    public void setGroupNo(String GroupNo) {
        this.GroupNo = GroupNo;
    }

    public String getTopicName() {
        return TopicName;
    }

    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }
    
    @Override
    public String toString() {
        return " Type: " + super.getAssign_Type() + " DoSub: " + super.getDoSub() + " Marks: " + super.getMarks() +"Topic Name: "+ TopicName + "Group No: " + getGroupNo();
    }    
    
    
}
