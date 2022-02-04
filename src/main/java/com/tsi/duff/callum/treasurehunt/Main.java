package com.tsi.duff.callum.treasurehunt;

public class Main {
    public static void main(String[] args) {
        Board hauntedHouse = new Board();

        hauntedHouse.newPlayer.setPlayerPosition(0, 1);
        hauntedHouse.treasure.setTreasurePosition(2,1);

        System.out.println(hauntedHouse.getPlayer().getPosX());
        System.out.println(hauntedHouse.getPlayer().getPosY());

    }
}
