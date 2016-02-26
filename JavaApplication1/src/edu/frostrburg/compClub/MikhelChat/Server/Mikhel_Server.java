/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.frostrburg.compClub.MikhelChat.Server;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mplenty0
 */
public class Mikhel_Server {
    ServerSocket sock;
    
    public Mikhel_Server(int portNum) throws IOException{
        sock = new ServerSocket(portNum);
        
    }
    public static void main(String[] args){
        try {
            Mikhel_Server mServer = new Mikhel_Server(5000);
            mServer.go();
        } catch (IOException ex) {
            Logger.getLogger(Mikhel_Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
            
    public void go(){
        //TODO: infinite loop
        while(true){
            Socket client;
            try {
                client = sock.accept();
                System.out.println("Client Connected");
                Thread th = new Thread(new Mikhel_Server_Worker(client));
                th.start();
            } catch (IOException ex) {
                Logger.getLogger(Mikhel_Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
