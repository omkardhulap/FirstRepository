/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.infy;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Divya_Tantri
 */
public class ServletContextDemo extends HttpServlet {
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ServletContext context = getServletContext();
        String guser = context.getInitParameter("globalUser");
        String gpasswd = context.getInitParameter("globalPasswd");
        
        out.println("<h3>Global parameters : uname = "+guser+" passwd  ="+gpasswd);
    } 

    
}
