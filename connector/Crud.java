
package com.softapple.crud.connector;

import java.sql.Connection;
import java.sql.Statement;

public class Crud {
    
    
    
    public static boolean saveStudent(){
        Connection connection = MyJdbcConnection.provideConnection();
        try{
            Statement stm = connection.createStatement(); 
            stm.executeUpdate("insert into student (student_name, student_roll) values ('Abdullah',3)");
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }  
    }
    
    public static void main(String[] args) {
       if(saveStudent()){
           System.out.println("Data inserted successfully!");
       }else{
           System.out.println("Sorry! something is wrong");
       }
    }
    
    
}
