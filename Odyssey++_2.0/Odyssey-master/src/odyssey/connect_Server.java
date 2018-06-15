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
    
    Socket loginCliente;
    int puerto = 8888;
    String ip = "192.168.1.147";
    BufferedReader entrada;
    PrintStream salida;
    

    public String connect(String msg){
        try {
            loginCliente = new Socket(ip, puerto);
            entrada = new BufferedReader(new InputStreamReader(loginCliente.getInputStream()));
            salida = new PrintStream(loginCliente.getOutputStream());

            salida.println(msg);           //Envio información al servidor
            String msj = entrada.readLine();        //recibe datos del server
            return msj;

        } catch (IOException e) {
            System.out.println("Server Disconnected :( ");
        }
        return "Error Server";
    }


 
    
    
}
