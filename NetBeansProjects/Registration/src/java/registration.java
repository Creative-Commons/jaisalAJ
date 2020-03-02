/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Prathamesh
 */
public class registration extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registration</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet registration at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        Connection con=null;
        ResultSet rs=null;
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String uid=request.getParameter("uid");
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String pwd=request.getParameter("pwd");
        String pwd1=request.getParameter("pwd1");
        String town=request.getParameter("town");
        String zipcode=request.getParameter("zip");
        String country=request.getParameter("country");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connected");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","vishu123");
            String insert="insert into register values(?,?,?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(insert);
            ps.setString(1,uid);
            ps.setString(2,fname);
            ps.setString(3,lname);
            ps.setString(4,pwd);
            ps.setString(5,pwd1);
            ps.setString(6,zipcode);
            ps.setString(7,town);
            ps.setString(8,country);
        int rowCount= ps.executeUpdate();
        out.print("<h1>Welcome");
        out.print(fname+"</h1>");
    }
    catch(Exception e){
    System.out.println(e);
}
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
