package org.hw10_05_seabattle;

public enum Ships {
    QUADRUPLE_DECK(4,1, "Quadruple deck ship"),
    TRIPLE_DECK(3,2, "Triple deck ship"),
    DOUBLE_DECK(2,3, "Double deck ship"),
    SINGLE_DECK(1,4, "Single deck ship");

    private int numOfDecks;
    private int numOfShips;
    private String name;

    public int getNumOfDecks() {
        return numOfDecks;
    }

    public int getNumOfShips() {
        return numOfShips;
    }

    public String getName() {
        return name;
    }


    Ships(int numOfDecks, int numOfShips, String name) {
        this.numOfDecks = numOfDecks;
        this.numOfShips = numOfShips;
        this.name = name;
    }

    public static int getTotalShips(){
        int total = 0;
       for (Ships ships : Ships.values()) {
           total = total + ships.getNumOfShips();
       }
        return total;
    }
}
