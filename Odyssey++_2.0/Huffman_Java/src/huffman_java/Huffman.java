package huffman_java;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Huffman extends javax.swing.JFrame {

    static String d = "";
    String goConsole = "";
    static String nada = "";

    public Huffman() {
        initComponents();
    }

    /**
     * Print the code:tree
     *
     * @param root Node of the Tree
     * @param s Binary Number
     */
    public static void printCode(HuffmanNode root, String s) {

        if (root.left == null && root.right == null && Character.isLetter(root.c)) {
            System.out.println(root.c + ":" + s);
            d = d + (root.c) + ":" + s + "\n";
            return;
        }
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    /**
     * Node Class
     *
     * @author josek
     */
    class HuffmanNode {

        int data;
        char c;

        HuffmanNode left;
        HuffmanNode right;
    }

    /**
     * Comparator class for help to compare the nodes
     *
     * @author josek
     */
    class MyComparator implements Comparator<HuffmanNode> {

        @Override
        public int compare(HuffmanNode x, HuffmanNode y) {

            return x.data - y.data;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        text = new javax.swing.JTextField();
        go_Huffman = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        frecuency = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Text");

        go_Huffman.setText("Go_Huffman");
        go_Huffman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_HuffmanActionPerformed(evt);
            }
        });

        jLabel2.setText("Frecuency");

        jScrollPane1.setViewportView(TextArea);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(go_Huffman)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(text)
                                .addComponent(frecuency, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(frecuency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(go_Huffman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void go_HuffmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_HuffmanActionPerformed

        /* char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] charfreq = {52, 99, 122, 136, 322, 5444};
        int n = 6;
         */
        char[] charArray = new char[256];
        int[] charfreq = new int[256];
        int n = 6;

        String UI = text.getText();
        charfreq[0] = 3;
        jTextArea1.append(on_SplitFrecuency_clicked(UI));

        int counter = 0;
        for (int i = 0; i < charfreq.length; i++) {
            jTextArea1.append(""+charfreq[i]);
            if (charfreq[i] != 0) {
                counter++;
            }
        }

        jTextArea1.append("" + counter);

        PriorityQueue<HuffmanNode> q = new PriorityQueue<>(n, new MyComparator());

        for (int i = 0; i < n; i++) {
            HuffmanNode hn = new HuffmanNode();
            hn.c = charArray[i];
            hn.data = charfreq[i];
            hn.left = null;
            hn.right = null;
            q.add(hn);
        }

        HuffmanNode root = null;
        while (q.size() > 1) {
            HuffmanNode x = q.peek();
            q.poll();
            HuffmanNode y = q.peek();
            q.poll();
            HuffmanNode f = new HuffmanNode();
            f.data = x.data + y.data;
            f.c = '-';
            f.left = x;
            f.right = y;
            root = f;
            q.add(f);
        }
        printCode(root, "");

        d = "\n" + d + "\n";
        TextArea.setText(d);


    }//GEN-LAST:event_go_HuffmanActionPerformed

    void createtable(String data, int by) {
        int myByte = by;
    }

    String on_SplitFrecuency_clicked(String text1) {
        String str = text1;
        String cant = "";

        System.err.println(">>> SiZe:" + str.length());

        for (int i = 0; i < str.length(); ++i) {
            String s = "" + (str.charAt(i));      //letra
            //Condición de analisis numerico para determinar la cantidad de letras existen dentro del texto
            int cont1 = 0;
            for (int p = 0; p < str.length(); p++) {
                String word = "" + str.charAt(p);
                if (word.equals(s)) {
                    cont1++;
                }
            }
            nada += s + ": " + cont1 + "\n";

            //No diccionario sino todo directo...
        }
        return nada;

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Huffman().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane TextArea;
    private javax.swing.JTextField frecuency;
    private javax.swing.JButton go_Huffman;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField text;
    // End of variables declaration//GEN-END:variables
}
