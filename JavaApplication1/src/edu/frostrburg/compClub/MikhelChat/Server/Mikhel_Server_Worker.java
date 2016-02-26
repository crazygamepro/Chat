/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.frostrburg.compClub.MikhelChat.Server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author mplenty0
 */
public class Mikhel_Server_Worker implements Runnable{

    @Override
    public void run() {
        System.out.println("worker running");
        try {
            PrintWriter print = new PrintWriter(workSock.getOutputStream());
            print.println("Hello World");
        } catch (IOException ex) {
            Logger.getLogger(Mikhel_Server_Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        Socket workSock;
        
    public Mikhel_Server_Worker(Socket acceptClient){
        workSock = acceptClient;
        
    }
    
}
