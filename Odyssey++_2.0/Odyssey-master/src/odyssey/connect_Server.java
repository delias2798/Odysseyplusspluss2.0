package odyssey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * Clase para realizar conexiones con el servidor
 *
 * @author josek
 */
public class connect_Server {

    Socket socketMSJ, socketBytes;
    int puerto = 8888;
    int puertoStreaming = 8080;
    String ip = "192.168.1.147";
    BufferedReader entradaMSJ, entradaBytes;
    PrintStream salidaMSJ, salidaBytes;

    /**
     * Método para conectar el socket
     *
     * @param msg
     * @return
     */
    public String connect(String msg) {
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

    /**
     * Método para realizar streaming
     * @param bytes
     * @return 
     */
    public String connectStreaming(String bytes) { //Streaming
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

    /**
     * Método para conectar el socket por byte[]
     * @param bytes
     * @return 
     */
    public String connect2(byte[] bytes) {
        try {
            socketBytes = new Socket(ip, puertoStreaming);
            entradaBytes = new BufferedReader(new InputStreamReader(socketBytes.getInputStream()));
            salidaBytes = new PrintStream(socketBytes.getOutputStream());

            byte[] b = {1, 2, 3};
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
