
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Core i3 GTX750ti
 */
import java.sql.*;
public class DatabaseConnection {
    /*a speacil static variable for connection*/
    private static Connection con=null;
    /*speacial static method for building the connection*/
    public static Connection getConnection()
    {
        /*the speacila connection is tested between this
        try and catch block
        try fail marle exception catach korbe */
        try
        {
            /*connection between DB and netbeans*/
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login_registration?useTimezone=true&serverTimezone=UTC","root","");
        }
        catch(Exception ex)
        {
            System.out.println("Erro: "+ex);
        }
        return con;
    }
    
}
