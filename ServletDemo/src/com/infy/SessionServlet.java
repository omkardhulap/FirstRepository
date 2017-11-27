/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.infy;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Divya_Tantri
 */
public class SessionServlet extends HttpServlet {
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
         response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session  = request.getSession();
        Integer i =null;
        i = (Integer) session.getAttribute("counts");
        if(i==null){
            i=new Integer(1);
        }else{
            i=new Integer(i.intValue()+1);
        }
        session.setAttribute("counts", i);
        out.println("You are visitor number  = "+i.intValue());
        out.close();
    } 

 
}
