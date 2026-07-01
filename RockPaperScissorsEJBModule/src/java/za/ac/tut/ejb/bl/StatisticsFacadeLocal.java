/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Statistics;

/**
 *
 * @author Ryan
 */
@Local
public interface StatisticsFacadeLocal {

    void create(Statistics statistics);

    void edit(Statistics statistics);

    void remove(Statistics statistics);

    Statistics find(Object id);

    List<Statistics> findAll();

    List<Statistics> findRange(int[] range);

    int count();
    
    String getSign();
    String determineOutcome(String siriSign, String playerSign);
    List<Statistics> playersWhoWon();
    
    
}
