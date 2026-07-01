/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.ejb.bl.StatisticsFacadeLocal;

/**
 *
 * @author Ryan
 */
public class GetSiriSignServlet extends HttpServlet {

    @EJB StatisticsFacadeLocal sfl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        String siriSign = sfl.getSign();
        
        updateSession(session, siriSign);
        
        RequestDispatcher disp = request.getRequestDispatcher("get_player_sign.jsp");
        disp.forward(request, response);
    }

    private void updateSession(HttpSession session, String siriSign) {
        List<String> siriSigns = (List<String>)session.getAttribute("siriSigns");
        
        siriSigns.add(siriSign);
        session.setAttribute("siriSign", siriSign);
    }
    
    
}
