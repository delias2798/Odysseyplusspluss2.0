package odyssey;

import java.io.IOException;

/**
 *
 * @author josek
 */
public class Odyssey {

    /** 
     * Inicio del programa
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {      
        Login log = new Login();
        log.setResizable(false); 
        log.setLocationRelativeTo(null);
        log.setVisible(true);
    }    
}
