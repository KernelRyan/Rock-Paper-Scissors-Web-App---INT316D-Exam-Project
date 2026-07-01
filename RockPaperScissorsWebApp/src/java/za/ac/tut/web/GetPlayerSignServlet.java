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
public class GetPlayerSignServlet extends HttpServlet {

    @EJB StatisticsFacadeLocal sfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String playerSign = request.getParameter("playerSign");
        String siriSign = (String)session.getAttribute("siriSign");
        
        String result = sfl.determineOutcome(siriSign, playerSign);
        
        request.setAttribute("playerSign", playerSign);
        request.setAttribute("result", result);
        
        updateSession(session, playerSign, result);
        
        RequestDispatcher disp = request.getRequestDispatcher("game_outcome.jsp");
        disp.forward(request, response);
    }

    private void updateSession(HttpSession session, String playerSign, String result) {
        List<String> playerSigns = (List<String>)session.getAttribute("playerSigns");
        playerSigns.add(playerSign);
        Integer cnt = (Integer)session.getAttribute("cnt");
        Integer cntLost = (Integer)session.getAttribute("cntLost");
        Integer cntWon = (Integer)session.getAttribute("cntWon");
        Integer cntTie = (Integer)session.getAttribute("cntTie");
        
        if(result.equalsIgnoreCase("Lost")){
            cntLost++;
        }else if(result.equalsIgnoreCase("Won")){
            cntWon++;
        }else{
            cntTie++;
        }
        cnt++;
        
        session.setAttribute("cnt", cnt);
        session.setAttribute("cntLost", cntLost);
        session.setAttribute("cntWon", cntWon);
        session.setAttribute("cntTie", cntTie);
    }
}
