package Classes;


import java.sql.*;
import javax.swing.JOptionPane;

public class DbConnection {
Connection conn = null;
    public Connection GenerateConnection() {
        

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\LENOVO\\Documents\\pj.accdb");
           // JOptionPane.showMessageDialog(null, "Connection esatblished");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
           
        }
        return conn;
    }
}
