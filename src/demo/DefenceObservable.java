/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class DefenceObservable {
    
    private ArrayList<DefenceObserver> obList;

    public DefenceObservable() {
        obList=new ArrayList<>();
    }
    
    public void addObserver(DefenceObserver ob){
    obList.add(ob);
    }
    
    public void sendMessages(String msg){
        for (DefenceObserver list : obList) {
            list.sendMessage(msg);
        }
    }
    
    public void setBox(String msg){
        
        for (DefenceObserver list : obList) {
            list.areaCleared(msg);
        }
    
    }
    
    public void setValue(int value){
        
        for (DefenceObserver list : obList) {
            list.update(value);
        }
    
    }

    
    
    
    
}
