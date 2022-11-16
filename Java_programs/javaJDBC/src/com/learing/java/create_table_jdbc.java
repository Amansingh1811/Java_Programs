package com.learing.java;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class create_table_jdbc {
    public static void main(String[] args){
        try{
//            load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
//            creating a connection
            String url = "jdbc:mysql://localhost:3306/Employee";
            String username= "root";
            String password="Rashu@2022";
            Connection con= DriverManager.getConnection(url,username,password);
            String q = "create table table1(impId int(20) primary key auto_increment, empName varchar(200) not null, empAddress varchar(200))";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("create the table...");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    }
