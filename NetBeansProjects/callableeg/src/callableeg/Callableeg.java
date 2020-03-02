/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callableeg;
import java.sql.*;
/**
 *
 * @author Prathamesh
 */
public class Callableeg {

    /**
     * @param args the command line arguments
     */
      
   public static void main(String[] args) throws SQLException{
   
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","vishu123");

      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      String sql = "{call getStuName (?, ?)}";
     CallableStatement stmt = conn.prepareCall(sql);
      
      //Bind IN parameter first, then bind OUT parameter
      int stuID = 1;
      stmt.setInt(1, stuID); // This would set ID as 102
      // Because second parameter is OUT so register it
      stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
      
      //Use execute method to run stored procedure.
      System.out.println("Executing stored procedure..." );
      stmt.execute();

      //Retrieve employee name with getXXX method
      String stuName = stmt.getString(2);
      System.out.println("Student Name with Rollno:" + 
               stuID + " is " + stuName);
      stmt.close();
      conn.close();
   }catch(Exception e){
      //Handle errors for JDBC
      System.out.println("Error:"+e.getMessage());
   }
    }
}
