/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

/**
 *
 * @author praktek
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
        //this.setSize(1000, 600);
        setLocationRelativeTo(this);
        Koneksi.DataBase.KoneksiDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnKategoriLayer = new javax.swing.JButton();
        btnPemasokLayer = new javax.swing.JButton();
        btnEntryLayer = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnPemasokLayer1 = new javax.swing.JButton();
        btnEntryLayer1 = new javax.swing.JButton();
        btnPendapatanLayer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MMenu = new javax.swing.JMenu();
        MBarang1 = new javax.swing.JMenuItem();
        MKategori = new javax.swing.JMenuItem();
        MSuplier = new javax.swing.JMenuItem();
        MenuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        TBuktiPesan = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        LBarang = new javax.swing.JMenuItem();
        LPemasok = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Mexit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistem Informasi Apotek Citra");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ENTRY DATA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        jPanel2.setToolTipText("");

        btnKategoriLayer.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnKategoriLayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/plus.png"))); // NOI18N
        btnKategoriLayer.setText("ENTRY KATEGORI");
        btnKategoriLayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKategoriLayerActionPerformed(evt);
            }
        });

        btnPemasokLayer.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnPemasokLayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/plus.png"))); // NOI18N
        btnPemasokLayer.setText("ENTRY PEMASOK");
        btnPemasokLayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPemasokLayerActionPerformed(evt);
            }
        });

        btnEntryLayer.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnEntryLayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/plus.png"))); // NOI18N
        btnEntryLayer.setText(" ENTRY DATA OBAT");
        btnEntryLayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntryLayerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEntryLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPemasokLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKategoriLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKategoriLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPemasokLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntryLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TRANSAKSI & LAPORAN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        jPanel3.setToolTipText("");

        btnPemasokLayer1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnPemasokLayer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/stock.png"))); // NOI18N
        btnPemasokLayer1.setText(" DATA STOK");
        btnPemasokLayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPemasokLayer1ActionPerformed(evt);
            }
        });

        btnEntryLayer1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnEntryLayer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/buy.png"))); // NOI18N
        btnEntryLayer1.setText("BUKTI PESAN");
        btnEntryLayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntryLayer1ActionPerformed(evt);
            }
        });

        btnPendapatanLayer.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnPendapatanLayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/wallet.png"))); // NOI18N
        btnPendapatanLayer.setText(" PENDAPATAN");
        btnPendapatanLayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendapatanLayerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEntryLayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPemasokLayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPendapatanLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPemasokLayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntryLayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPendapatanLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("© 2018 Riki Nur Muhammad Sidik");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("1712500956");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("AL");

        MMenu.setText("File Master");

        MBarang1.setText("Entry Data Obat");
        MBarang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBarang1ActionPerformed(evt);
            }
        });
        MMenu.add(MBarang1);

        MKategori.setText("Entry Data Kategori");
        MKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MKategoriActionPerformed(evt);
            }
        });
        MMenu.add(MKategori);

        MSuplier.setText("Entry Data Pemasok");
        MSuplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSuplierActionPerformed(evt);
            }
        });
        MMenu.add(MSuplier);

        MenuExit.setText("Keluar");
        MenuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuExitMouseClicked(evt);
            }
        });
        MenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuExitActionPerformed(evt);
            }
        });
        MMenu.add(MenuExit);

        jMenuBar1.add(MMenu);

        jMenu2.setText("Transaksi");

        TBuktiPesan.setText("Bukti Pesan");
        TBuktiPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBuktiPesanActionPerformed(evt);
            }
        });
        jMenu2.add(TBuktiPesan);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Laporan");

        LBarang.setText("Laporan Data Sok Obat");
        LBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LBarangActionPerformed(evt);
            }
        });
        jMenu3.add(LBarang);

        LPemasok.setText("Laporan Data Pemasok");
        LPemasok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LPemasokActionPerformed(evt);
            }
        });
        jMenu3.add(LPemasok);

        jMenuItem1.setText("Laporan Data Pendapatan");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        Mexit.setText("Keluar");
        Mexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MexitMouseClicked(evt);
            }
        });
        jMenuBar1.add(Mexit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(745, 621));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MexitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_MexitMouseClicked

    private void MSuplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSuplierActionPerformed
        View.MSuplier s = new MSuplier();
        s.setVisible(true);
        setLocationRelativeTo(this);       
    }//GEN-LAST:event_MSuplierActionPerformed

    private void MenuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuExitMouseClicked

    }//GEN-LAST:event_MenuExitMouseClicked

    private void MenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MenuExitActionPerformed

    private void MKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MKategoriActionPerformed
        View.MKategoriObat k = new MKategoriObat();
        k.setVisible(true);
        setLocationRelativeTo(this);
    }//GEN-LAST:event_MKategoriActionPerformed

    private void MBarang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBarang1ActionPerformed
        View.MObat B = new MObat();
        B.setVisible(true);
        setLocationRelativeTo(this);
        B.getTxtnmbarang().requestFocus();
    }//GEN-LAST:event_MBarang1ActionPerformed

    private void LBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LBarangActionPerformed
        View.LapStok B = new View.LapStok();
        B.setVisible(true);
        setLocationRelativeTo(this);
    }//GEN-LAST:event_LBarangActionPerformed

    private void TBuktiPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBuktiPesanActionPerformed
        View.TBuktiPesan T = new View.TBuktiPesan();
         T.setVisible(true); 
         setLocationRelativeTo(this);
    }//GEN-LAST:event_TBuktiPesanActionPerformed

    private void btnEntryLayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntryLayerActionPerformed
        View.MObat B = new MObat();
        B.setVisible(true);
        setLocationRelativeTo(this);
        B.getTxtnmbarang().requestFocus();
    }//GEN-LAST:event_btnEntryLayerActionPerformed

    private void btnPemasokLayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPemasokLayerActionPerformed
        View.MSuplier s = new MSuplier();
        s.setVisible(true);
        setLocationRelativeTo(this);  
    }//GEN-LAST:event_btnPemasokLayerActionPerformed

    private void btnKategoriLayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKategoriLayerActionPerformed
        View.MKategoriObat k = new MKategoriObat();
        k.setVisible(true);
        setLocationRelativeTo(this);
    }//GEN-LAST:event_btnKategoriLayerActionPerformed

    private void btnPemasokLayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPemasokLayer1ActionPerformed
        View.LapStok B = new View.LapStok();
        B.setVisible(true);
        setLocationRelativeTo(this);
    }//GEN-LAST:event_btnPemasokLayer1ActionPerformed

    private void btnEntryLayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntryLayer1ActionPerformed
        View.TBuktiPesan T = new View.TBuktiPesan();
         T.setVisible(true); 
         setLocationRelativeTo(this);
    }//GEN-LAST:event_btnEntryLayer1ActionPerformed

    private void LPemasokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LPemasokActionPerformed
        View.LapPemasok P = new View.LapPemasok();  
        P.setVisible(true);
        setLocationRelativeTo(this);
    }//GEN-LAST:event_LPemasokActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        View.LapPendapatan P = new View.LapPendapatan();
         P.setVisible(true);   
         setLocationRelativeTo(this); 
         P.getTgl1().requestFocus();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnPendapatanLayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendapatanLayerActionPerformed
        View.LapPendapatan P = new View.LapPendapatan();
         P.setVisible(true);   
         setLocationRelativeTo(this); 
         P.getTgl1().requestFocus();
    }//GEN-LAST:event_btnPendapatanLayerActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem LBarang;
    private javax.swing.JMenuItem LPemasok;
    private javax.swing.JMenuItem MBarang1;
    private javax.swing.JMenuItem MKategori;
    private javax.swing.JMenu MMenu;
    private javax.swing.JMenuItem MSuplier;
    private javax.swing.JMenuItem MenuExit;
    private javax.swing.JMenu Mexit;
    private javax.swing.JMenuItem TBuktiPesan;
    private javax.swing.JButton btnEntryLayer;
    private javax.swing.JButton btnEntryLayer1;
    private javax.swing.JButton btnKategoriLayer;
    private javax.swing.JButton btnPemasokLayer;
    private javax.swing.JButton btnPemasokLayer1;
    private javax.swing.JButton btnPendapatanLayer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
