/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.infy;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Divya_Tantri
 */
public class FormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("Inside the doGet Method<br>");
        String name = request.getParameter("uname");
        int age = Integer.parseInt(request.getParameter("age"));
        String hobbies[] = request.getParameterValues("hobbies");
        out.println("<br>Name  = "+name);
        out.println("<br>Age = "+age);
        out.println("<br>Hobbies are : ");
        for(String a : hobbies){
            out.println(a+",");
        }
        out.close();
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Inside the doPost Method<br>");
        String name = request.getParameter("uname");
        int age = Integer.parseInt(request.getParameter("age"));
        String hobbies[] = request.getParameterValues("hobbies");
        out.println("<br>Name  = "+name);
        out.println("<br>Age = "+age);
        out.println("<br>Hobbies are : ");
        for(String a : hobbies){
            out.println(a+",");
        }
        out.close();
    }

}
