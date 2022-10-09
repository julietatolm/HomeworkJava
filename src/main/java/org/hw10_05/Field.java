package org.hw10_05;

public class Field {
    private int[][] fieldCells;

    Field() {
        fieldCells = new int[CONSTANT.CELLS_NUMBER][CONSTANT.CELLS_NUMBER];
    }

    public int[][] getFieldCells() {
        return fieldCells;
    }

    //method to print the battlefield to the screen (TEST)
    public void showField() {
        for(int i = 0; i < this.fieldCells.length; i++) {
            for (int j = 0; j < this.fieldCells[i].length; j++) {
            System.out.print(this.fieldCells[i][j] + " ");
            }
            System.out.println();
        }
    }
}
