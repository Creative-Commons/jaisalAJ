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
public class retrieveimg {
    
	public static void main(String[] args){
		System.out.println("Retrive Image Example!");
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","vishu123");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select photo from imgtable");
			int i = 0;
			while (rs.next()) {
				InputStream in = rs.getBinaryStream(2);
				OutputStream f = new FileOutputStream(new File("test"+i+".png"));
				i++;
				int c = 0;
				while ((c = in.read()) > -1) {
					f.write(c);
				}
				f.close();
				in.close();
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}}
