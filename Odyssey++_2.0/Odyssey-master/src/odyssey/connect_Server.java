/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odyssey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author josek
 */
public class connect_Server {
    
    Socket socketMSJ,socketBytes;
    int puerto = 8888;
    int puertoStreaming = 8080;
    String ip = "192.168.1.147";
    BufferedReader entradaMSJ,entradaBytes;
    PrintStream salidaMSJ,salidaBytes;
    

    public String connect(String msg){
        try {
            socketMSJ = new Socket(ip, puerto);
            entradaMSJ = new BufferedReader(new InputStreamReader(socketMSJ.getInputStream()));
            salidaMSJ = new PrintStream(socketMSJ.getOutputStream());

            salidaMSJ.println(msg);          
            String msj = entradaMSJ.readLine(); 
            return msj;

        } catch (IOException e) {
            System.out.println("Server Disconnected  ");
        }
        return "Error Server";
    }

  public String connectStreaming(String bytes){ //Streaming
        try {
            socketBytes = new Socket(ip, puertoStreaming);
            entradaBytes = new BufferedReader(new InputStreamReader(socketBytes.getInputStream()));
            salidaBytes = new PrintStream(socketBytes.getOutputStream());

            salidaBytes.println(bytes);           //Envio información al servidor
            String msj = entradaBytes.readLine();        //recibe datos del server
            return msj;

        } catch (IOException e) {
            System.out.println("Server Disconnected ");
        }
        return "Error Server";
    }
 
    
   public String connect2(byte[] bytes){
        try {
            socketBytes = new Socket(ip, puertoStreaming);
            entradaBytes = new BufferedReader(new InputStreamReader(socketBytes.getInputStream()));
            salidaBytes = new PrintStream(socketBytes.getOutputStream());

            
            byte[] b = {1,2,3};
            salidaBytes.println(bytes);           //Envio información al servidor
            //String msj = entradaBytes.readLine();        //recibe datos del server
            System.out.println("Fin");
            return "msj";

        } catch (IOException e) {
            System.out.println("Server Disconnected ");
        }
        return "Error Server";
    }
 
    
    
}
