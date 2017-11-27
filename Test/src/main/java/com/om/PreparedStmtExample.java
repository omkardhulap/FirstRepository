package com.om;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStmtExample {

    public static void main(String args[]) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
        PreparedStatement preStatement = conn.prepareStatement("select * from nrtprod.defect where snow_id=?");
        preStatement.setString(1, "DFCT0011786");
    
        ResultSet result = preStatement.executeQuery();
      
        while(result.next()){
            System.out.println("Defect ID: " + result.getString("defect_id"));
        }       
    }
} 

//Read more: http://javarevisited.blogspot.com/2012/03/why-use-preparedstatement-in-java-jdbc.html#ixzz47EKWWPzO