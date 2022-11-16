package com.learing.java;

import java.sql.*;
class jdbc{
    public static void main(String arg[]){
        try{
//            load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
//            creating a connection
            String url = "jdbc:mysql://localhost:3306/Employee";
            String username= "root";
            String password="Rashu@2022";
            Connection con= DriverManager.getConnection(url,username,password);
            if (con.isClosed()){
                System.out.println("Connection is closed");
            }else{
                System.out.println("connection is open");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}