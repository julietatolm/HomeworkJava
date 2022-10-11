package org.hw10_05;

public enum Ships {
    SINGLE_DECK(1,4),
    DOUBLE_DECK(2,3),
    TRIPLE_DECK(3,2),
    QUADRIPLE_DECK(4,1);

    int numOfDecks;
    int numOfShips;

    Ships(int numOfDecks, int numOfShips) {
    }
}
