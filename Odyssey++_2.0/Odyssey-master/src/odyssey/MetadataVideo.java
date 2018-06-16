package odyssey;

import XMLconvert.JAXBObjectToXml;
import XMLconvert.Track;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static odyssey.MetadataMusic.jName;
import static odyssey.MetadataMusic.j_Album;
import static odyssey.MetadataMusic.j_Artist;
import static odyssey.MetadataMusic.j_TEXT;
import static odyssey.MetadataMusic.j_Year;



/**
 *
 * @author josek
 */
public class MetadataVideo extends javax.swing.JFrame {

    String myU = "";
    String myMusic;

    DefaultListModel dinV = new DefaultListModel();
    
    /**
     * Creates new form MetadataVideo
     */
    public MetadataVideo() {
        initComponents();
        myU = Interface.myUserName.getText();
        jName.setText(myU);
        jName.setVisible(false);

        updateListV(myU);
        
        
        setDefaultCloseOperation(MetadataVideo.DISPOSE_ON_CLOSE);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        j_description = new javax.swing.JTextField();
        Select = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jB_Change1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Description :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        j_description.setEditable(false);
        jPanel1.add(j_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 220, 30));

        Select.setText("Select");
        Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectActionPerformed(evt);
            }
        });
        jPanel1.add(Select, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 243, 225, -1));

        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 33, 225, 198));

        jLabel5.setText("Video List:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jB_Change1.setText("Change ");
        jB_Change1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Change1ActionPerformed(evt);
            }
        });
        jPanel1.add(jB_Change1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 219, 47));

        jLabel7.setIcon(new javax.swing.ImageIcon("/home/josek/Escritorio/imagenes/video.png")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, 100));

        jName.setText("User :");
        jPanel1.add(jName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Actualiza la lista de musica
     *
     * @param na
     */
    public void updateListV(String na) {
        connect_Server cUpMus = new connect_Server();

        Track t = new Track();
        t.setUsername(na);
        t.setTag("NeedAllVideos");

        JAXBObjectToXml xml_UpMus = new JAXBObjectToXml();

        String b = xml_UpMus.ConvertToXML(t, Track.class);

        String a = cUpMus.connect(b);

        System.out.println("Edd: " + a);

        ListVideo(a);
    }

    /**
     * Organiza la lista de pistas/canciones
     *
     * @param xml_string
     */
    public void ListVideo(String xml_string) {
        dinV.clear();

        Track track = new Track();
        String findS = "<track>";
        String findE = "</track>";
        String track_;
        JAXBObjectToXml xml = new JAXBObjectToXml();
        int s;
        int e;

        s = xml_string.indexOf("<list>");
        e = xml_string.indexOf("</list>");
        System.out.println(s + "   " + e);
        if (s > 0) {
            xml_string = xml_string.substring(s + "<list>".length(), e);

            while (xml_string.length() != 0) {
                s = xml_string.indexOf(findS);
                e = xml_string.indexOf(findE);
                track_ = xml_string.substring(s, e + findE.length());

                xml_string = xml_string.substring(e + findE.length(), xml_string.length());

                track = xml.ConvertToTrack(track_);

                dinV.addElement(track.getTitle());
                System.out.println(track.getTitle());
            }
        }

        jList1.setModel(dinV);
        //din.clear();

    }

    
    
    /**
     * Método para obtener lo seleccioando por el usuario
     * @param evt 
     */
    private void SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectActionPerformed
       
        
        if (!jList1.isSelectionEmpty()) {
            myMusic = jList1.getSelectedValue();
            System.out.println(">" + myMusic);
            j_description.setEditable(true);

            connect_Server cUpMus = new connect_Server();

            Track t = new Track();
            t.setUsername(myU);
            t.setTitle(myMusic);
            t.setTag("NeedVideo");

            JAXBObjectToXml xml_UpMus = new JAXBObjectToXml();

            String b = xml_UpMus.ConvertToXML(t, Track.class);

            String a = cUpMus.connect(b);

            t = xml_UpMus.ConvertToTrack(a);

            j_description.setText(t.getLetter());
        }

    }//GEN-LAST:event_SelectActionPerformed

    /**
     * Acción de cambio
     * @param evt 
     */
    private void jB_Change1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Change1ActionPerformed
        // TODO add your handling code here:
        String username, lett;
        username = myU;

        lett = j_description.getText();// j_description.getText();


        connect_Server cUpMus = new connect_Server();

        Track t = new Track();
        t.setUsername(myU);
        t.setLetter(lett);
        t.setTitle(myMusic);

        t.setTag("UpdateVideo");

        JAXBObjectToXml xml_UpMus = new JAXBObjectToXml();

        String b = xml_UpMus.ConvertToXML(t, Track.class);

        String a = cUpMus.connect(b);

        System.out.println("Edd: " + a);

        if (a.equals("TRUE")) {
            JOptionPane.showMessageDialog(this, "Update succesfull: ", "MetadataVideo", 1);
        }else{
            JOptionPane.showMessageDialog(this, "Error Update ", "MetadataVideo", 1);
        }
    }//GEN-LAST:event_jB_Change1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new MetadataVideo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Select;
    private javax.swing.JButton jB_Change1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JLabel jName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField j_description;
    // End of variables declaration//GEN-END:variables
}
