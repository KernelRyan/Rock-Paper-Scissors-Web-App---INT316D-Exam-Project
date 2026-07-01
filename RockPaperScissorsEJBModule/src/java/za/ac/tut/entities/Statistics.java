/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Ryan
 */
@Entity
public class Statistics implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer cnt;
    private Integer cntLost;
    private Integer cntWon;
    private Integer cntTie;
    private List<String> siriSigns;
    private List<String> playerSigns;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    public Statistics() {
    }

    public Statistics(Long id, String name, Integer cnt, Integer cntLost, Integer cntWon, Integer cntTie, List<String> siriSigns, List<String> playerSigns, Date creationDate) {
        this.id = id;
        this.name = name;
        this.cnt = cnt;
        this.cntLost = cntLost;
        this.cntWon = cntWon;
        this.cntTie = cntTie;
        this.siriSigns = siriSigns;
        this.playerSigns = playerSigns;
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    public Integer getCntLost() {
        return cntLost;
    }

    public void setCntLost(Integer cntLost) {
        this.cntLost = cntLost;
    }

    public Integer getCntWon() {
        return cntWon;
    }

    public void setCntWon(Integer cntWon) {
        this.cntWon = cntWon;
    }

    public Integer getCntTie() {
        return cntTie;
    }

    public void setCntTie(Integer cntTie) {
        this.cntTie = cntTie;
    }

    public List<String> getSiriSigns() {
        return siriSigns;
    }

    public void setSiriSigns(List<String> siriSigns) {
        this.siriSigns = siriSigns;
    }

    public List<String> getPlayerSigns() {
        return playerSigns;
    }

    public void setPlayerSigns(List<String> playerSigns) {
        this.playerSigns = playerSigns;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Statistics)) {
            return false;
        }
        Statistics other = (Statistics) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entities.Statistics[ id=" + id + " ]";
    }
    
}
