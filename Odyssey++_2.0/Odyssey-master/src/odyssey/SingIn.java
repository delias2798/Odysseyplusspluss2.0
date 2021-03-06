package odyssey;

import XMLconvert.JAXBObjectToXml;
import XMLconvert.User;
import javax.swing.JOptionPane;

/**
 * @author josek
 */
public class SingIn extends javax.swing.JFrame {

    String genre;
    static String FRIEND_ADD = "";

    /**
     * Creates new form SingIn
     */
    public SingIn() {
        initComponents();
        setDefaultCloseOperation(MetadataMusic.DISPOSE_ON_CLOSE);
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
        buttonCreate = new javax.swing.JButton();
        rock = new javax.swing.JCheckBox();
        userName = new javax.swing.JLabel();
        fullName = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        jTextUserName = new javax.swing.JTextField();
        jTextName = new javax.swing.JTextField();
        jTextAge = new javax.swing.JTextField();
        passWord1 = new javax.swing.JLabel();
        fullName1 = new javax.swing.JLabel();
        jTextLastName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setFocusable(false);

        pop.setBackground(new java.awt.Color(102, 102, 102));
        pop.setText("Pop");

        electro.setBackground(new java.awt.Color(102, 102, 102));
        electro.setText("Electroc");

        hiphop.setBackground(new java.awt.Color(102, 102, 102));
        hiphop.setText("Hip-Hop");

        reggae.setBackground(new java.awt.Color(102, 102, 102));
        reggae.setText("Reggae");

        rockroll.setBackground(new java.awt.Color(102, 102, 102));
        rockroll.setText("Rock&Roll");

        bachata.setBackground(new java.awt.Color(102, 102, 102));
        bachata.setText("Bachata");

        rap.setBackground(new java.awt.Color(102, 102, 102));
        rap.setText("Rap");

        trashmetal.setBackground(new java.awt.Color(102, 102, 102));
        trashmetal.setText("Trash Metal");

        balada.setBackground(new java.awt.Color(102, 102, 102));
        balada.setText("Balada");

        passWord.setText("Password:");

        banda.setBackground(new java.awt.Color(102, 102, 102));
        banda.setText("Banda");

        salsa.setBackground(new java.awt.Color(102, 102, 102));
        salsa.setText("Salsa");

        dance.setBackground(new java.awt.Color(102, 102, 102));
        dance.setText("Dance");

        jazz.setBackground(new java.awt.Color(102, 102, 102));
        jazz.setText("Jazz");

        ska.setBackground(new java.awt.Color(102, 102, 102));
        ska.setText("Ska");

        punk.setBackground(new java.awt.Color(102, 102, 102));
        punk.setText("Punk");

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/josek/Escritorio/imagenes/create-new-user-icon-3234.png")); // NOI18N

        buttonCreate.setText("Create");
        buttonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateActionPerformed(evt);
            }
        });

        rock.setBackground(new java.awt.Color(102, 102, 102));
        rock.setText("Rock");

        userName.setText("User Name: ");

        fullName.setText("Name:");

        age.setText("Age:");

        jTextUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextUserNameKeyTyped(evt);
            }
        });

        passWord1.setText("Genre: ");

        fullName1.setText("Last Name:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(passWord)
                        .addComponent(jTextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passWord1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fullName)
                                .addComponent(userName)
                                .addComponent(jTextUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(jTextName))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(age)
                                .addComponent(fullName1)
                                .addComponent(jTextLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                .addComponent(jTextAge)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(hiphop)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(rock)
                                    .addGap(41, 41, 41)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pop)
                                        .addComponent(reggae)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rockroll)
                                        .addComponent(balada))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(banda)
                                        .addComponent(rap))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(trashmetal)
                                .addComponent(bachata)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(electro))
                                .addComponent(dance))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(punk)
                                .addComponent(salsa)
                                .addComponent(ska)
                                .addComponent(jazz)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userName)
                    .addComponent(age))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullName)
                    .addComponent(fullName1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(passWord1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rock)
                    .addComponent(pop)
                    .addComponent(electro)
                    .addComponent(salsa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hiphop)
                    .addComponent(reggae)
                    .addComponent(bachata)
                    .addComponent(ska))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rockroll)
                    .addComponent(rap)
                    .addComponent(trashmetal)
                    .addComponent(jazz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balada)
                    .addComponent(banda)
                    .addComponent(dance)
                    .addComponent(punk))
                .addGap(18, 18, 18)
                .addComponent(passWord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonCreate)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 521, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método para envio de datos/información para crear un usuario
     * @param evt 
     */
    private void buttonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateActionPerformed

        String userNamee = this.jTextUserName.getText();
        String name = this.jTextName.getText();
        String lastName = this.jTextLastName.getText();

        String ageUser = this.jTextAge.getText();
        String password = this.jTextPassword.getText();
        if (userNamee.trim().isEmpty() || name.trim().isEmpty() || ageUser.trim().isEmpty() || password.trim().isEmpty() || lastName.trim().isEmpty() ) {
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
            user.setTag("AddUser");

            String xml_string = xml.ConvertToXML(user, User.class);

            connect_Server s = new connect_Server();
            String res = s.connect(xml_string);
            System.out.println("SingIn> " + res);

            if (res.equals("TRUE")) {
                JOptionPane.showMessageDialog(this, "Welcome to Odyssey++2\nSuccessfully registered user", "Sing In", 1);
            } else {
                JOptionPane.showMessageDialog(this, "Error: Invalid username", "Sing In", 2);
            }
            /*
            User user2 = new User();
            user2 = xml.ConvertToUser(xml_string);          //Pasar de xml a string
             */
        }

    }//GEN-LAST:event_buttonCreateActionPerformed

    /**
     * Método para obtener texto(username)
     * @param evt 
     */
    private void jTextUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextUserNameKeyTyped
            
    }//GEN-LAST:event_jTextUserNameKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new SingIn().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JCheckBox bachata;
    private javax.swing.JCheckBox balada;
    private javax.swing.JCheckBox banda;
    private javax.swing.JButton buttonCreate;
    private javax.swing.JCheckBox dance;
    private javax.swing.JCheckBox electro;
    private javax.swing.JLabel fullName;
    private javax.swing.JLabel fullName1;
    private javax.swing.JCheckBox hiphop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextAge;
    private javax.swing.JTextField jTextLastName;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextPassword;
    private javax.swing.JTextField jTextUserName;
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
