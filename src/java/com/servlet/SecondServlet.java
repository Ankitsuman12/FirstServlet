package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class SecondServlet extends GenericServlet{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        System.out.println("Second servlet service");
        PrintWriter out=res.getWriter();
        out.println("<h1>Secount method to use service "+new Date()+"</h1>");
        //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
}
