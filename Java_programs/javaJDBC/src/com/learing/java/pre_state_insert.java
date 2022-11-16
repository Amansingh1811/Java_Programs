// insert data static mode

package com.learing.java;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class pre_state_insert {
    public static void main(String args[]) {
        try{
            //            load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
//            creating a connection
            String url = "jdbc:mysql://localhost:3306/Employee";
            String username= "root";
            String password="Rashu@2022";
            Connection con= DriverManager.getConnection(url,username,password);
            String q = "insert into table1(empName,empAddress) values (?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1, "Aman Singh");
            pstmt.setString(2, "  241302");
            pstmt.executeUpdate();
            System.out.println("Inserted");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
