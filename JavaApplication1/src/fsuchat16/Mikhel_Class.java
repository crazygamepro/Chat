/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fsuchat16;

import java.util.ArrayList;

/**
 *
 * @author SK
 */
public class Mikhel_Class {

    ArrayList<String> sentMsgList;
    ArrayList<String> receivedMsgList;
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mikhel_Class x = new Mikhel_Class();
        
    }
    
    
    public Mikhel_Class(){
        sentMsgList = new ArrayList<String>();
        
    }
        
    public void go(){
        
      System.out.println();
        
    }
    
    public void messageTest(String message){
        receivedMsgList.add(message);
        
        
    }
    
    public void onMessageRecieved(boolean msgReceived){
        int counterMsg = 0;
        
            System.out.println("Message Received");
            counterMsg++;
        
    }
    
    public void onUserQuit(){
        System.out.println("User has quit the server");
    }
    
    public void onUserJoined(){
        System.out.println("User has joined the server");
        
    }
    
}
