
package model;

import java.sql.*;

public class UserModel {
    private String uname, pass;

    public UserModel(String uname, String pass) {
        this.uname = uname;
        this.pass = pass;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public boolean insert()
    {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/UserAccounts");
            Statement s = c.createStatement();
            s.executeUpdate("INSERT INTO UserAccounts values('" + getUname() + "','" + getPass() + "')");
            return s.executeQuery("SELECT COUNT(*) FROM UserAccounts").getInt(1) > 0;
        } catch(Exception e) {
            System.out.println(e);
        }
        
        return false;
    }
    
    
}
