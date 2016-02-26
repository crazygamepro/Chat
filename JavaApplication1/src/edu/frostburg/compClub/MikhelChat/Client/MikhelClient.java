/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.frostburg.compClub.MikhelChat.Client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mplenty0
 */
public class MikhelClient {
    Socket client;
    Scanner scan;
    public MikhelClient(){
        try {
            client = new Socket("localhost", 5000);
        } catch (IOException ex) {
            Logger.getLogger(MikhelClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]){
        MikhelClient mClient = new MikhelClient();
        mClient.go();
        
    }
    
    public void go(){
        try {
            PrintWriter pw = new PrintWriter(client.getOutputStream(),true);
            scan = new Scanner(client.getInputStream());
            System.out.println()
//            client.close();
        } catch (IOException ex) {
            Logger.getLogger(MikhelClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
