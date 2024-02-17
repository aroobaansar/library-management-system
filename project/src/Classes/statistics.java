/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author LENOVO
 */
public class statistics implements IssuedBookInt {
    boolean check;
    private String bname,semail;
     private String issue ,returns;
     private String id,author,type;
    // Books obj=new Books(issue, bname, bname, bname);

    public statistics(String bname, String semail, String issue, String returns, String id, String author, String type) {
        this.bname = bname;
        this.semail = semail;
        this.issue = issue;
        this.returns = returns;
        this.id = id;
        this.author = author;
        this.type = type;
    }


    public statistics() {
        
    }
 int flag=0;
        Statement stmt = null;
  PreparedStatement pst = null;
    ResultSet rs = null;
    DbConnection db_con = new DbConnection();
    Connection conn = db_con.GenerateConnection();
    boolean b,a = false;
    

    public void issuedbooks()
    {
       
       
        
            String sql1 = "select * from usersign where email='" + semail + "'  ";

        
        try {

            pst = conn.prepareStatement(sql1);
            rs = pst.executeQuery();
            if (rs.next()) {
                
                a = true;
            } else {
                JOptionPane.showMessageDialog(null, "Student is not registered!");
                a = false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            a = false;
        }
        
        if( a==true)
        {
          String sql2="insert into isBook(stemail,bkname,isdate,redate,ID,authname,type) values ('"+semail+"','"+bname+"',"
                  + "'"+issue+"','"+returns+"','"+id+"','"+author+"','"+type+"')";
            try
            { 
                stmt=conn.createStatement();
           
         int res = stmt.executeUpdate(sql2);
         if(res>0)
         {
              JOptionPane.showMessageDialog(null,"Issued!");
             flag=1;
           
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
        if(flag==1)
        {
            try   
       {String query="update booklist set quantity=quantity - 1 where Book ='"+bname+"' and quantity>0";
       pst=conn.prepareStatement(query);
       pst.executeUpdate();
      
            String sql33="delete from  booklist where Book= '"+bname+"' and quantity=0  ";
            try
            {
                stmt=conn.createStatement();
           
         int res = stmt.executeUpdate(sql33);
         
           
            }
            catch(Exception ex)
            {
                 JOptionPane.showMessageDialog(null,ex);
            }
       }
      // JOptionPane.showMessageDialog(null, "Added SuccessFully!");
       
       catch(Exception ex)
       {
             JOptionPane.showMessageDialog(null,ex);
       }
        }
    
    }
    public boolean search(String bname,String semail)
    {
        try{
           String query="(select * from isBook where bkname='"+bname+"' and stemail='"+semail+"')" ;
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            if (rs.next()) {
               // JOptionPane.showMessageDialog(null, "");
                 return true;
            } else {
                JOptionPane.showMessageDialog(null,"student do not have this book!");
                return false;
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"student do not have this book!");
            return false;
        }
       
    }
   
    public void deltFroIssue(String sname,String bname)
    {
          String sql="delete from  isBook where stemail= '"+sname+"' and bkname='"+bname+"'  ";
            try
            {
                stmt=conn.createStatement();
           
         int res = stmt.executeUpdate(sql);
         
           
            }
            catch(Exception ex)
            {
                 JOptionPane.showMessageDialog(null,ex);
            }
    }
    public void updtReturn(String semail,String bname ,String redate,int fine)
    {
        String query="insert into reBook (stemail,bname,redate,fine) values ('"+semail+"','"+bname+"','"+redate+"','"+fine+"')";
        try {
            stmt=conn.createStatement();
            int res = stmt.executeUpdate(query);
         
          //JOptionPane.showMessageDialog(null,"added to   return");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,ex);  
        }
           }
   
    @Override
    public void viewIssued(JTable table)
{  try
            {
           stmt=conn.createStatement();
           String sql="Select * from  isBook";
         rs = stmt.executeQuery(sql);
         table.setModel(DbUtils.resultSetToTableModel(rs));
        
           
            }
            catch(Exception ex)
            {
                 JOptionPane.showMessageDialog(null,ex);
            }
   }
        
        }


