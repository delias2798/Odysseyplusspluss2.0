package odyssey;

/**
 *
 * @author josek
 */
public class MetadataVideo extends javax.swing.JFrame {

    /**
     * Creates new form MetadataVideo
     */
    public MetadataVideo() {
        initComponents();
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
     * Método para obtener lo seleccioando por el usuario
     * @param evt 
     */
    private void SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectActionPerformed
        String desc = j_description.getText();

    }//GEN-LAST:event_SelectActionPerformed

    /**
     * Acción de cambio
     * @param evt 
     */
    private void jB_Change1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Change1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_Change1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetadataVideo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Select;
    private javax.swing.JButton jB_Change1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField j_description;
    // End of variables declaration//GEN-END:variables
}
