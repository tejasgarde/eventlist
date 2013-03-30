package com.soule.evtm.domain;
// Generated Mar 26, 2013 12:06:17 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Guestlist generated by hbm2java
 */
public class Guestlist  implements java.io.Serializable {


     private int guestListId;
     private Event event;
     private String guestListName;
     private Date createdon;
     private Date modifiedon;
     private Set guestlistmaps = new HashSet(0);
     private Set guestevents = new HashSet(0);

    public Guestlist() {
    }

	
    public Guestlist(int guestListId, String guestListName, Date createdon, Date modifiedon) {
        this.guestListId = guestListId;
        this.guestListName = guestListName;
        this.createdon = createdon;
        this.modifiedon = modifiedon;
    }
    public Guestlist(int guestListId, Event event, String guestListName, Date createdon, Date modifiedon, Set guestlistmaps, Set guestevents) {
       this.guestListId = guestListId;
       this.event = event;
       this.guestListName = guestListName;
       this.createdon = createdon;
       this.modifiedon = modifiedon;
       this.guestlistmaps = guestlistmaps;
       this.guestevents = guestevents;
    }
   
    public int getGuestListId() {
        return this.guestListId;
    }
    
    public void setGuestListId(int guestListId) {
        this.guestListId = guestListId;
    }
    public Event getEvent() {
        return this.event;
    }
    
    public void setEvent(Event event) {
        this.event = event;
    }
    public String getGuestListName() {
        return this.guestListName;
    }
    
    public void setGuestListName(String guestListName) {
        this.guestListName = guestListName;
    }
    public Date getCreatedon() {
        return this.createdon;
    }
    
    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }
    public Date getModifiedon() {
        return this.modifiedon;
    }
    
    public void setModifiedon(Date modifiedon) {
        this.modifiedon = modifiedon;
    }
    public Set getGuestlistmaps() {
        return this.guestlistmaps;
    }
    
    public void setGuestlistmaps(Set guestlistmaps) {
        this.guestlistmaps = guestlistmaps;
    }
    public Set getGuestevents() {
        return this.guestevents;
    }
    
    public void setGuestevents(Set guestevents) {
        this.guestevents = guestevents;
    }




}


