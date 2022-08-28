package org.hw08_24;

public class Player {
    int health;
    int superPower;
    String color;
    int acquiredHitCounterInRow;
    String name;
    int acquiredSuperPowerCounter;
    int acquiredHitCounter;
    int hitQuantity;

    Player(String name, String color) {
        this.health = 100;
        this.superPower = 3;
        this.name = name;
        this.color = color;
    }
}
