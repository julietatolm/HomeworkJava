package org.hw10_05;

public class SeaBattle {

    public static void main(String[] args) {
        System.out.println("Welcome to the Sea Battle!");
        Player player1 = new Player();
        Player player2 = new Player();

        //test
        player1.field.showField();
        player2.field.showField();

        fillPlayerField(player1.field);
        fillPlayerField(player2.field);

        startGame(player1, player2, player1.field, player2.field);
    }

    private static void fillPlayerField(Field field) {
    }

    private static void startGame(Player player1, Player player2, Field field, Field field1) {
    }


}
