/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author LENOVO
 */
public class Books {
    private String id,name ,author,type;
    private  int quantity;

    public Books(String id, String name, String author, String type ) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.type = type;
        //this.quantity = quantity;
        //sthis.b = b;
    }

    public Books() {
    }
    
    
     Statement stmt = null;
  PreparedStatement pst = null;
    ResultSet rs = null;
    DbConnection db_con = new DbConnection();
    Connection conn = db_con.GenerateConnection();
    boolean b;
     public void addBook() 
   {
       String sql1 = "select * from booklist where Book='" + name + "' and ID='" + id + "' ";
        try {

            pst = conn.prepareStatement(sql1);
            rs = pst.executeQuery();
            if (rs.next()) {
              //  JOptionPane.showMessageDialog(null, "Succcessfully Logged IN");
                b = true;
            } else {
               // JOptionPane.showMessageDialog(null, "Cannot Log In");
                b = false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            
        }
        if (b== true){
       try   
       {String query="update booklist set quantity=quantity + 1 where Book ='"+name+"' and quantity>0";
       pst=conn.prepareStatement(query);
       pst.executeUpdate();
       JOptionPane.showMessageDialog(null, "Added SuccessFully!");}
       catch(Exception ex)
       {
             JOptionPane.showMessageDialog(null,ex);
       }}
        else{
       String sql="insert into booklist(id,Book,Author,type,quantity) values ('"+id+"','"+name+"','"+author+"','"+type+"',1)";
            try
            {
                stmt=conn.createStatement();
           
         int res = stmt.executeUpdate(sql);
         if(res>0)
         {
              JOptionPane.showMessageDialog(null,"Added Successfully!");
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
            }}
   }

            
           
       
       
      

   public void deleteBook(String bname , String Id)
   {
          String sql="delete from  booklist where Book= '"+bname+"' and ID='"+Id+"'  ";
            try
            {
                stmt=conn.createStatement();
           
         int res = stmt.executeUpdate(sql);
         if(res>0)
         {
              JOptionPane.showMessageDialog(null,"Book deleted");
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
   public void viewBooks(JTable table)
   {
       
            try
            {
           stmt=conn.createStatement();
           String sql="Select * from  booklist";
         rs = stmt.executeQuery(sql);
         table.setModel(DbUtils.resultSetToTableModel(rs));
        
           
            }
            catch(Exception ex)
            {
                 JOptionPane.showMessageDialog(null,ex);
            }
   }
   }

