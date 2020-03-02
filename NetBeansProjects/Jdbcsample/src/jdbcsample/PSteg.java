/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcsample;

import java.sql.*;
import java.io.*;

/**
 *
 * @author Prathamesh
 */
public class PSteg {
    public static void main(String[] args)throws SQLException{
        try{
    Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","vishu123");
            //Statement st=con.createStatement();
            //create table
            /*String s="create table student(rollno int primary key,name varchar(10),class varchar(10))";
            st.executeUpdate(s);
            System.out.println("Table created successfully");*/
            
            //insert
            
          /*String s1="insert into student values(?,?,?)";
          PreparedStatement ps=con.prepareStatement(s1);*/
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            /*System.out.println("Enter rollno");
            int rno=Integer.parseInt(br.readLine());
            System.out.println("Enter name");
            String sname=br.readLine();
            System.out.println("Enter class");
            String cls=br.readLine();
            ps.setInt(1,rno);
            ps.setString(2,sname);
            ps.setString(3,cls);
            ps.executeUpdate();
            System.out.println("\n\t Record saved...");*/
            
            //delete
           /* String s2="delete from student where rollno=?";
            PreparedStatement ps1=con.prepareStatement(s2);
            System.out.println("Enter a rollno to delete");
            int rn=Integer.parseInt(br.readLine());
            ps1.setInt(1, rn);
            int count=ps1.executeUpdate();
            System.out.println("\n\t Record deleted: "+count);*/
            
            //update
            String s3="update student set name=? where rollno=?";
            PreparedStatement ps=con.prepareStatement(s3);
            System.out.println("enter the roll no of student for update");
            int r=Integer.parseInt(br.readLine());
            System.out.println("Enter name to update");
            String sn=br.readLine();
                    ps.setString(2,sn);
                    ps.setInt(1,2);
            ps.executeUpdate();
            System.out.println("\n\t, Record updated: ");
          
            
            
            
            
}
    catch(Exception e){
    System.out.println("Error1:"+e.getMessage());
}}
}