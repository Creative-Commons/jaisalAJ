
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
    public static List<Student> getAllStudents(){  
        List<Student> list=new ArrayList<Student>();  
          
        try{  
            Connection con=Studb.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from student");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Student s=new Student();  
                s.setRollno(rs.getString(1));  
                s.setName(rs.getString(2));  
                s.setAddress(rs.getString(3));  
                s.setclass(rs.getString(4));  
                s.setCountry(rs.getString(5));  
                list.add(s);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  

}
