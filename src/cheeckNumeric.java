
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Momena Akter
 */
public class cheeckNumeric {
    public static void main (String [] args)
    {
        Scanner pk = new Scanner (System.in);
        
        System.out.println("Enter Something to check int or not");
        String str=pk.next();
        
        
        try
        {
            Integer.parseInt(str);
            System.out.println("Integer");
            JOptionPane.showMessageDialog(null,"Integer");
        }
        catch(NumberFormatException e)
        {
                System.out.println("Non Integer");
                JOptionPane.showMessageDialog(null,"Non - Integer");
        }
    }
    
}
