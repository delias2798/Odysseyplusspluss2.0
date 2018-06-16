package odyssey;

import java.io.IOException;

/**
 *
 * @author josek
 */
public class Odyssey {

    /** This method is mine
     * 
     * 
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       
        Login log = new Login();
        log.setResizable(false); 
        log.setLocationRelativeTo(null);
        log.setVisible(true);
         /*
        Interface inf = new Interface();
        inf.setResizable(false); 
        inf.setLocationRelativeTo(null);
        inf.setVisible(true);
       */
        /*
        SingIn singIn = new SingIn();
        singIn.setVisible(true);
*/
    }    
}
