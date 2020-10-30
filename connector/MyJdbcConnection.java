package com.softapple.crud.connector;
import java.sql.Connection;
import java.sql.DriverManager;

public class MyJdbcConnection {
    
    public static Connection provideConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/zakirdb", "root", "1234");
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }        
    }
    
    
//    public static void main(String[] args) {
//        if(provideConnection() != null){
//           System.out.println("Database connected successfully!"); 
//        }else{
//            System.out.print("Something is wrong");
//        }
//    }
    
}
