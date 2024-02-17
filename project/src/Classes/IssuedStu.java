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
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import project.Login_Stu;

/**
 *
 * @author LENOVO
 */
public class IssuedStu  implements IssuedBookInt{
   SignupUser email=new SignupUser();
   Statement stmt = null;
  PreparedStatement pst = null;
    ResultSet rs = null;
    DbConnection db_con = new DbConnection();
    Connection conn = db_con.GenerateConnection();
     boolean b;
@Override
    public void viewIssued(JTable table)
{ try
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
