/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import Classes.Books;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Delete_Book extends javax.swing.JFrame {
Books book=new Books();
    /**
     * Creates new form Delete_Book
     */
    public Delete_Book() {
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

        dltbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        bookTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dltbtn.setBackground(new java.awt.Color(255, 255, 255));
        dltbtn.setFont(new java.awt.Font("Bell MT", 3, 24)); // NOI18N
        dltbtn.setText("Delete");
        dltbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dltbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltbtnActionPerformed(evt);
            }
        });
        getContentPane().add(dltbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 630, -1, -1));

        jLabel1.setFont(new java.awt.Font("Bell MT", 3, 48)); // NOI18N
        jLabel1.setText("Delete Book");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 280, 70));

        idTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        idTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTxtActionPerformed(evt);
            }
        });
        getContentPane().add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 330, 60));

        bookTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(bookTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 330, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/backkkk-removebg-preview.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 90, 40));

        jLabel2.setFont(new java.awt.Font("Bell MT", 3, 36)); // NOI18N
        jLabel2.setText("Book Id:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 150, 32));

        jLabel3.setFont(new java.awt.Font("Bell MT", 3, 36)); // NOI18N
        jLabel3.setText("Book Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 220, 32));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Documents\\Zoom\\confirm.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTxtActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        dispose();
        new BookManage().setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void dltbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltbtnActionPerformed
        // TODO add your handling code here:

        if(bookTxt.getText().isEmpty()|| idTxt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please fill all column");
        }
        else{
            book.deleteBook(bookTxt.getText(),idTxt.getText());
            dispose();
            new     BookManage().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_dltbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Delete_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookTxt;
    private javax.swing.JButton dltbtn;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
