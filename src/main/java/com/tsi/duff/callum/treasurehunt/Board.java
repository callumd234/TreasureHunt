package com.tsi.duff.callum.treasurehunt;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Board {
    Scanner userInput = new Scanner(System.in);

    Room [][] hauntedHouse;
    public Player newPlayer;
    int posX, posY;

    public Board() {
        hauntedHouse = new Board;
        newPlayer = new Player();
        newPlayer.setPlayerPosition(0, 0);

    for (posY=0; posY < hauntedHouse.length; posY++){
        for (posX = 0; posX < hauntedHouse.length;posX++){
            Room emptyRoom = new Room();
            emptyRoom.setEmptyRoom(false);
            hauntedHouse[posX][posY] = emptyRoom;
        }

    }

    do {
        Room treasureRoom = new Room();
        int posY = (int)(Math.random() * 3);
        int posX = (int)(Math.random() * 3);

        if (hauntedHouse[posX][posY].isTreasureRoom().equals(false)){
            treasureRoom.setTreasureRoom(true);
            hauntedHouse[2][2] = treasureRoom;
        }
    }

    public Player getPlayer() {
        return newPlayer;
    }

    public Board hauntedHouse(){
    String userMove = userInput.nextLine();
        System.out.println("What direction would you like to go?");
        switch (userMove){
        case "North":
            newPlayer.goNorth();
            break;
        case "South":
            newPlayer.goSouth();
            break;
        case "West":
            newPlayer.goWest();
            break;
        case "East":
            newPlayer.goEast();
            break;
        default:
            System.out.println("Pick a direction");
            break;
    }
}


}