package org.hw10_05_seabattle;

import java.util.Scanner;

public class Player {
    private String name;
    private static int numOfPlayers = CONSTANT.MAX_PLAYER_NUM;
    public Field field;

    Player() {
        if(Player.numOfPlayers <= 0) {
            System.out.println("There can be only 2 Players.");
        }
        else {
            setName();
        }
        Player.numOfPlayers--;
        this.field = new Field();
    }

    public void setName() {
        System.out.println("Please input the name of the Player " + Player.numOfPlayers);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Welcome to the game " + name);
        System.out.println("-----------------------------");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
