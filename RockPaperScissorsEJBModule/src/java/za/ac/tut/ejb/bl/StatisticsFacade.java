/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import java.util.Random;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.entities.Statistics;

/**
 *
 * @author Ryan
 */
@Stateless
public class StatisticsFacade extends AbstractFacade<Statistics> implements StatisticsFacadeLocal {

    @PersistenceContext(unitName = "TextSpectaclesP24BEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StatisticsFacade() {
        super(Statistics.class);
    }

    @Override
    public String getSign() {
        String[] signs = {"Rock", "Paper", "Scissor"};
        Random ran = new Random();
        int index = ran.nextInt(3);
        return signs[index];
    }

    @Override
    public List<Statistics> playersWhoWon() {
        String queryStr = "SELECT s FROM Statistics s WHERE s.cntWon > s.cntLost";
        Query query = em.createQuery(queryStr);
        List<Statistics> list = query.getResultList();
        return list;
    }

    @Override
    public String determineOutcome(String siriSign, String playerSign) {
        String result = "Lost";
        if(playerSign.equalsIgnoreCase(siriSign)){
            result = "Tied";
        }else if(playerSign.equalsIgnoreCase("Rock") && siriSign.equalsIgnoreCase("Scissor")){
            result = "Won";
        }else if(playerSign.equalsIgnoreCase("Paper") && siriSign.equalsIgnoreCase("Rock")){
            result = "Won";
        }else if(playerSign.equalsIgnoreCase("Scissor") && siriSign.equalsIgnoreCase("Paper")){
            result = "Won";
        }
        return result;
    }
    
}
