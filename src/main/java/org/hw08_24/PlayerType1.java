package org.hw08_24;

public class PlayerType1 extends Player implements Beatable{

    PlayerType1(String name, String color) {
        this.superPower = 5;
        this.minHitsToGetSuperPower = 3;
        this.name = name;
        this.color = color;
    }

}
