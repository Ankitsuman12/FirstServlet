/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/

package com.servlet;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
/**
 *
 * @author Guruji
 */
public class MyServlet implements Servlet{
        
        ServletConfig conf;
        
        //life cycle method
            public void init(ServletConfig con){
            this.conf=con;
                System.out.println("creat object");
        }
            public void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException {
                System.out.println("services by ankit");
                resp.setContentType("text/html");
                PrintWriter out=resp.getWriter();
                out.println("<h1> hello service method</h1>");
                out.println("<h1>Today date and time is "+new Date()+"</h1>");
                
            }
            
            public void destroy(){
                System.out.println("Destroy object");
            }
            //non life cycle method
          
    
    public ServletConfig getServletConfig() {
                return this.conf;    //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public String getServletInfo() {
        return "info "; //To change body of generated methods, choose Tools | Templates.
    }
}
