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
import Classes.DbConnection;
import java.sql.*;



public class BookManage extends javax.swing.JFrame {

    
    DbConnection con_b=new  DbConnection();
    
    /**
     * Creates new form BookManage
     */
    public BookManage() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        addbookbtn = new javax.swing.JButton();
        viewbookbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Bell MT", 3, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\dbookkks.png")); // NOI18N
        jButton1.setText("DELETE BOOK");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 204), null));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, 289, 80));

        addbookbtn.setBackground(new java.awt.Color(255, 255, 255));
        addbookbtn.setFont(new java.awt.Font("Bell MT", 3, 24)); // NOI18N
        addbookbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/addboooks.jpg"))); // NOI18N
        addbookbtn.setText("ADD BOOK");
        addbookbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 255), null));
        addbookbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addbookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbookbtnActionPerformed(evt);
            }
        });
        jPanel1.add(addbookbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 550, 289, 78));

        viewbookbtn.setBackground(new java.awt.Color(255, 255, 255));
        viewbookbtn.setFont(new java.awt.Font("Bell MT", 3, 24)); // NOI18N
        viewbookbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\bookslists.jpg")); // NOI18N
        viewbookbtn.setText("LIST OF BOOKS");
        viewbookbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 255), null));
        viewbookbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewbookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbookbtnActionPerformed(evt);
            }
        });
        jPanel1.add(viewbookbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 660, 289, 80));

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 70, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/backkkk-removebg-preview.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bell MT", 3, 48)); // NOI18N
        jLabel3.setText("Books");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 190, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Documents\\Zoom\\promise.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 1240, 940));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewbookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbookbtnActionPerformed
        // TODO add your handling code here:
       con_b.GenerateConnection();
       
       new Book_List().setVisible(true);
    }//GEN-LAST:event_viewbookbtnActionPerformed

    private void addbookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbookbtnActionPerformed
        // TODO add your handling code here:
      dispose();
     new  AddBook().setVisible(true);
    }//GEN-LAST:event_addbookbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new Delete_Book().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(BookManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookManage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbookbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton viewbookbtn;
    // End of variables declaration//GEN-END:variables
}
