/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author ikmal
 */
import GUI.Dashboard;
import GUI.LihatSuratDosen;
public class MenuDosen extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public MenuDosen() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        garispembataslogo = new javax.swing.JPanel();
        labellihatkirimansurat = new javax.swing.JLabel();
        logoutlabel = new javax.swing.JLabel();
        sidebarhome7 = new javax.swing.JLabel();
        labelriwayatperubahan = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sayhitext2 = new javax.swing.JLabel();
        sayhitext = new javax.swing.JLabel();
        logosayhi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1035, 610));
        setMinimumSize(new java.awt.Dimension(1035, 610));

        jPanel1.setBackground(new java.awt.Color(219, 244, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        garispembataslogo.setBackground(new java.awt.Color(204, 204, 204));
        garispembataslogo.setPreferredSize(new java.awt.Dimension(100, 4));

        javax.swing.GroupLayout garispembataslogoLayout = new javax.swing.GroupLayout(garispembataslogo);
        garispembataslogo.setLayout(garispembataslogoLayout);
        garispembataslogoLayout.setHorizontalGroup(
            garispembataslogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        garispembataslogoLayout.setVerticalGroup(
            garispembataslogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        labellihatkirimansurat.setBackground(new java.awt.Color(0, 0, 0));
        labellihatkirimansurat.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        labellihatkirimansurat.setForeground(new java.awt.Color(0, 0, 0));
        labellihatkirimansurat.setText("LIHAT KIRIMAN SURAT");
        labellihatkirimansurat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labellihatkirimansuratMouseClicked(evt);
            }
        });

        logoutlabel.setBackground(new java.awt.Color(0, 0, 0));
        logoutlabel.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        logoutlabel.setForeground(new java.awt.Color(0, 0, 0));
        logoutlabel.setText("LOG OUT");
        logoutlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutlabelMouseClicked(evt);
            }
        });

        sidebarhome7.setBackground(new java.awt.Color(0, 0, 0));
        sidebarhome7.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        sidebarhome7.setForeground(new java.awt.Color(0, 0, 0));
        sidebarhome7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/logoesuratsigma.jpg"))); // NOI18N

        labelriwayatperubahan.setBackground(new java.awt.Color(0, 0, 0));
        labelriwayatperubahan.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        labelriwayatperubahan.setForeground(new java.awt.Color(0, 0, 0));
        labelriwayatperubahan.setText("RIWAYAT PERUBAHAN ");
        labelriwayatperubahan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelriwayatperubahanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(sidebarhome7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(garispembataslogo, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoutlabel)
                            .addComponent(labellihatkirimansurat)
                            .addComponent(labelriwayatperubahan))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sidebarhome7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(garispembataslogo, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labellihatkirimansurat)
                .addGap(10, 10, 10)
                .addComponent(labelriwayatperubahan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutlabel)
                .addContainerGap(417, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 610));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ikmal\\OneDrive\\Gambar\\10515253.png")); // NOI18N
        jLabel2.setDisabledIcon(new javax.swing.ImageIcon("C:\\Users\\ikmal\\OneDrive\\Gambar\\360_F_325073621_7AkPhyNfndERS4kb6oQNIQMyOFbtHA4F.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, 500));

        sayhitext2.setBackground(new java.awt.Color(0, 0, 0));
        sayhitext2.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 48)); // NOI18N
        sayhitext2.setForeground(new java.awt.Color(0, 150, 234));
        sayhitext2.setText("Selamat datang ");
        jPanel1.add(sayhitext2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 520, -1));

        sayhitext.setBackground(new java.awt.Color(153, 153, 153));
        sayhitext.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        sayhitext.setForeground(new java.awt.Color(204, 204, 204));
        sayhitext.setText("Di E-Surat Sigma");
        jPanel1.add(sayhitext, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 370, -1));

        logosayhi.setBackground(new java.awt.Color(0, 0, 0));
        logosayhi.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        logosayhi.setForeground(new java.awt.Color(0, 0, 0));
        logosayhi.setIcon(new javax.swing.ImageIcon("C:\\Users\\ikmal\\OneDrive\\Gambar\\Sayhi.png")); // NOI18N
        jPanel1.add(logosayhi, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 350, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutlabelMouseClicked
        Dashboard dashboardForm = new Dashboard(); 
        dashboardForm.setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_logoutlabelMouseClicked

    private void labellihatkirimansuratMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labellihatkirimansuratMouseClicked
        LihatSuratDosen lihatsuratdosenForm = new LihatSuratDosen(); 
        lihatsuratdosenForm.setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_labellihatkirimansuratMouseClicked

    private void labelriwayatperubahanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelriwayatperubahanMouseClicked
        
    }//GEN-LAST:event_labelriwayatperubahanMouseClicked

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
            java.util.logging.Logger.getLogger(MenuDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDosen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel garispembataslogo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labellihatkirimansurat;
    private javax.swing.JLabel labelriwayatperubahan;
    private javax.swing.JLabel logosayhi;
    private javax.swing.JLabel logoutlabel;
    private javax.swing.JLabel sayhitext;
    private javax.swing.JLabel sayhitext2;
    private javax.swing.JLabel sidebarhome7;
    // End of variables declaration//GEN-END:variables
}
