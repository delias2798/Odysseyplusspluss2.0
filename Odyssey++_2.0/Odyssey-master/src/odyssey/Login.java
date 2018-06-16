package odyssey;

import XMLconvert.JAXBObjectToXml;
import XMLconvert.Message;
import XMLconvert.User;
import java.awt.Color;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Ventana de Login
 * @author josek
 */
public final class Login extends javax.swing.JFrame {
    static String mgsCompress = "";

    /**
     * Creates new form Interface
     *
     * @throws java.io.IOException
     */
    public Login() throws IOException {
        initComponents();
        this.getContentPane().setBackground(Color.gray);

        /*
        
        // The input string for this test
final String string = "Hello Worldrld ada sfaf fsdg sdfgdfhdrld ada sfaf fsdg sdfgdfhdrld ada sfaf fsdg sdfgdfhd ada sfaf fsdg sdfgdfhd";

// Check length, in characters
System.out.println(string.length()); // prints "11"

// Check encoded sizes
final byte[] utf8Bytes = string.getBytes("UTF-8");
System.out.println(utf8Bytes.length); // prints "11"

final byte[] utf16Bytes= string.getBytes("UTF-16");
System.out.println(utf16Bytes.length); // prints "24"

final byte[] utf32Bytes = string.getBytes("UTF-32");
System.out.println(utf32Bytes.length); // prints "44"

final byte[] isoBytes = string.getBytes("ISO-8859-1");
System.out.println(isoBytes.length); // prints "11"

final byte[] winBytes = string.getBytes("CP1252");
System.out.println(winBytes.length); // prints "11"
        
         */
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        Login = new javax.swing.JButton();
        SingIn = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Odyssey");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(102, 102, 0));
        setForeground(java.awt.Color.white);
        setResizable(false);

        jLabel1.setText("User Name");

        jLabel2.setText("Password ");

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        SingIn.setText("Sing in");
        SingIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SingInActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("/home/josek/Escritorio/imagenes/aq.png")); // NOI18N
        jLabel3.setAutoscrolls(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                        .addComponent(UserName, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(SingIn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login)
                    .addComponent(SingIn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method get the user name and password of an user
     *
     * @param evt
     */
    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed

        String userName = UserName.getText();

        String password = String.valueOf(Password.getPassword());

        User login = new User();
        JAXBObjectToXml xmlLogin = new JAXBObjectToXml();

        login.setUsername(userName);
        login.setPass(password);
        login.setTag("GoLogin");

        String xml_string = xmlLogin.ConvertToXML(login, User.class);

        // xml_string = finalMgs(xml_string);
        String original = xml_string;

        try {
            byte[] utf8Bytes = original.getBytes("UTF8");
            connect_Server s = new connect_Server();

            String res = s.connect(xml_string);
            //String res = s.connect2(utf8Bytes);
            System.out.println("Login> " + res);
            if (res.equals("TRUE")) {
                this.dispose();
                Interface i = new Interface();
                i.setLocationRelativeTo(null);
                i.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Error: Incorrect username or password", "Sing In", 1);
            }
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_LoginActionPerformed
    /**
     * This method create a new user.
     *
     * @param evt
     */
    private void SingInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SingInActionPerformed
        // TODO add your handling code here:
        SingIn sigIn;
        sigIn = new SingIn();
        sigIn.setVisible(true);
    }//GEN-LAST:event_SingInActionPerformed

    /**
     * Envio de mensaje comprimido
     * @param str
     * @return 
     */
    public String finalMgs(String str) {

        Huffman.compress(str);
        JAXBObjectToXml XML = new JAXBObjectToXml();

        String cMdicc = Huffman.getCodeMSJ();
        String cB = Huffman.getCodeBytes();
        Message msj = new Message();
        msj.setcode01(cB);
        msj.setdictionary(cMdicc);
        msj.setTag("MSJ");
        String xml_mgs = XML.ConvertToXML(msj, Message.class);

        System.out.println("]xml[\n" + xml_mgs);
        return xml_mgs;
    }
    
    /**
     * Obtención de msj comprimido
     * @return 
     */
    public static String getMgsCompress() {
        return mgsCompress;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Login().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton SingIn;
    public static javax.swing.JTextField UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
