
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class updater 
{
    public static void main(String [] args) throws SQLException
    {
        Scanner pk =new Scanner(System.in);
        System.out.println("Enter Your mail");
        String mail=pk.next();
        System.out.println("Enter Your password");
        String pass=pk.next();
        
        String query= "UPDATE `registration` SET `password`=? WHERE `mail`=? " ;
        PreparedStatement ps=DatabaseConnection.getConnection().prepareStatement(query);
        ps.setString(1, pass);
        ps.setString(2, mail);
        ps.executeUpdate();
         
       
    }
    
}
