package bank.management.system;

import java.sql.*;
public class Conn {
    //public static Conn con1;
    Connection connection;
    Statement statement;

    public Conn(){
        try {
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","vivinvivin");
            statement= connection.createStatement();
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}