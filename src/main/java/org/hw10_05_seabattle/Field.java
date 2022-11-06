package org.hw10_05_seabattle;

import java.util.Scanner;

public class Field {
    private char[][] fieldCells;

    Field() {
        fieldCells = new char[CONSTANT.CELLS_NUMBER][CONSTANT.CELLS_NUMBER];
    }

    public char[][] getFieldCells() {
        return fieldCells;
    }

    //method to print the battlefield to the screen (TEST)
    public void showField() {
        for(int i = 0; i < this.fieldCells.length; i++) {
            for (int j = 0; j < this.fieldCells[i].length; j++) {
            System.out.print(this.fieldCells[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
    }


    public static void fillPlayerField(Player player) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player " + player.getName() + " adds the ships to the field");
        System.out.println("-----------------------------");
        int totalShips = Ships.getTotalShips();
        for (Ships ships : Ships.values()) {
            int shipCount = ships.getNumOfShips();
            int shipDecks = ships.getNumOfDecks();
            for (int i = 0; i < ships.getNumOfShips(); i++) {
                System.out.println("Total to add: " + totalShips + ". Add " + ships.getName());
                totalShips--;
                int x = 0;
                int y = 0;
                int direction = 0;
                int result = 1;
                while(result != 0) {
                    System.out.print("Input coordinate X (range 0 - 9): ");
                    x = sc.nextInt();
                    System.out.print("Input coordinate Y (range 0 - 9): ");
                    y = sc.nextInt();
                    System.out.print("Input ship direction (1 for horizontal / 2 for vertical): ");
                    direction = sc.nextInt();

                    result = Validator.validateCoordinate(player, ships, x, y, direction);
                }

                if (direction == 1) {
                    for (int k = 0; k < ships.getNumOfDecks(); k++) {
                        player.field.fieldCells[y][x+k] = '=';
                    }
                }
                if (direction == 2) {
                    for (int k = 0; k < ships.getNumOfDecks(); k++) {
                        player.field.fieldCells[y+k][x] = '=';
                    }
                }
                player.field.showField();
            }
        }


    }
}
