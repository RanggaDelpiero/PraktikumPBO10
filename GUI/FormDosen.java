/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.table.DefaultTableModel;
/**
 *
 * @author RanggaDelpiero UB
 */
public class FormDosen extends javax.swing.JFrame {

    DefaultTableModel model;

    public FormDosen() {
        initComponents();
        Data.initDosen();
        model = (DefaultTableModel) tableDosen.getModel();
        tampilData();
    }
    
    public void tampilData() {
        model.setRowCount(0);
        for(int i = 0; i < Data.dsn.size(); i++) {
            
            String NIP = Data.dsn.get(i).getNip();
            String nama = Data.dsn.get(i).getNama();
            String prodi = Data.dsn.get(i).getProdi();
            String fakultas = Data.dsn.get(i).getFakultas();
            
            model.insertRow(model.getRowCount(), new Object[]{NIP,nama,prodi,fakultas});
        }
    }
    
    public void tambahData() {

        String NIP = textFieldNIP.getText();
        String nama = textFieldNama.getText();
        String prodi = textFieldProdi.getText();
        String fakultas = textFieldFakultas.getText();
        
        Dosen Dsn = new Dosen(NIP, nama, prodi, fakultas);
        Data.dsn.add(Dsn);
        Data.simpanDsn();
        tampilData();

        reset();

    }
    
    public void edit() {
        textFieldNIP.setText(Data.mhs.get(tableDosen.getSelectedRow()).getNim());
        textFieldNama.setText(Data.mhs.get(tableDosen.getSelectedRow()).getNama());
        textFieldProdi.setText(Data.mhs.get(tableDosen.getSelectedRow()).getProdi());
        textFieldFakultas.setText(Data.mhs.get(tableDosen.getSelectedRow()).getFakultas());
    }
    
    public void updateData() {
        Data.dsn.get(tableDosen.getSelectedRow()).setNip(textFieldNIP.getText());
        Data.dsn.get(tableDosen.getSelectedRow()).setNama(textFieldNama.getText());
        Data.dsn.get(tableDosen.getSelectedRow()).setProdi(textFieldProdi.getText());
        Data.dsn.get(tableDosen.getSelectedRow()).setFakultas(textFieldFakultas.getText());
        Data.simpanDsn();
        tampilData();
        
        reset();
    }
    
    public void hapusData() {
        Data.dsn.remove(tableDosen.getSelectedRow());
        Data.simpanDsn();
        tampilData();
        reset();
    }
    
    public void reset() {
        textFieldNIP.setText("");
        textFieldNama.setText("");
        textFieldProdi.setText("");
        textFieldFakultas.setText("");
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textFieldNIP = new javax.swing.JTextField();
        textFieldNama = new javax.swing.JTextField();
        textFieldProdi = new javax.swing.JTextField();
        textFieldFakultas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tambahButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDosen = new javax.swing.JTable();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(10, 25, 49));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(10, 25, 49));

        backButton.setBackground(new java.awt.Color(255, 201, 71));
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manajemen Dosen");

        textFieldNIP.setBackground(new java.awt.Color(255, 255, 255));
        textFieldNIP.setBorder(null);
        textFieldNIP.setMinimumSize(new java.awt.Dimension(64, 20));
        textFieldNIP.setPreferredSize(new java.awt.Dimension(64, 20));
        textFieldNIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNIPActionPerformed(evt);
            }
        });

        textFieldNama.setBackground(new java.awt.Color(255, 255, 255));
        textFieldNama.setBorder(null);
        textFieldNama.setPreferredSize(new java.awt.Dimension(64, 20));
        textFieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNamaActionPerformed(evt);
            }
        });

        textFieldProdi.setBackground(new java.awt.Color(255, 255, 255));
        textFieldProdi.setBorder(null);
        textFieldProdi.setPreferredSize(new java.awt.Dimension(64, 20));
        textFieldProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldProdiActionPerformed(evt);
            }
        });

        textFieldFakultas.setBackground(new java.awt.Color(255, 255, 255));
        textFieldFakultas.setBorder(null);
        textFieldFakultas.setPreferredSize(new java.awt.Dimension(64, 20));
        textFieldFakultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldFakultasActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NIP");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Prodi");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fakultas");

        tambahButton.setBackground(new java.awt.Color(24, 90, 219));
        tambahButton.setForeground(new java.awt.Color(255, 255, 255));
        tambahButton.setText("Tambah");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(24, 90, 219));
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        hapusButton.setBackground(new java.awt.Color(24, 90, 219));
        hapusButton.setForeground(new java.awt.Color(255, 255, 255));
        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        resetButton.setBackground(new java.awt.Color(24, 90, 219));
        resetButton.setForeground(new java.awt.Color(255, 255, 255));
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        tableDosen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIP", "Nama", "Prodi", "Fakultas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDosenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDosen);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tambahButton)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton)
                        .addGap(18, 18, 18)
                        .addComponent(hapusButton)
                        .addGap(18, 18, 18)
                        .addComponent(resetButton)
                        .addGap(186, 186, 186))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(87, 87, 87)
                        .addComponent(backButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldNIP, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldProdi, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldNIP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textFieldFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahButton)
                    .addComponent(updateButton)
                    .addComponent(hapusButton)
                    .addComponent(resetButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(745, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableDosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDosenMouseClicked
        // TODO add your handling code here:
        edit();
    }//GEN-LAST:event_tableDosenMouseClicked

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        // TODO add your handling code here:
        hapusData();
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        updateData();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        // TODO add your handling code here:
        tambahData();
    }//GEN-LAST:event_tambahButtonActionPerformed

    private void textFieldFakultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldFakultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldFakultasActionPerformed

    private void textFieldProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldProdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldProdiActionPerformed

    private void textFieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNamaActionPerformed

    private void textFieldNIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNIPActionPerformed
        // TODOadd your handling code here:
    }//GEN-LAST:event_textFieldNIPActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        manajemenCivitas.form.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FormDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDosen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton hapusButton;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resetButton;
    private javax.swing.JTable tableDosen;
    private javax.swing.JButton tambahButton;
    private javax.swing.JTextField textFieldFakultas;
    private javax.swing.JTextField textFieldNIP;
    private javax.swing.JTextField textFieldNama;
    private javax.swing.JTextField textFieldProdi;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
