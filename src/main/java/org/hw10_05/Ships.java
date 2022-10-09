package org.hw10_05;

public enum Ships {
    SINGLE_DECK(4),
    DOUBLE_DECK(3),
    TRIPLE_DECK(2),
    QUADRIPLE_DECK(1);

    int numOfShips;

    Ships(int numOfShips) {
    }
}
