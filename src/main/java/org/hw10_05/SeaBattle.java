package org.hw10_05;

public class SeaBattle {

    public static void main(String[] args) {
        System.out.println("Welcome to the Sea Battle!");
        Player player1 = new Player();
        Player player2 = new Player();

        System.out.println(player1.field.getFieldCells());
        System.out.println(player1.field.getFieldCells()[0][0]);

        //test
        player1.field.showField();

    }

}
