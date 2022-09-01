package org.hw08_24;

public class PlayerType2 extends Player implements Beatable {

    PlayerType2(String name, String color) {
        this.superPower = 3;
        this.minHitsToGetSuperPower = 2;
        this.name = name;
        this.color = color;
    }
}
