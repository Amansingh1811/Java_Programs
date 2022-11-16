// insert data dynamic mode

package com.learing.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class pre_state_insert_dyn {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Employee";
            String username = "root";
            String pass = "Rashu@2022";
            Connection con = DriverManager.getConnection(url,username,pass);
            String q = "insert into table1(empName,empAddress) value(?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name;");
            String name = read.readLine();
            System.out.println("Enter City;");
            String city = read.readLine();
            pstmt.setString(1,name);
            pstmt.setString(2,city);
            pstmt.executeUpdate();
            System.out.println("inserted.....");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
