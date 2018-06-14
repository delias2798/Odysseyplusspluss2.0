package odyssey;

import XMLconvert.JAXBObjectToXml;
import XMLconvert.User;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author josek
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);

    //
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listMusic = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        addMusic = new javax.swing.JButton();
        playerMusic = new javax.swing.JSlider();
        equalizer = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        musicPlaying = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        sortName = new javax.swing.JButton();
        sortAuthor = new javax.swing.JButton();
        sortAlbum = new javax.swing.JButton();
        sortBy = new javax.swing.JLabel();
        deleteMusic = new javax.swing.JButton();
        choiceMusic = new java.awt.Choice();
        modMetadata = new javax.swing.JButton();
        rateSong = new javax.swing.JButton();
        rate1 = new javax.swing.JRadioButton();
        rate2 = new javax.swing.JRadioButton();
        rate3 = new javax.swing.JRadioButton();
        rate4 = new javax.swing.JRadioButton();
        rate5 = new javax.swing.JRadioButton();
        search = new javax.swing.JLabel();
        searchS = new javax.swing.JButton();
        lab_song = new javax.swing.JLabel();
        S_song = new javax.swing.JTextField();
        lab_artist = new javax.swing.JLabel();
        S_artist = new javax.swing.JTextField();
        lab_album = new javax.swing.JLabel();
        S_album = new javax.swing.JTextField();
        lab_letter = new javax.swing.JLabel();
        S_letter = new javax.swing.JTextField();
        lab_LyricsG = new javax.swing.JLabel();
        Guess = new javax.swing.JButton();
        Evaluate = new javax.swing.JButton();
        letter_User = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        good = new javax.swing.JRadioButton();
        medium = new javax.swing.JRadioButton();
        bad = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));

        listMusic.setViewportView(jList1);

        addMusic.setText("Add Music");
        addMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMusicActionPerformed(evt);
            }
        });

        equalizer.setViewportView(jTextPane1);

        musicPlaying.setViewportView(jTextPane2);

        sortName.setText("Name");
        sortName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortNameActionPerformed(evt);
            }
        });

        sortAuthor.setText("Author");
        sortAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortAuthorActionPerformed(evt);
            }
        });

        sortAlbum.setText("Album");
        sortAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortAlbumActionPerformed(evt);
            }
        });

        sortBy.setText("Sort By:");

        deleteMusic.setText("Delete");
        deleteMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMusicActionPerformed(evt);
            }
        });

        modMetadata.setText("Modify metadata");
        modMetadata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modMetadataActionPerformed(evt);
            }
        });

        rateSong.setText("Rate Song");

        rate1.setText("1");
        rate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rate1ActionPerformed(evt);
            }
        });

        rate2.setText("2");
        rate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rate2ActionPerformed(evt);
            }
        });

        rate3.setText("3");
        rate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rate3ActionPerformed(evt);
            }
        });

        rate4.setText("4");
        rate4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rate4ActionPerformed(evt);
            }
        });

        rate5.setText("5");
        rate5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rate5ActionPerformed(evt);
            }
        });

        search.setText("Search________________________________");

        searchS.setText("Search");
        searchS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSActionPerformed(evt);
            }
        });

        lab_song.setText("Song :");

        lab_artist.setText("Artist :");

        lab_album.setText("Album :");

        lab_letter.setText("Letter :");

        lab_LyricsG.setText("Lyrics guessing______________________");

        Guess.setText("Guess ");

        Evaluate.setText("Evaluate ");
        Evaluate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvaluateActionPerformed(evt);
            }
        });

        letter_User.setViewportView(jTextPane4);

        good.setText("Good");
        good.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goodActionPerformed(evt);
            }
        });

        medium.setText("Medium");
        medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumActionPerformed(evt);
            }
        });

        bad.setText("Bad");
        bad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                badActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listMusic)
                    .addComponent(addMusic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(choiceMusic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(sortName)
                        .addGap(12, 12, 12)
                        .addComponent(sortAuthor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sortAlbum)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rate1)
                        .addGap(18, 18, 18)
                        .addComponent(rate2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rate5)
                        .addGap(10, 10, 10))
                    .addComponent(letter_User)
                    .addComponent(rateSong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sortBy)
                            .addComponent(lab_LyricsG)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deleteMusic)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(rate3)
                                        .addGap(26, 26, 26)
                                        .addComponent(rate4))
                                    .addComponent(modMetadata))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Guess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Evaluate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(good)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(medium)
                        .addGap(35, 35, 35)
                        .addComponent(bad)
                        .addGap(11, 11, 11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(playerMusic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(musicPlaying, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(equalizer, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lab_song, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lab_artist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(S_artist, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(S_song, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lab_letter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6)
                                .addComponent(S_letter, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lab_album, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(S_album, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equalizer, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(search)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lab_song)
                                    .addComponent(S_song, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lab_artist)
                                    .addComponent(S_artist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lab_album)
                                    .addComponent(S_album, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lab_letter)
                                    .addComponent(S_letter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchS)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(musicPlaying, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addMusic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortBy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sortName, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sortAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sortAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(choiceMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteMusic)
                            .addComponent(modMetadata))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rate1)
                            .addComponent(rate2)
                            .addComponent(rate3)
                            .addComponent(rate4)
                            .addComponent(rate5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rateSong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lab_LyricsG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(letter_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Guess)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(good)
                            .addComponent(medium)
                            .addComponent(bad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Evaluate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sortNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortNameActionPerformed
        // TODO add your handling code here:
                    JOptionPane.showMessageDialog(this, "Sort by Name","Odyssey",2);

    }//GEN-LAST:event_sortNameActionPerformed

    private void sortAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortAuthorActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Sort by Author","Odyssey",2);
    }//GEN-LAST:event_sortAuthorActionPerformed

    private void sortAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortAlbumActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Sort by Album","Odyssey",2);
    }//GEN-LAST:event_sortAlbumActionPerformed

    private void addMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMusicActionPerformed
        // TODO add your handling code here:
        DefaultListModel din = new DefaultListModel();

        
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("C:\\home\\josek\\Descargas"));///home/josek/Descargas
        fileChooser.setDialogTitle("Select Mp3");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Mp3 files","mp3"));
        if(fileChooser.showOpenDialog(addMusic)==JFileChooser.APPROVE_OPTION){
            try {                
                File myFile = fileChooser.getSelectedFile();
                String filename = fileChooser.getSelectedFile().getName();
                String filePath = fileChooser.getSelectedFile().getPath();
                
                System.out.println(filename);
                din.addElement(filename);
                jList1.setModel(din);
                
                System.out.println(filePath);
                //try {
                String absolutePath = myFile.getAbsolutePath();
                String filePath1 = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator));
                System.out.println(filePath1);
                // convert file to byte[]
                byte[] bFile = readBytesFromFile(filePath1+filePath);
                
                // save byte[] into a file
                Path path = Paths.get("C:\\home\\josek\\test2.txt");
                Files.write(path, bFile);
                
                System.out.println("Done");
                
                //Print bytes[]
                for (int i = 0; i < bFile.length; i++) {
                    System.out.print((char) bFile[i]);
                }
                
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }  
    }//GEN-LAST:event_addMusicActionPerformed

    private void deleteMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMusicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMusicActionPerformed

    private void modMetadataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modMetadataActionPerformed
        // TODO add your handling code here:
        Metadata metadata = new Metadata();
        metadata.setVisible(true);
    }//GEN-LAST:event_modMetadataActionPerformed

    
    private static byte[] readBytesFromFile(String filePath) {

        FileInputStream fileInputStream = null;
        byte[] bytesArray = null;

        try {

            File file = new File(filePath);
            bytesArray = new byte[(int) file.length()];
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(bytesArray);

        } catch (IOException e) {
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                }
            }

        }

        return bytesArray;

    }
    
    private void searchSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchSActionPerformed

    private void mediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumActionPerformed
        // TODO add your handling code here:
        bad.setSelected(false);
        good.setSelected(false);
    }//GEN-LAST:event_mediumActionPerformed

    private void badActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_badActionPerformed
        // TODO add your handling code here:
        medium.setSelected(false);
        good.setSelected(false);
    }//GEN-LAST:event_badActionPerformed

    private void rate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rate1ActionPerformed
        // TODO add your handling code here:
        rate2.setSelected(false);
        rate3.setSelected(false);
        rate4.setSelected(false);
        rate5.setSelected(false);
    }//GEN-LAST:event_rate1ActionPerformed

    private void rate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rate2ActionPerformed
        // TODO add your handling code here:
        rate1.setSelected(false);
        rate3.setSelected(false);
        rate4.setSelected(false);
        rate5.setSelected(false);
    }//GEN-LAST:event_rate2ActionPerformed

    private void rate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rate3ActionPerformed
        // TODO add your handling code here:
        rate1.setSelected(false);
        rate2.setSelected(false);
        rate4.setSelected(false);
        rate5.setSelected(false);
    }//GEN-LAST:event_rate3ActionPerformed

    private void rate4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rate4ActionPerformed
        // TODO add your handling code here:
        rate1.setSelected(false);
        rate2.setSelected(false);
        rate3.setSelected(false);
        rate5.setSelected(false);
        
    }//GEN-LAST:event_rate4ActionPerformed

    private void rate5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rate5ActionPerformed
        // TODO add your handling code here:
        rate1.setSelected(false);
        rate2.setSelected(false);
        rate3.setSelected(false);
        rate4.setSelected(false);
    }//GEN-LAST:event_rate5ActionPerformed

    private void goodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goodActionPerformed
        // TODO add your handling code here:
        medium.setSelected(false);
        bad.setSelected(false);
    }//GEN-LAST:event_goodActionPerformed

    private void EvaluateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EvaluateActionPerformed
        // TODO add your handling code here:
        if(good.isSelected()){
            
            good.setSelected(false);            
        }else if(medium.isSelected()){
            
            medium.setSelected(false);
        }else if (bad.isSelected()){
            
            bad.setSelected(false);
        }else{
            JOptionPane.showMessageDialog(this, "Please select an option to perform the rating","Evaluate",2);
        }

    }//GEN-LAST:event_EvaluateActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Evaluate;
    private javax.swing.JButton Guess;
    private javax.swing.JTextField S_album;
    private javax.swing.JTextField S_artist;
    private javax.swing.JTextField S_letter;
    private javax.swing.JTextField S_song;
    private javax.swing.JButton addMusic;
    private javax.swing.JRadioButton bad;
    private java.awt.Choice choiceMusic;
    private javax.swing.JButton deleteMusic;
    private javax.swing.JScrollPane equalizer;
    private javax.swing.JRadioButton good;
    private javax.swing.JList<String> jList1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JLabel lab_LyricsG;
    private javax.swing.JLabel lab_album;
    private javax.swing.JLabel lab_artist;
    private javax.swing.JLabel lab_letter;
    private javax.swing.JLabel lab_song;
    private javax.swing.JScrollPane letter_User;
    private javax.swing.JScrollPane listMusic;
    private javax.swing.JRadioButton medium;
    private javax.swing.JButton modMetadata;
    private javax.swing.JScrollPane musicPlaying;
    private javax.swing.JSlider playerMusic;
    private javax.swing.JRadioButton rate1;
    private javax.swing.JRadioButton rate2;
    private javax.swing.JRadioButton rate3;
    private javax.swing.JRadioButton rate4;
    private javax.swing.JRadioButton rate5;
    private javax.swing.JButton rateSong;
    private javax.swing.JLabel search;
    private javax.swing.JButton searchS;
    private javax.swing.JButton sortAlbum;
    private javax.swing.JButton sortAuthor;
    private javax.swing.JLabel sortBy;
    private javax.swing.JButton sortName;
    // End of variables declaration//GEN-END:variables
}