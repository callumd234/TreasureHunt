package com.tsi.duff.callum.treasurehunt;

public class Room {
    public boolean alejandroRoom = false;
    public boolean mattRoom = false;
    public boolean samRoom = false;
    public boolean bugmanRoom = false;
    public boolean entryRoom = false;
    public boolean treasureRoom = false;
    public boolean tyRoom = false;
    public boolean emptyRoom = false;
    public boolean ghostRoom = false;

    public String isSamRoom() {
        return "Be careful I love to speed";
    }

    public void setSamRoom(boolean samRoom) {
        this.samRoom = samRoom;
    }

    public String isBugmanRoom() {
        return "Have you come to see why they call me the bugman?";
    }

    public void setBugmanRoom(boolean bugmanRoom) {
        this.bugmanRoom = bugmanRoom;
    }

    public String isEntryRoom() {
        return "Welcome to the haunted cohort";
    }

    public void setEntryRoom(boolean entryRoom) {
        this.entryRoom = entryRoom;
    }

    public String isTreasureRoom() {
        return "Congratulations you have won 100 billion points for bug boys";
    }

    public void setTreasureRoom(boolean treasureRoom) {
        this.treasureRoom = !treasureRoom;
    }

    public String isTyRoom() {
        return "Have you any jaffa cakes for me?";
    }

    public String setTyRoom(boolean tyRoom) {
        this.tyRoom = tyRoom;
    }

    public String isEmptyRoom() {
        return "unlucky you found nothing";
    }

    public void setEmptyRoom(boolean emptyRoom) {
        this.emptyRoom = emptyRoom;
    }

    public String isGhostRoom() {
        return "There is no one in here apart from lost souls. By the way if you go in Alejandros room can you tell him to turn that racket off";
    }

    public void setGhostRoom(boolean ghostRoom) {
        this.ghostRoom = ghostRoom;
    }

    public String isAlejandroRoom() {
        return "Welcome peasant now you must listen to me dj. I hope you like drum and bass muahahahahaha";
    }

    public void setAlejandroRoom(boolean alejandroRoom) {
        this.alejandroRoom = alejandroRoom;
    }

    public String isMattRoom() {
        return "I have the nicest legs in town, ask Brendan";
    }

    public void setMattRoom(boolean mattRoom) {
        this.mattRoom = mattRoom;
    }




}