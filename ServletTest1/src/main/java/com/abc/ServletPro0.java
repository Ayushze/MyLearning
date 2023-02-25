package com.abc;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;


public class ServletPro0 extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //out.println("<h1>This is the http do-post method</h1>");
        String Username = request.getParameter("Username");
        String Password = request.getParameter("Password");
        String Email = request.getParameter("Email");
        String user_gender = request.getParameter("user_gender");
        String Course = request.getParameter("Course");
        String Condition = request.getParameter("Condition");
       // out.println(Condition); //to check that what value Condition will give or if Condtion is working or not
        if(Condition!=null){
            if(Condition.equals("checked")){
                out.println("<h1>Name: "+Username+"</h1>");
                out.println("<h1>Password: "+Password+"</h1>");
                out.println("<h1>Email: "+Email+"</h1>");
                out.println("<h1>Gender: "+user_gender+"</h1>");
                out.println("<h1>Course: "+Course+"</h1>");
                out.println("<h1>Condition: "+Condition+"</h1>");
                //
                //JDBC
                //
                //saved to db
                //...
                RequestDispatcher rd = request.getRequestDispatcher("success");
                rd.forward(request, response);
            }
            else{
                out.println("<h1>You have not accepted T&C. Please check T&C<h1>");
            }
        }
        else{
            out.println("<h1>You have not accepted T&C. Please check T&C<h1>");
        //I want to include output of index.html
        
        //get the objrct og request dispacher
        
        RequestDispatcher  rd = request.getRequestDispatcher("index.html");
        
        //include method
        
        rd.include(request, response);
        }
    }
}