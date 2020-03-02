/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;  
import java.io.*;
/**
 *
 * @author Prathamesh
 */
public class StoreImg {
        
public static void main(String[] args) {  
    String filepath="D:/swing/ok.png";
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/java","root","vishu123");  
              
PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");  
ps.setString(1,"ok");  
  
FileInputStream fin=new FileInputStream(filepath);  
ps.setBinaryStream(2,fin);  
//InputStream inputStream = new FileInputStream(new File(filepath));
 
            //ps.setBlob(2, inputStream);
int i=ps.executeUpdate();  
System.out.println(i+" records affected");  
          
con.close();  
}catch (Exception e) {e.printStackTrace();}  
}  
}  

