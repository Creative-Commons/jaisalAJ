/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcsample;
import java.io.*;
import java.sql.*;
/*import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.SQLException;*/

/**
 *
 * @author Prathamesh
 */
public class Jdbcsample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","vishu123");
            Statement st= con.createStatement();
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter deptno");
            int no=Integer.parseInt(br.readLine());
            System.out.println("Enter deptname");
            String dname=br.readLine();
            System.out.println("Enter deptlocation");
            String loc=br.readLine();
            
            String sql1="insert into dept values('"+no+"','"+dname+"','"+loc+"')";
            st.executeUpdate(sql1);
            System.out.println("\n\t Record saved...");
            ResultSet rs=st.executeQuery("select * from dept");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            
           
            con.close();
        }
        catch(Exception e){
            System.out.println("Error1:"+e.getMessage());
        }
    }
    
}
