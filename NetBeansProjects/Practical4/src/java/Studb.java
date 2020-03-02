
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prathamesh
 */
public class Studb {
    public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","vishu123");  
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int save(Student s){  
        int status=0;  
        try{  
            Connection con=Studb.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into student(rollno,name,address,class,country) values (?,?,?,?,?)");  
            ps.setString(1,s.getRollno());
            ps.setString(2,s.getName());  
            ps.setString(3,s.getAddress());  
            ps.setString(4,s.getclass());  
            ps.setString(5,s.getCountry());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    
}
