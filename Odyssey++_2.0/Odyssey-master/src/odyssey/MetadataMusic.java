/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odyssey;

import XMLconvert.JAXBObjectToXml;
import XMLconvert.Track;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static odyssey.Interface.myUserName;

/**
 * Ventana para gestión de la metada de musica
 *
 * @author josek
 */
public class MetadataMusic extends javax.swing.JFrame {

    String myU = "";
    String myMusic;

    DefaultListModel din = new DefaultListModel();

    /**
     * Creates new form Metadata
     */
    public MetadataMusic() {
        initComponents();
        myU = Interface.myUserName.getText();
        jName.setText(myU);
        jName.setVisible(false);

        updateListM(myU);

        //jComboBoxGenre.setSelectedIndex(7);
        setDefaultCloseOperation(MetadataMusic.DISPOSE_ON_CLOSE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        j_Artist = new javax.swing.JTextField();
        j_TEXT = new javax.swing.JTextField();
        j_Year = new javax.swing.JTextField();
        Select = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListMusic = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jB_Change1 = new javax.swing.JButton();
        j_Album = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxGenre = new javax.swing.JComboBox<>();
        jName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Genre :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        jLabel2.setText("Artist :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel3.setText("Album :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 73, -1, -1));

        jLabel4.setText("Year :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 137, -1, -1));

        j_Artist.setEditable(false);
        jPanel1.add(j_Artist, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 41, 210, -1));

        j_TEXT.setEditable(false);
        jPanel1.add(j_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 400, 110));

        j_Year.setEditable(false);
        jPanel1.add(j_Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 164, 219, -1));

        Select.setText("Select");
        Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectActionPerformed(evt);
            }
        });
        jPanel1.add(Select, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 243, 225, -1));

        jListMusic.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2", "3", "4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListMusic);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 33, 225, 198));

        jLabel5.setText("Music List:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jB_Change1.setText("Change ");
        jB_Change1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Change1ActionPerformed(evt);
            }
        });
        jPanel1.add(jB_Change1, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 221, 219, 47));

        j_Album.setEditable(false);
        jPanel1.add(j_Album, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 100, 219, -1));

        jLabel6.setText("Letter :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("/home/josek/Escritorio/imagenes/mus.png")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, -1, -1));

        jComboBoxGenre.setMaximumRowCount(5);
        jComboBoxGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Rock", "2 Hip-Hop", "3 Rock&Roll", "4 Balada", "5 Pop", "6 Reggae", "7 Rap", "8 Banda", "9 Electro", "10 Bachata", "11 TrashMetal", "12 Dance", "13 Salsa", "14 Ska", "15 Jazz", "16 Punk" }));
        jComboBoxGenre.setEnabled(false);
        jPanel1.add(jComboBoxGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 200, -1));

        jName.setText("jLabel8");
        jPanel1.add(jName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método para seleccionar lo escrito por el usuario
     *
     * @param evt
     */
    private void SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectActionPerformed

        if (!jListMusic.isSelectionEmpty()) {
            myMusic = jListMusic.getSelectedValue();
            System.out.println(">" + myMusic);
            j_Artist.setEditable(true);
            j_Album.setEditable(true);
            j_TEXT.setEditable(true);
            j_Year.setEditable(true);
            jComboBoxGenre.setEnabled(true);

            connect_Server cUpMus = new connect_Server();

            Track t = new Track();
            t.setUsername(myU);
            t.setTitle(myMusic);
            t.setTag("NeedTrack");

            JAXBObjectToXml xml_UpMus = new JAXBObjectToXml();

            String b = xml_UpMus.ConvertToXML(t, Track.class);

            String a = cUpMus.connect(b);

            t = xml_UpMus.ConvertToTrack(a);

            j_Artist.setText(t.getArtist());
            j_Album.setText(t.getAlbum());
            j_TEXT.setText(t.getLetter());
            j_Year.setText(t.getYear());

            int result = Integer.parseInt(t.getGenre());

            jComboBoxGenre.setSelectedIndex(result - 1);

        }

        //jComboBoxGenre.setSelectedIndex(7);

    }//GEN-LAST:event_SelectActionPerformed

    /**
     * Actualiza la lista de musica
     *
     * @param na
     */
    public void updateListM(String na) {
        connect_Server cUpMus = new connect_Server();

        Track t = new Track();
        t.setUsername(na);
        t.setTag("NeedAllTracks");

        JAXBObjectToXml xml_UpMus = new JAXBObjectToXml();

        String b = xml_UpMus.ConvertToXML(t, Track.class);

        String a = cUpMus.connect(b);

        System.out.println("Edd: " + a);

        ListTrack(a);
    }

    /**
     * Organiza la lista de pistas/canciones
     *
     * @param xml_string
     */
    public void ListTrack(String xml_string) {
        din.clear();

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

                din.addElement(track.getTitle());
                System.out.println(track.getTitle());
            }
        }

        jListMusic.setModel(din);
        //din.clear();

    }

    /**
     * Acción de cambio de metada
     *
     * @param evt
     */
    private void jB_Change1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Change1ActionPerformed
        // TODO add your handling code here:
        String username, art, alb, year, lett, genr;
        username = myU;

        art = j_Artist.getText();
        alb = j_Album.getText();
        year = j_Year.getText();
        lett = j_TEXT.getText();
        genr = jComboBoxGenre.getSelectedItem().toString();

        String[] myNum = genr.split(" ");
        System.out.println("Genero seleccionado : " + myNum[0]);

        connect_Server cUpMus = new connect_Server();

        Track t = new Track();
        t.setUsername(myU);
        t.setAlbum(alb);
        t.setArtist(art);
        t.setLetter(lett);
        t.setYear(year);
        t.setGenre(myNum[0]);
        t.setTitle(myMusic);

        t.setTag("UpdateTrack");

        JAXBObjectToXml xml_UpMus = new JAXBObjectToXml();

        String b = xml_UpMus.ConvertToXML(t, Track.class);

        String a = cUpMus.connect(b);

        System.out.println("Edd: " + a);

        if (a.equals("TRUE")) {
            JOptionPane.showMessageDialog(this, "Update succesfull: ", "MetadataMusic", 1);
        }else{
            JOptionPane.showMessageDialog(this, "Error Update ", "MetadataMusic", 1);
        }


    }//GEN-LAST:event_jB_Change1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MetadataMusic().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Select;
    private javax.swing.JButton jB_Change1;
    private javax.swing.JComboBox<String> jComboBoxGenre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jListMusic;
    public static javax.swing.JLabel jName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField j_Album;
    public static javax.swing.JTextField j_Artist;
    public static javax.swing.JTextField j_TEXT;
    public static javax.swing.JTextField j_Year;
    // End of variables declaration//GEN-END:variables
}
