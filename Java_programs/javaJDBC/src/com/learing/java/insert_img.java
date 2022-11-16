package com.learing.java;

import java.sql.Connection;
import java.sql.DriverManager;

public class insert_img {
    public static void main(String [] args){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Rashu@2022");

        }catch (Exception e){
            System.out.println("Error...");
        }
    }
}
