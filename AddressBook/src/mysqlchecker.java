
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class mysqlchecker 
{
    public static void main (String [] args) throws SQLException
    {
        /*query from  where I am getting the database*/
        String query= "SELECT `password` FROM `registration`" ;
        /*connection code with query variable passed*/
        PreparedStatement ps=DatabaseConnection.getConnection().prepareStatement(query);
        /*connection variable pass into  a Result variable*/
        ResultSet rs=ps.executeQuery();
        
         while (rs.next())
         {
             String pass=rs.getString("password");
             System.out.println(pass);
         }
         
    }
    
}
