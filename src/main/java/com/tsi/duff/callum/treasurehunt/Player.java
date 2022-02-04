package com.tsi.duff.callum.treasurehunt;

import java.util.Scanner;

public class Player {
    Scanner userInput = new Scanner(System.in);
    public int[] playerPosition = new int[2];
    public String name = "Cal";
    public static int posX = 0;
    public static int posY = 0;

    public Player() {
    }

    public String getName() {
        return name;
    }

    public int[] setPlayerPosition(int PosX, int PosY) {
        playerPosition[0] = PosX;
        playerPosition[1] = PosY;
        return playerPosition;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void goNorth() {
        Player.posY = posY + 1;
        if (Player.posY > 2) {
            Player.posY = 0;
        }
    }
    public void goSouth() {
        Player.posY = posY - 1;
        if (Player.posY < 0) {
            Player.posY = 2;
        }
    }

    public void goWest() {
        Player.posX = posX - 1;
        if (Player.posX < 0) {
            Player.posX = 2;
        }
    }

    public void goEast() {
        Player.posX = posX + 1;
        if (Player.posX > 2) {
            Player.posX = 0;
        }

    }
}