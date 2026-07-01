/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.ejb.bl.StatisticsFacadeLocal;
import za.ac.tut.entities.Statistics;

/**
 *
 * @author Ryan
 */
public class PersistStatisticsServlet extends HttpServlet {

    @EJB StatisticsFacadeLocal sfl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Long id = (Long)session.getAttribute("id");
        String name = (String)session.getAttribute("name");
        Integer cnt = (Integer)session.getAttribute("cnt");
        Integer cntLost = (Integer)session.getAttribute("cntLost");
        Integer cntWon = (Integer)session.getAttribute("cntWon");
        Integer cntTie = (Integer)session.getAttribute("cntTie");
        List<String> siriSigns = (List<String>)session.getAttribute("siriSigns");
        List<String> playerSigns = (List<String>)session.getAttribute("playerSigns");
        
        Statistics statstics = createStatistics(id, name, cnt, cntLost, cntWon, cntTie, siriSigns, playerSigns);
        sfl.create(statstics);
        
        RequestDispatcher disp = request.getRequestDispatcher("persist_statistics_outcome.jsp");
        disp.forward(request, response);
    }

    private Statistics createStatistics(Long id, String name, Integer cnt, Integer cntLost, Integer cntWon, Integer cntTie, List<String> siriSigns, List<String> playerSigns) {
        Statistics s = new Statistics();
        s.setId(id);
        s.setName(name);
        s.setCnt(cnt);
        s.setCntLost(cntLost);
        s.setCntWon(cntWon);
        s.setCntTie(cntTie);
        s.setSiriSigns(siriSigns);
        s.setPlayerSigns(playerSigns);
        s.setCreationDate(new Date());
        return s;
    }

}
