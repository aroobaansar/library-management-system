/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Classes.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class SignupUser {
    
    Statement stmt = null;
  PreparedStatement pst = null;
    ResultSet rs = null;
    DbConnection db_con = new DbConnection();
    Connection conn = db_con.GenerateConnection();
    boolean b;
   private String name;

    public String getName() {
        return name;
    }
   
    public void adduser(String fname,String lname,String email,String pno,String dob,String pass)
        {
            
            String sql="insert into usersign(fname,lname,email,pno,dob,pswdu) values ('"+fname+"','"+lname+"','"+email+"','"+pno+"','"+dob+"','"+pass+"')";
            try
            {
                stmt=conn.createStatement();
           
         int res = stmt.executeUpdate(sql);
         if(res>0)
         {
              JOptionPane.showMessageDialog(null,"Inserted");
              b=true;
           
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
        public boolean loginStu(String stuname, String pass)
        {
            String sql = "select * from usersign where email='" + stuname + "' and pswdu='" + pass + "' ";

        boolean b;
        try {

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Succcessfully Logged IN");
                b = true;
                name=stuname;
            } else {
                JOptionPane.showMessageDialog(null, "Cannot Log In");
                b = false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            b = false;
        }
        return b;
        }
        public void updatepass(String stuname ,String oldPswd ,String newPswd)
        {
             String sql="update usersign set pswdu= '"+newPswd+"' where email='"+stuname+"' and pswdu='"+oldPswd+"' ";
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
        public void dltAcc(String uname ,String pswd)
        {
            
             String sql="delete from  usersign where pswdu= '"+pswd+"' and email='"+uname+"'  ";
            try
            {
                stmt=conn.createStatement();
           
         int res = stmt.executeUpdate(sql);
         if(res>0)
         {
              JOptionPane.showMessageDialog(null,"Account deleted");
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
