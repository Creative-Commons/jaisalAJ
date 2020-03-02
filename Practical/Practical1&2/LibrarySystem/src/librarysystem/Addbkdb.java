/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;
import java.sql.*;
/**
 *
 * @author Prathamesh
 */
public class Addbkdb {
    public static int save(String code,String bname,String baut,int bqty){
	int status=0;
	try{
            Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","vishu123");
		PreparedStatement ps=con.prepareStatement("insert into books(code,bname,baut,bqty) values(?,?,?,?)");
		ps.setString(1,code);
		ps.setString(2,bname);
		ps.setString(3,baut);
		ps.setInt(4,bqty);
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
}
