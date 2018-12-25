package View;

import Controller.Controller_LapPendapatan;
import javax.swing.JTextField;

public class LapPendapatan extends javax.swing.JFrame {  
    
    Controller_LapPendapatan controller;
   
    public LapPendapatan() {
        initComponents();
        controller = new Controller_LapPendapatan(this); 
        controller.awal();
    }

    public JTextField getTgl1() {
        return tgl1;
    }

    public JTextField getTgl2() {
        return tgl2;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel3 = new javax.swing.JPanel();
        cmdexcel = new javax.swing.JButton();
        cmdpreview = new javax.swing.JButton();
        JPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tgl2 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        tgl1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cetak Laporan Pendapatan");
        getContentPane().setLayout(null);

        JPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JPanel3.setLayout(null);

        cmdexcel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdexcel.setText("EXCEL");
        cmdexcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdexcelActionPerformed(evt);
            }
        });
        JPanel3.add(cmdexcel);
        cmdexcel.setBounds(250, 10, 120, 40);

        cmdpreview.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdpreview.setText("PREVIEW");
        cmdpreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdpreviewActionPerformed(evt);
            }
        });
        JPanel3.add(cmdpreview);
        cmdpreview.setBounds(100, 10, 120, 40);

        getContentPane().add(JPanel3);
        JPanel3.setBounds(40, 310, 470, 70);

        JPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("PERIODE CETAK"));
        JPanel2.setLayout(null);

        jLabel8.setBackground(new java.awt.Color(0, 0, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("-");
        JPanel2.add(jLabel8);
        jLabel8.setBounds(210, 40, 40, 20);

        tgl2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tgl2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tgl2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPanel2.add(tgl2);
        tgl2.setBounds(250, 40, 170, 30);

        jLabel32.setBackground(new java.awt.Color(0, 0, 153));
        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 51, 51));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Year-Month-Date");
        JPanel2.add(jLabel32);
        jLabel32.setBounds(70, 70, 100, 30);

        tgl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tgl1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tgl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPanel2.add(tgl1);
        tgl1.setBounds(40, 40, 170, 30);

        getContentPane().add(JPanel2);
        JPanel2.setBounds(40, 180, 470, 110);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CETAK LAPORAN PENDAPATAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 110, 530, 48);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo_to_stok.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 10, 310, 110);

        setSize(new java.awt.Dimension(568, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdexcelActionPerformed
        controller.cetak_excel();
    }//GEN-LAST:event_cmdexcelActionPerformed

    private void cmdpreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdpreviewActionPerformed
        controller.cetak_preview();
    }//GEN-LAST:event_cmdpreviewActionPerformed

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
            java.util.logging.Logger.getLogger(LapPendapatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LapPendapatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LapPendapatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LapPendapatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LapPendapatan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel2;
    private javax.swing.JPanel JPanel3;
    private javax.swing.JButton cmdexcel;
    private javax.swing.JButton cmdpreview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tgl1;
    private javax.swing.JTextField tgl2;
    // End of variables declaration//GEN-END:variables
}
