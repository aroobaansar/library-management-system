/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Employee {
    Statement stmt = null;
  PreparedStatement pst = null;
    ResultSet rs = null;
    DbConnection db_con = new DbConnection();
    Connection conn = db_con.GenerateConnection();
    boolean b;
    public boolean loginEmp(String stuname, String pass)
        {
            String sql = "select * from empDetail where email='" + stuname + "' and pswd='" + pass + "' ";

       
        try {

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Succcessfully Logged IN");
                b = true;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Input!s");
                b = false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            b = false;
        }
        return b;
        }
    public void updatePass(String email,String oldPass ,String newPass)
    {
         String sql="update empDetail set pswd= '"+newPass+"' where email='"+email+"' and pswd='"+oldPass+"' ";
            try
            {
                stmt=conn.createStatement();
           
         int res = stmt.executeUpdate(sql);
         if(res>0)
         {
              JOptionPane.showMessageDialog(null,"Password Updated");
         }
         else
         {
              JOptionPane.showMessageDialog(null,"Error");
         }
           
            }
            catch(Exception ex)
            {
                 JOptionPane.showMessageDialog(null,ex);
            }
    }
}
