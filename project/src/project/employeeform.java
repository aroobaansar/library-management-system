/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author LENOVO
 */
public class employeeform extends javax.swing.JFrame {

    /**
     * Creates new form employeeform
     */
    public employeeform() {
        initComponents();
           setLocation(400,100);
        setSize(1199, 868);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upodateemp = new javax.swing.JButton();
        deletemployee = new javax.swing.JButton();
        addemployee2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upodateemp.setBackground(new java.awt.Color(255, 255, 255));
        upodateemp.setFont(new java.awt.Font("Bell MT", 3, 36)); // NOI18N
        upodateemp.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Documents\\Zoom\\update pass.jpg")); // NOI18N
        upodateemp.setText("Update Password");
        upodateemp.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 204), null));
        upodateemp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upodateemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upodateempActionPerformed(evt);
            }
        });
        getContentPane().add(upodateemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 640, 410, 90));

        deletemployee.setBackground(new java.awt.Color(255, 255, 255));
        deletemployee.setFont(new java.awt.Font("Bell MT", 3, 36)); // NOI18N
        deletemployee.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\deleteemployees.jpg")); // NOI18N
        deletemployee.setText("Delete Employee");
        deletemployee.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(227, 14, 202), null));
        deletemployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletemployeeActionPerformed(evt);
            }
        });
        getContentPane().add(deletemployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 410, 90));

        addemployee2.setBackground(new java.awt.Color(255, 255, 255));
        addemployee2.setFont(new java.awt.Font("Bell MT", 3, 36)); // NOI18N
        addemployee2.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\addemployees.jpg")); // NOI18N
        addemployee2.setText("Add Employee");
        addemployee2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 51, 255), null));
        addemployee2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addemployee2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addemployee2ActionPerformed(evt);
            }
        });
        getContentPane().add(addemployee2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, 410, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/backkkk-removebg-preview.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 80, 50));

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 90, 40));

        jLabel1.setFont(new java.awt.Font("Bell MT", 3, 48)); // NOI18N
        jLabel1.setText("Dashboard");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 320, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Documents\\Zoom\\promise.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void upodateempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upodateempActionPerformed
        // TODO add your handling code here:
        dispose();
        new empupdatepass().setVisible(true);
    }//GEN-LAST:event_upodateempActionPerformed

    private void addemployee2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addemployee2ActionPerformed
        // TODO add your handling code here:
        dispose();
        new addemployee().setVisible(true);
    }//GEN-LAST:event_addemployee2ActionPerformed

    private void deletemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletemployeeActionPerformed
        // TODO add your handling code here:
        dispose();
        new deletemp().setVisible(true);
    }//GEN-LAST:event_deletemployeeActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        dispose();
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(employeeform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeeform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeeform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeeform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeeform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addemployee2;
    private javax.swing.JButton deletemployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton upodateemp;
    // End of variables declaration//GEN-END:variables
}
