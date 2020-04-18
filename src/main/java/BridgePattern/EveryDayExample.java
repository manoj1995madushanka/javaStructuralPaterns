package BridgePattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EveryDayExample {
    public void createTable(){
        Connection conn = null;
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            String url = "jdbc:derby:memory:codejava/webdb;create=true";
            conn = DriverManager.getConnection(url);
            Statement sta = conn.createStatement();
            sta.executeUpdate("Create table Address(ID INT,Name VARCHAR)");
            System.out.println("table created");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
