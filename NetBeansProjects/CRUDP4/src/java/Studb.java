/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prathamesh
 */
import java.util.*;  
import java.sql.*;  

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
    public static int update(Student s){  
        int status=0;  
        try{  
            Connection con=Studb.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update student set name=?,address=?,class=?,country=? where rollno=?");  
            
            ps.setString(1,s.getName());  
            ps.setString(2,s.getAddress());  
            ps.setString(3,s.getclass());  
            ps.setString(4,s.getCountry());  
            ps.setString(5,s.getRollno());  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int delete(String rollno){  
        int status=0;  
        try{  
            Connection con=Studb.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from student where rollno=?");  
            ps.setString(1,rollno);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    public static Student getStudentByRollno(String rollno){  
        Student s=new Student();  
          
        try{  
            Connection con=Studb.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from student where rollno=?");  
            ps.setString(1,rollno);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                s.setRollno(rs.getString(1));  
                s.setName(rs.getString(2));  
                s.setAddress(rs.getString(3));  
                s.setclass(rs.getString(4));  
                s.setCountry(rs.getString(5));  
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return s;  
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
