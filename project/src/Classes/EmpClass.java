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
public class EmpClass {
    Statement stmt = null;
  PreparedStatement pst = null;
    ResultSet rs = null;
    DbConnection db_con = new DbConnection();
    Connection conn = db_con.GenerateConnection();
    boolean b;

    public void addEmp(String name ,String sName ,String email,String phone,
            String address ,String pass,String cnic,String photo )
    {
        String sql="insert into empDetail(fname,lname,contact,email,cnic,address,pswd,photo) values"
                + " ('"+name+"','"+sName+"','"+phone+"','"+email+"','"+cnic+"','"+address+"','"+pass+"','"+photo+"')";
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
    public void deleteEmployee(String email ,String cnic)
    {
          String sql="delete from  empDetail where email= '"+email+"' and cnic='"+cnic+"'  ";
            try
            {
                stmt=conn.createStatement();
           
         int res = stmt.executeUpdate(sql);
         if(res>0)
         {
              JOptionPane.showMessageDialog(null," Employee Account deleted");
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
    public void updatePass(String email,String newPass)
    {
         String sql="update empDetail set pswd= '"+newPass+"' where email='"+email+"'";
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
