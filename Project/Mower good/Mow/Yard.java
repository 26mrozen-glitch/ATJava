// I used ChatGPT and online resources to better understand how to model a 2D array for the yard, create the red brick borders, and structure the class with appropriate methods. I then implemented the solution myself based on that understanding.

package Mow;

public class Yard {

    private char[][] yard;

    // Constructor
    public Yard(int lawnHeight, int lawnWidth) {
        int totalHeight = lawnHeight + 2;
        int totalWidth = lawnWidth + 2;

        yard = new char[totalHeight][totalWidth];

        for (int i = 0; i < totalHeight; i++) {
            for (int j = 0; j < totalWidth; j++) {

                // Border = red bricks
                if (i == 0 || i == totalHeight - 1 || j == 0 || j == totalWidth - 1) {
                    yard[i][j] = 'R';
                } 
               
                else {
                    yard[i][j] = '+';
                }
            }
        }
    }

    // Returns value at a specific cell
    public char getCell(int row, int col) {
        return yard[row][col];
    }

    // Updates value at a specific cell
    public void setCell(int row, int col, char value) {
        yard[row][col] = value;
    }

    // Returns lawn height (excluding borders)
    public int getHeight() {
        return yard.length - 2;
    }

    // Returns lawn width (excluding borders)
    public int getWidth() {
        return yard[0].length - 2;
    }

    public void printYard() {
        for (int i = 0; i < yard.length; i++) {
            for (int j = 0; j < yard[0].length; j++) {
                System.out.print(yard[i][j]);
            }
            System.out.println();
        }
    }
}

