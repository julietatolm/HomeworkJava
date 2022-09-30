package org.hw09_19;

public enum Suits {
    CLUBS("clubs"),
    DIAMONDS("diamonds"),
    HEARTS("hearts"),
    SPADES("spades");

    private String name;

    Suits(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
