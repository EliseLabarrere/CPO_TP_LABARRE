/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp2_convertisseurobjet_labarrere;

/**
 *
 * @author Pedro Pablo Palmito
 */
public class mainWindow extends javax.swing.JFrame {

    /**
     * Creates new form mainWindow
     */
    public mainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textTemp = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        selectTo = new javax.swing.JComboBox<>();
        selectFrom = new javax.swing.JComboBox<>();
        textTo = new javax.swing.JLabel();
        textFrom = new javax.swing.JLabel();
        textTo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(textTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        btnConfirm.setBackground(new java.awt.Color(0, 102, 204));
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Convertir");
        btnConfirm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        btnConfirm.setBorderPainted(false);
        btnConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConfirm.setDefaultCapable(false);
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 80, 30));

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setText("Convertisseur");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        selectTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Kevin", "Farenheit" }));
        getContentPane().add(selectTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        selectFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Kevin", "Farenheit" }));
        selectFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFromActionPerformed(evt);
            }
        });
        getContentPane().add(selectFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        textTo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textTo.setText("Entrez la température à convertir :");
        getContentPane().add(textTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        textFrom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textFrom.setText("De");
        getContentPane().add(textFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        textTo1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textTo1.setText("À");
        getContentPane().add(textTo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void selectFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFromActionPerformed
        // TODO add your handling code here:
        String selectedUnit = (String) selectFrom.getSelectedItem();
        Convertisseur.tempFrom = selectedUnit;
    }//GEN-LAST:event_selectFromActionPerformed

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
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> selectFrom;
    private javax.swing.JComboBox<String> selectTo;
    private javax.swing.JLabel textFrom;
    private javax.swing.JTextField textTemp;
    private javax.swing.JLabel textTo;
    private javax.swing.JLabel textTo1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
