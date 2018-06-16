package odyssey;

import XMLconvert.JAXBObjectToXml;
import XMLconvert.User;
import javax.swing.JOptionPane;

/**
 * @author josek
 */
public class UpdateUser extends javax.swing.JFrame {

    String genre;
    static String FRIEND_ADD = "";

    /**
     * Creates new form UpdateUser
     */
    public UpdateUser() {
        initComponents();
        setDefaultCloseOperation(MetadataMusic.DISPOSE_ON_CLOSE);

        String myU = Interface.myUserName.getText();
        jTextUserName1.setText(myU);

        System.out.println("USER: " + myU);

        User user_Update = new User();
        user_Update.setUsername(myU);
        user_Update.setTag("NeedUser");

        JAXBObjectToXml xmlUpdate = new JAXBObjectToXml();

        String xml_string = xmlUpdate.ConvertToXML(user_Update, User.class);

        connect_Server cn = new connect_Server();
        String resUpdate = cn.connect(xml_string);

        System.out.println("1: " + resUpdate);

        User userServerUpdate;
        userServerUpdate = new User();
        userServerUpdate = xmlUpdate.ConvertToUser(resUpdate);          //Pasar de xml a string

        System.out.println("2: " + userServerUpdate);

        jTextAge.setText(userServerUpdate.getAge());
        jTextLastName.setText(userServerUpdate.getLastname());
        jTextPassword.setText(userServerUpdate.getPass());
        jTextName.setText(userServerUpdate.getName());
        
        String genres = userServerUpdate.getLike();
        
        String[] genresSpace = genres.split(" ");
        
        for (int ind1 =0; ind1 < genresSpace.length;ind1++){
            
            switch (genresSpace[ind1]) {
                case "1":
                    rock.setSelected(true);
                    break;
                case "2":
                    hiphop.setSelected(true);
                    break;
                case "3":
                    rockroll.setSelected(true);
                    break;
                case "4":
                    balada.setSelected(true);
                    break;
                case "5":
                    pop.setSelected(true);
                    break;
                case "6":
                    reggae.setSelected(true);
                    break;
                case "7":
                    rap.setSelected(true);
                    break;
                case "8":
                    banda.setSelected(true);
                    break;
                case "9":
                    electro.setSelected(true);
                    break;
                case "10":
                    bachata.setSelected(true);
                    break;
                case "11":
                    trashmetal.setSelected(true);
                    break;
                case "12":
                    dance.setSelected(true);
                    break;
                case "13":
                    salsa.setSelected(true);
                    break;
                case "14":
                    ska.setSelected(true);
                    break;
                case "15":
                    jazz.setSelected(true);
                    break;
                case "16":
                    punk.setSelected(true);
                    break;
                default:
                    System.err.println("Mala divion del string/ genero no existente");
                    break;
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pop = new javax.swing.JCheckBox();
        electro = new javax.swing.JCheckBox();
        hiphop = new javax.swing.JCheckBox();
        reggae = new javax.swing.JCheckBox();
        rockroll = new javax.swing.JCheckBox();
        bachata = new javax.swing.JCheckBox();
        rap = new javax.swing.JCheckBox();
        trashmetal = new javax.swing.JCheckBox();
        balada = new javax.swing.JCheckBox();
        passWord = new javax.swing.JLabel();
        banda = new javax.swing.JCheckBox();
        salsa = new javax.swing.JCheckBox();
        dance = new javax.swing.JCheckBox();
        jazz = new javax.swing.JCheckBox();
        ska = new javax.swing.JCheckBox();
        jTextPassword = new javax.swing.JTextField();
        punk = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        buttonUpdate_User = new javax.swing.JButton();
        rock = new javax.swing.JCheckBox();
        userName = new javax.swing.JLabel();
        fullName = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        jTextUserName1 = new javax.swing.JTextField();
        jTextName = new javax.swing.JTextField();
        jTextAge = new javax.swing.JTextField();
        passWord1 = new javax.swing.JLabel();
        fullName1 = new javax.swing.JLabel();
        jTextLastName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setFocusable(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pop.setBackground(new java.awt.Color(102, 102, 102));
        pop.setText("Pop");
        jPanel1.add(pop, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 139, -1, -1));

        electro.setBackground(new java.awt.Color(102, 102, 102));
        electro.setText("Electroc");
        jPanel1.add(electro, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 139, -1, -1));

        hiphop.setBackground(new java.awt.Color(102, 102, 102));
        hiphop.setText("Hip-Hop");
        jPanel1.add(hiphop, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 162, -1, -1));

        reggae.setBackground(new java.awt.Color(102, 102, 102));
        reggae.setText("Reggae");
        jPanel1.add(reggae, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 162, -1, -1));

        rockroll.setBackground(new java.awt.Color(102, 102, 102));
        rockroll.setText("Rock&Roll");
        jPanel1.add(rockroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 189, -1, -1));

        bachata.setBackground(new java.awt.Color(102, 102, 102));
        bachata.setText("Bachata");
        jPanel1.add(bachata, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 162, -1, -1));

        rap.setBackground(new java.awt.Color(102, 102, 102));
        rap.setText("Rap");
        jPanel1.add(rap, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 189, -1, -1));

        trashmetal.setBackground(new java.awt.Color(102, 102, 102));
        trashmetal.setText("Trash Metal");
        jPanel1.add(trashmetal, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 189, -1, -1));

        balada.setBackground(new java.awt.Color(102, 102, 102));
        balada.setText("Balada");
        jPanel1.add(balada, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 212, -1, -1));

        passWord.setText("Password:");
        jPanel1.add(passWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 253, -1, -1));

        banda.setBackground(new java.awt.Color(102, 102, 102));
        banda.setText("Banda");
        jPanel1.add(banda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 212, -1, -1));

        salsa.setBackground(new java.awt.Color(102, 102, 102));
        salsa.setText("Salsa");
        jPanel1.add(salsa, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 139, -1, -1));

        dance.setBackground(new java.awt.Color(102, 102, 102));
        dance.setText("Dance");
        jPanel1.add(dance, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 212, -1, -1));

        jazz.setBackground(new java.awt.Color(102, 102, 102));
        jazz.setText("Jazz");
        jPanel1.add(jazz, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 189, -1, -1));

        ska.setBackground(new java.awt.Color(102, 102, 102));
        ska.setText("Ska");
        jPanel1.add(ska, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 162, -1, -1));
        jPanel1.add(jTextPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 274, 362, -1));

        punk.setBackground(new java.awt.Color(102, 102, 102));
        punk.setText("Punk");
        jPanel1.add(punk, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 212, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/josek/Escritorio/imagenes/update.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        buttonUpdate_User.setText("Update");
        buttonUpdate_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdate_UserActionPerformed(evt);
            }
        });
        jPanel1.add(buttonUpdate_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 311, 123, -1));

        rock.setBackground(new java.awt.Color(102, 102, 102));
        rock.setText("Rock");
        jPanel1.add(rock, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 139, -1, -1));

        userName.setText("User Name: ");
        jPanel1.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        fullName.setText("Name:");
        jPanel1.add(fullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 58, -1, -1));

        age.setText("Age:");
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 12, -1, -1));

        jTextUserName1.setEditable(false);
        jTextUserName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextUserName1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextUserName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 33, 171, -1));
        jPanel1.add(jTextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 79, 171, -1));
        jPanel1.add(jTextAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 33, 149, -1));

        passWord1.setText("Genre: ");
        jPanel1.add(passWord1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 116, -1, -1));

        fullName1.setText("Last Name:");
        jPanel1.add(fullName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 58, -1, -1));
        jPanel1.add(jTextLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 79, 149, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método para actualizar datos del usuario
     * @param evt 
     */
    private void buttonUpdate_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdate_UserActionPerformed
        String userNamee = this.jTextUserName1.getText();
        String name = this.jTextName.getText();
        String lastName = this.jTextLastName.getText();

        String ageUser = this.jTextAge.getText();
        String password = this.jTextPassword.getText();
        if (userNamee.trim().isEmpty() || name.trim().isEmpty() || ageUser.trim().isEmpty() || password.trim().isEmpty() || lastName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error: Empty Fields : ", "Sing In", 1);
        } else {
            genre = "";
            if (rock.isSelected()) {
                genre += "1 ";
            }
            if (hiphop.isSelected()) {
                genre += "2 ";
            }
            if (rockroll.isSelected()) {
                genre += "3 ";
            }
            if (balada.isSelected()) {
                genre += "4 ";
            }
            if (pop.isSelected()) {
                genre += "5 ";
            }
            if (reggae.isSelected()) {
                genre += "6 ";
            }
            if (rap.isSelected()) {
                genre += "7 ";
            }
            if (banda.isSelected()) {
                genre += "8 ";
            }
            if (electro.isSelected()) {
                genre += "9 ";
            }
            if (bachata.isSelected()) {
                genre += "10 ";
            }
            if (trashmetal.isSelected()) {
                genre += "11 ";
            }
            if (dance.isSelected()) {
                genre += "12 ";
            }
            if (salsa.isSelected()) {
                genre += "13 ";
            }
            if (ska.isSelected()) {
                genre += "14 ";
            }
            if (jazz.isSelected()) {
                genre += "15 ";
            }
            if (punk.isSelected()) {
                genre += "16 ";
            }
            String friends = FRIEND_ADD;

            JAXBObjectToXml xml = new JAXBObjectToXml();

            User user = new User();

            user.setUsername(userNamee);
            user.setName(name);
            user.setAge(ageUser);
            user.setLike(genre);
            user.setPass(password);
            user.setLastname(lastName);

            user.setFriends(friends);
            user.setTag("UpdateUser");

            String xml_string = xml.ConvertToXML(user, User.class);

            connect_Server s = new connect_Server();
            String res = s.connect(xml_string);
            System.out.println("SingIn> " + res);

            if (res.equals("TRUE")) {
                JOptionPane.showMessageDialog(this, "Successfully Update", "Update", 1);
            } else {
                JOptionPane.showMessageDialog(this, "Error: Update miss", "Update", 3);
            }
            /*
            User user2 = new User();
            user2 = xml.ConvertToUser(xml_string);          //Pasar de xml a string
             */
        }
    }//GEN-LAST:event_buttonUpdate_UserActionPerformed

    /**
     * Obtener texto - username
     * @param evt 
     */
    private void jTextUserName1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextUserName1KeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextUserName1KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JCheckBox bachata;
    private javax.swing.JCheckBox balada;
    private javax.swing.JCheckBox banda;
    private javax.swing.JButton buttonUpdate_User;
    private javax.swing.JCheckBox dance;
    private javax.swing.JCheckBox electro;
    private javax.swing.JLabel fullName;
    private javax.swing.JLabel fullName1;
    private javax.swing.JCheckBox hiphop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextAge;
    private javax.swing.JTextField jTextLastName;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextPassword;
    public static javax.swing.JTextField jTextUserName1;
    private javax.swing.JCheckBox jazz;
    private javax.swing.JLabel passWord;
    private javax.swing.JLabel passWord1;
    private javax.swing.JCheckBox pop;
    private javax.swing.JCheckBox punk;
    private javax.swing.JCheckBox rap;
    private javax.swing.JCheckBox reggae;
    private javax.swing.JCheckBox rock;
    private javax.swing.JCheckBox rockroll;
    private javax.swing.JCheckBox salsa;
    private javax.swing.JCheckBox ska;
    private javax.swing.JCheckBox trashmetal;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
