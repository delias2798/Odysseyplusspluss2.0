package odyssey;

import XMLconvert.JAXBObjectToXml;
import XMLconvert.Track;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import static odyssey.Login.UserName;
import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.discovery.NativeDiscovery;

/**
 * Ventan principal de uso
 *
 * @author josek
 */
public final class Interface extends javax.swing.JFrame {

    DefaultListModel din = new DefaultListModel();
    String musicMusic, filePath, myU;
    private EmbeddedMediaPlayerComponent mediaPlayerComponent;

    /**
     * Creación de la ventana y su llamado
     */
    public Interface() {
        initComponents();
        myUserName.setVisible(false);
        this.getContentPane().setBackground(Color.gray);
        setDefaultCloseOperation(MetadataMusic.DISPOSE_ON_CLOSE);
        myU = Login.UserName.getText();
        myUserName.setText(myU);

        updateListM(myU);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        listMusic = new javax.swing.JScrollPane();
        jListMusic = new javax.swing.JList<>();
        addMusic = new javax.swing.JButton();
        musicPlaying = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        deleteMusic = new javax.swing.JButton();
        modMetadata = new javax.swing.JButton();
        rateSong = new javax.swing.JButton();
        rateM2 = new javax.swing.JRadioButton();
        rateM3 = new javax.swing.JRadioButton();
        rateM4 = new javax.swing.JRadioButton();
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
        addFriend_Button = new javax.swing.JButton();
        update_User = new javax.swing.JButton();
        myUserName = new javax.swing.JLabel();
        playVideo = new javax.swing.JButton();
        Before = new javax.swing.JButton();
        listMusic2 = new javax.swing.JScrollPane();
        jListVideos = new javax.swing.JList<>();
        addVideo = new javax.swing.JButton();
        deleteVideo = new javax.swing.JButton();
        modVideoMetadata = new javax.swing.JButton();
        rateVideo = new javax.swing.JButton();
        rateM1 = new javax.swing.JRadioButton();
        rateM5 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        ShowMedia = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        rateV2 = new javax.swing.JRadioButton();
        rateV3 = new javax.swing.JRadioButton();
        rateV4 = new javax.swing.JRadioButton();
        rateV1 = new javax.swing.JRadioButton();
        rateV5 = new javax.swing.JRadioButton();
        playMusic = new javax.swing.JButton();
        Stop = new javax.swing.JButton();
        After = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1170, 495));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listMusic.setViewportView(jListMusic);

        getContentPane().add(listMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 264, 107));

        addMusic.setBackground(new java.awt.Color(153, 255, 153));
        addMusic.setText("Add Music");
        addMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMusicActionPerformed(evt);
            }
        });
        getContentPane().add(addMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 264, -1));

        musicPlaying.setViewportView(jTextPane2);

        getContentPane().add(musicPlaying, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 595, 70));

        deleteMusic.setBackground(new java.awt.Color(204, 255, 204));
        deleteMusic.setText("Delete");
        deleteMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMusicActionPerformed(evt);
            }
        });
        getContentPane().add(deleteMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        modMetadata.setBackground(new java.awt.Color(204, 255, 204));
        modMetadata.setText("Modify metadata");
        modMetadata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modMetadataActionPerformed(evt);
            }
        });
        getContentPane().add(modMetadata, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        rateSong.setBackground(new java.awt.Color(204, 255, 204));
        rateSong.setText("Rate Song");
        getContentPane().add(rateSong, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 264, -1));

        rateM2.setBackground(new java.awt.Color(153, 153, 153));
        rateM2.setText("2");
        rateM2.setOpaque(false);
        rateM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateM2ActionPerformed(evt);
            }
        });
        getContentPane().add(rateM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        rateM3.setBackground(new java.awt.Color(153, 153, 153));
        rateM3.setText("3");
        rateM3.setOpaque(false);
        rateM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateM3ActionPerformed(evt);
            }
        });
        getContentPane().add(rateM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        rateM4.setText("4");
        rateM4.setOpaque(false);
        rateM4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateM4ActionPerformed(evt);
            }
        });
        getContentPane().add(rateM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        search.setText("Search________________________________");
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(899, 12, 245, -1));

        searchS.setBackground(new java.awt.Color(204, 255, 204));
        searchS.setText("Search");
        searchS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSActionPerformed(evt);
            }
        });
        getContentPane().add(searchS, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, 250, -1));

        lab_song.setText("Song :");
        getContentPane().add(lab_song, new org.netbeans.lib.awtextra.AbsoluteConstraints(899, 41, 54, -1));
        getContentPane().add(S_song, new org.netbeans.lib.awtextra.AbsoluteConstraints(971, 39, 168, -1));

        lab_artist.setText("Artist :");
        getContentPane().add(lab_artist, new org.netbeans.lib.awtextra.AbsoluteConstraints(899, 66, 64, -1));
        getContentPane().add(S_artist, new org.netbeans.lib.awtextra.AbsoluteConstraints(971, 64, 168, -1));

        lab_album.setText("Album :");
        getContentPane().add(lab_album, new org.netbeans.lib.awtextra.AbsoluteConstraints(899, 91, -1, -1));
        getContentPane().add(S_album, new org.netbeans.lib.awtextra.AbsoluteConstraints(969, 89, 168, -1));

        lab_letter.setText("Letter :");
        getContentPane().add(lab_letter, new org.netbeans.lib.awtextra.AbsoluteConstraints(899, 116, 64, -1));
        getContentPane().add(S_letter, new org.netbeans.lib.awtextra.AbsoluteConstraints(969, 114, 168, -1));

        lab_LyricsG.setText("Lyrics guessing______________________");
        getContentPane().add(lab_LyricsG, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 300, -1, -1));

        Guess.setBackground(new java.awt.Color(255, 255, 153));
        Guess.setText("Guess ");
        getContentPane().add(Guess, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 360, 250, -1));

        Evaluate.setBackground(new java.awt.Color(255, 255, 204));
        Evaluate.setText("Evaluate ");
        Evaluate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvaluateActionPerformed(evt);
            }
        });
        getContentPane().add(Evaluate, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 420, 250, -1));

        letter_User.setViewportView(jTextPane4);

        getContentPane().add(letter_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 330, 250, -1));

        good.setText("Good");
        good.setOpaque(false);
        good.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goodActionPerformed(evt);
            }
        });
        getContentPane().add(good, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 390, -1, -1));

        medium.setText("Medium");
        medium.setOpaque(false);
        medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumActionPerformed(evt);
            }
        });
        getContentPane().add(medium, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 390, -1, -1));

        bad.setText("Bad");
        bad.setOpaque(false);
        bad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                badActionPerformed(evt);
            }
        });
        getContentPane().add(bad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 390, -1, -1));

        addFriend_Button.setBackground(new java.awt.Color(204, 255, 204));
        addFriend_Button.setText("Add_friends");
        addFriend_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFriend_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addFriend_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 210, 250, -1));

        update_User.setBackground(new java.awt.Color(204, 255, 204));
        update_User.setText("Update User");
        update_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_UserActionPerformed(evt);
            }
        });
        getContentPane().add(update_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 240, 250, -1));

        myUserName.setText("User : XX");
        myUserName.setEnabled(false);
        getContentPane().add(myUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, -1, -1));

        playVideo.setText("Play Video");
        playVideo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playVideoMouseClicked(evt);
            }
        });
        playVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playVideoActionPerformed(evt);
            }
        });
        getContentPane().add(playVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 160, -1));

        Before.setText("Before");
        Before.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeforeActionPerformed(evt);
            }
        });
        getContentPane().add(Before, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 90, 60));

        jListVideos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "dgdfg" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listMusic2.setViewportView(jListVideos);

        getContentPane().add(listMusic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 264, 107));

        addVideo.setBackground(new java.awt.Color(255, 102, 102));
        addVideo.setText("Add Video");
        addVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVideoActionPerformed(evt);
            }
        });
        getContentPane().add(addVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 264, -1));

        deleteVideo.setBackground(new java.awt.Color(255, 153, 153));
        deleteVideo.setText("Delete");
        deleteVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteVideoActionPerformed(evt);
            }
        });
        getContentPane().add(deleteVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        modVideoMetadata.setBackground(new java.awt.Color(255, 153, 153));
        modVideoMetadata.setText("Modify metadata");
        modVideoMetadata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modVideoMetadataActionPerformed(evt);
            }
        });
        getContentPane().add(modVideoMetadata, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        rateVideo.setBackground(new java.awt.Color(255, 204, 204));
        rateVideo.setText("Rate Video");
        getContentPane().add(rateVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 264, -1));

        rateM1.setBackground(new java.awt.Color(153, 153, 153));
        rateM1.setText("1");
        rateM1.setOpaque(false);
        rateM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateM1ActionPerformed(evt);
            }
        });
        getContentPane().add(rateM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        rateM5.setText("5");
        rateM5.setOpaque(false);
        rateM5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateM5ActionPerformed(evt);
            }
        });
        getContentPane().add(rateM5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 280, 10));

        ShowMedia.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 51)));

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ShowMediaLayout = new javax.swing.GroupLayout(ShowMedia);
        ShowMedia.setLayout(ShowMediaLayout);
        ShowMediaLayout.setHorizontalGroup(
            ShowMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
            .addGroup(ShowMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING))
        );
        ShowMediaLayout.setVerticalGroup(
            ShowMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
            .addGroup(ShowMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING))
        );

        getContentPane().add(ShowMedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 590, 320));

        rateV2.setBackground(new java.awt.Color(153, 153, 153));
        rateV2.setText("2");
        rateV2.setOpaque(false);
        rateV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateV2ActionPerformed(evt);
            }
        });
        getContentPane().add(rateV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        rateV3.setBackground(new java.awt.Color(153, 153, 153));
        rateV3.setText("3");
        rateV3.setOpaque(false);
        rateV3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateV3ActionPerformed(evt);
            }
        });
        getContentPane().add(rateV3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        rateV4.setText("4");
        rateV4.setOpaque(false);
        rateV4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateV4ActionPerformed(evt);
            }
        });
        getContentPane().add(rateV4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, -1));

        rateV1.setBackground(new java.awt.Color(153, 153, 153));
        rateV1.setText("1");
        rateV1.setOpaque(false);
        rateV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateV1ActionPerformed(evt);
            }
        });
        getContentPane().add(rateV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        rateV5.setText("5");
        rateV5.setOpaque(false);
        rateV5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateV5ActionPerformed(evt);
            }
        });
        getContentPane().add(rateV5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, -1));

        playMusic.setText("Play Music");
        playMusic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playMusicMouseClicked(evt);
            }
        });
        playMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playMusicActionPerformed(evt);
            }
        });
        getContentPane().add(playMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 160, -1));

        Stop.setText("Stop");
        Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopActionPerformed(evt);
            }
        });
        getContentPane().add(Stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 140, 60));

        After.setText("After");
        After.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfterActionPerformed(evt);
            }
        });
        getContentPane().add(After, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 420, 90, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
     * Acción para agregar una canción
     *
     * @param evt
     */
    private void addMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMusicActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("C:\\home\\josek\\Descargas"));///home/josek/Descargas
        fileChooser.setDialogTitle("Select Mp3");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Mp3 files", "mp3","mp4"));
        if (fileChooser.showOpenDialog(addMusic) == JFileChooser.APPROVE_OPTION) {
            //try {
            File myFile = fileChooser.getSelectedFile();
            String filename = fileChooser.getSelectedFile().getName();
            filePath = fileChooser.getSelectedFile().getPath();

            System.out.println(filePath);

            musicMusic = filename.substring(0, filename.length() - 4);
            System.out.println(": Name : " + musicMusic);

            din.addElement(musicMusic);
            jListMusic.setModel(din);

            String userName = UserName.getText();

            Track tAdd = new Track();
            JAXBObjectToXml xmlLogin = new JAXBObjectToXml();

            tAdd.setUsername(userName);
            tAdd.setTitle(musicMusic);
            tAdd.setPath(filePath);
            tAdd.setTag("Track");

            String xml_string = xmlLogin.ConvertToXML(tAdd, Track.class);

            System.out.println("!"+xml_string);

            connect_Server s = new connect_Server();

            String res = s.connect(xml_string);
            System.out.println("?"+res);
            if (!res.equals("TRUE")) {
                 JOptionPane.showMessageDialog(this, "Error: ", "Music Up", 1);
            } 
        }

        /*
                
                String absolutePath = myFile.getAbsolutePath();
                String filePath1 = absolutePath.substring(0, absolutePath.lastIndexOf(File.separator));
                // convert file to byte[]
                byte[] bFile;
                bFile = readBytesFromFile(filePath);

                File file = new File(filePath);

                FileInputStream fis = new FileInputStream(file);
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                try {
                    for (int readNum; (readNum = fis.read(buf)) != -1;) {
                        bos.write(buf, 0, readNum); //no doubt here is 0
                        System.out.println("read " + readNum + " bytes,");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }
                byte[] bytes = bos.toByteArray();

                System.out.println("My Size > " + bytes.length);

                //below is the different part
                File someFile = new File("java2.mp3");
                try (FileOutputStream fos = new FileOutputStream(someFile)) {
                    fos.write(bytes);

                    fos.flush();
                }

                // save byte[] into a file
                Path path = Paths.get("/home/josek/test2.jpeg");
                Files.write(path, bytes);

                connect_Server c = new connect_Server();
                c.connect2(bytes);

            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
                
         */
    
    }//GEN-LAST:event_addMusicActionPerformed

/**
 * Lector de bytes desde un archivo
 *
 * @param filePath
 * @return
 */
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

    /**
     * Método para buscar una canción
     *
     * @param evt
     */
    private void searchSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchSActionPerformed

    /**
     * Método para evaluar #1
     *
     * @param evt
     */
    private void mediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumActionPerformed
        // TODO add your handling code here:
        bad.setSelected(false);
        good.setSelected(false);
    }//GEN-LAST:event_mediumActionPerformed

    /**
     * Método para evaluar #2
     *
     * @param evt
     */
    private void badActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_badActionPerformed
        // TODO add your handling code here:
        medium.setSelected(false);
        good.setSelected(false);
    }//GEN-LAST:event_badActionPerformed

    /**
     * Método para evaluar #3
     *
     * @param evt
     */
    private void goodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goodActionPerformed
        // TODO add your handling code here:
        medium.setSelected(false);
        bad.setSelected(false);
    }//GEN-LAST:event_goodActionPerformed

    /**
     * Acción para realizar la evaluación
     *
     * @param evt
     */
    private void EvaluateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EvaluateActionPerformed
        // TODO add your handling code here:
        if (good.isSelected()) {
            good.setSelected(false);
        } else if (medium.isSelected()) {

            medium.setSelected(false);
        } else if (bad.isSelected()) {
            bad.setSelected(false);
        } else {
            JOptionPane.showMessageDialog(this, "Please select an option to perform the rating", "Evaluate", 2);
        }

    }//GEN-LAST:event_EvaluateActionPerformed

    /**
     * Acción agregar un amigo
     *
     * @param evt
     */
    private void addFriend_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFriend_ButtonActionPerformed
        // TODO add your handling code here:
        ManagerFriend manF = new ManagerFriend();
        manF.setVisible(true);
    }//GEN-LAST:event_addFriend_ButtonActionPerformed

    /**
     * Acción para actualizar el usuario
     *
     * @param evt
     */
    private void update_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_UserActionPerformed
        // TODO add your handling code here:
        UpdateUser us = new UpdateUser();
        us.setVisible(true);

    }//GEN-LAST:event_update_UserActionPerformed

    /**
     * Método para clasificar canción #4
     *
     * @param evt
     */
    private void rateM4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateM4ActionPerformed
        // TODO add your handling code here:
        rateM1.setSelected(false);
        rateM2.setSelected(false);
        rateM3.setSelected(false);
        rateM5.setSelected(false);
    }//GEN-LAST:event_rateM4ActionPerformed

    /**
     * Método para clasificar canción #3
     *
     * @param evt
     */
    private void rateM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateM3ActionPerformed
        // TODO add your handling code here:
        rateM1.setSelected(false);
        rateM2.setSelected(false);
        rateM4.setSelected(false);
        rateM5.setSelected(false);
    }//GEN-LAST:event_rateM3ActionPerformed

    /**
     * Método para clasificar canción #2
     *
     * @param evt
     */
    private void rateM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateM2ActionPerformed
        // TODO add your handling code here:
        rateM1.setSelected(false);
        rateM3.setSelected(false);
        rateM4.setSelected(false);
        rateM5.setSelected(false);
    }//GEN-LAST:event_rateM2ActionPerformed

    /**
     * Acción para abrir una nueva ventana -Metadata-
     *
     * @param evt
     */
    private void modMetadataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modMetadataActionPerformed
        // TODO add your handling code here:
        MetadataMusic metadata = new MetadataMusic();
        metadata.setVisible(true);
    }//GEN-LAST:event_modMetadataActionPerformed

    /**
     * Acción para eliminar una canción--
     *
     * @param evt
     */
    private void deleteMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMusicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMusicActionPerformed

    /**
     * Acción para añadir un video-
     *
     * @param evt
     */
    private void addVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVideoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addVideoActionPerformed

    /**
     * Acción para eliminar una video --
     *
     * @param evt
     */
    private void deleteVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteVideoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteVideoActionPerformed

    /**
     * Acción para abrir una nueva ventana -MetadataVideo-
     *
     * @param evt
     */
    private void modVideoMetadataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modVideoMetadataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modVideoMetadataActionPerformed

    /**
     * Método para clasificar canción #1
     *
     * @param evt
     */
    private void rateM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rateM1ActionPerformed

    /**
     * Método para clasificar canción #5
     *
     * @param evt
     */
    private void rateM5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateM5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rateM5ActionPerformed

    /**
     * Método para clasificar videos #2
     *
     * @param evt
     */
    private void rateV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateV2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rateV2ActionPerformed

    /**
     * Método para clasificar videos #3
     *
     * @param evt
     */
    private void rateV3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateV3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rateV3ActionPerformed

    /**
     * Método para clasificar videos #4
     *
     * @param evt
     */
    private void rateV4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateV4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rateV4ActionPerformed

    /**
     * Método para clasificar videos #1
     *
     * @param evt
     */
    private void rateV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rateV1ActionPerformed

    /**
     * Método para clasificar videos #5
     *
     * @param evt
     */
    private void rateV5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateV5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rateV5ActionPerformed

    /**
     * Acción para rrealizar la reproducción -Streaming
     *
     * @param evt
     */
    private void playVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playVideoActionPerformed

        if (!jListMusic.isSelectionEmpty() && !jListVideos.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select an option to perform the rating", "Evaluate", 2);

        }
    }//GEN-LAST:event_playVideoActionPerformed

    /**
     * Acción para reproducir canciones/videos-
     *
     * @param evt
     */
    private void playVideoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playVideoMouseClicked
        mediaPlayerComponent= null;
        new NativeDiscovery().discover();
        mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
        jInternalFrame1.setContentPane(mediaPlayerComponent);
        jInternalFrame1.setVisible(true);
        mediaPlayerComponent.getMediaPlayer().playMedia(filePath);

    }//GEN-LAST:event_playVideoMouseClicked

    private void BeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeforeActionPerformed

            mediaPlayerComponent.getMediaPlayer().pause();
        // TODO add your handling code here:
    }//GEN-LAST:event_BeforeActionPerformed

    private void playMusicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMusicMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_playMusicMouseClicked

    private void playMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playMusicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playMusicActionPerformed

    private void StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StopActionPerformed

    private void AfterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AfterActionPerformed

    /**
     * Main Interface
     *
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
            java.util.logging.Logger.getLogger(Interface.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Interface().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton After;
    private javax.swing.JButton Before;
    private javax.swing.JButton Evaluate;
    private javax.swing.JButton Guess;
    private javax.swing.JTextField S_album;
    private javax.swing.JTextField S_artist;
    private javax.swing.JTextField S_letter;
    private javax.swing.JTextField S_song;
    private javax.swing.JPanel ShowMedia;
    private javax.swing.JButton Stop;
    private javax.swing.JButton addFriend_Button;
    private javax.swing.JButton addMusic;
    private javax.swing.JButton addVideo;
    private javax.swing.JRadioButton bad;
    private javax.swing.JButton deleteMusic;
    private javax.swing.JButton deleteVideo;
    private javax.swing.JRadioButton good;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JList<String> jListMusic;
    private javax.swing.JList<String> jListVideos;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JLabel lab_LyricsG;
    private javax.swing.JLabel lab_album;
    private javax.swing.JLabel lab_artist;
    private javax.swing.JLabel lab_letter;
    private javax.swing.JLabel lab_song;
    private javax.swing.JScrollPane letter_User;
    private javax.swing.JScrollPane listMusic;
    private javax.swing.JScrollPane listMusic2;
    private javax.swing.JRadioButton medium;
    private javax.swing.JButton modMetadata;
    private javax.swing.JButton modVideoMetadata;
    private javax.swing.JScrollPane musicPlaying;
    public static javax.swing.JLabel myUserName;
    private javax.swing.JButton playMusic;
    private javax.swing.JButton playVideo;
    private javax.swing.JRadioButton rateM1;
    private javax.swing.JRadioButton rateM2;
    private javax.swing.JRadioButton rateM3;
    private javax.swing.JRadioButton rateM4;
    private javax.swing.JRadioButton rateM5;
    private javax.swing.JButton rateSong;
    private javax.swing.JRadioButton rateV1;
    private javax.swing.JRadioButton rateV2;
    private javax.swing.JRadioButton rateV3;
    private javax.swing.JRadioButton rateV4;
    private javax.swing.JRadioButton rateV5;
    private javax.swing.JButton rateVideo;
    private javax.swing.JLabel search;
    private javax.swing.JButton searchS;
    private javax.swing.JButton update_User;
    // End of variables declaration//GEN-END:variables
}
