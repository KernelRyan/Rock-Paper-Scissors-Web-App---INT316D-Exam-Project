/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ryan
 */
public class StartSessionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        Long id = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("name");
        
        initializeSession(session, id, name);
        
        RequestDispatcher disp = request.getRequestDispatcher("menu.jsp");
        disp.forward(request, response);
    }

    private void initializeSession(HttpSession session, Long id, String name) {
        session.setAttribute("id", id);
        session.setAttribute("name", name);
        
        Integer cnt = 0;
        Integer cntLost = 0;
        Integer cntWon = 0;
        Integer cntTie = 0;
        List<String> siriSigns = new ArrayList<>();
        List<String> playerSigns = new ArrayList<>();
        
        session.setAttribute("cnt", cnt);
        session.setAttribute("cntLost", cntLost);
        session.setAttribute("cntWon", cntWon);
        session.setAttribute("cntTie", cntTie);
        session.setAttribute("siriSigns", siriSigns);
        session.setAttribute("playerSigns", playerSigns);
    }

}
