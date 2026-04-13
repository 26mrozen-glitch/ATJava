// I used ChatGPT and online resources to help understand the overall structure and requirements of this multi-part project, including how to represent a yard using a 2D array, how to design the Mower class with movement and direction, and how to implement methods that allow the mower to interact with the yard. I also used these resources to better understand how to animate the program and develop the algorithm for the mower’s decision-making process, including randomizing its starting position and updating its movement to mow the lawn efficiently. Using this guidance, I wrote, organized, and adjusted the final code myself to meet all the requirements of Parts A, B, and C.

package Mow;

import java.util.Random;

public class Mower {

    // Position of the mower
    private int row;
    private int col;

    // Direction: 0=up, 1=right, 2=down, 3=left
    private int direction;

    // Constructor
    public Mower(int row, int col, int direction) {
        this.row = row;
        this.col = col;
        this.direction = direction;
    }

    // Getters and Setters
    public int getRow() { return row; }
    public void setRow(int row) { this.row = row; }

    public int getCol() { return col; }
    public void setCol(int col) { this.col = col; }

    public int getDirection() { return direction; }
    public void setDirection(int direction) { this.direction = direction; }

    // Move forward one unit in the current direction
    public void moveForward() {
        switch (direction) {
            case 0 -> row--;    // up
            case 1 -> col++;    // right
            case 2 -> row++;    // down
            case 3 -> col--;    // left
        }
    }

    // Turn left (counterclockwise)
    public void turnLeft() {
        direction = (direction + 3) % 4;
    }

    // Turn right (clockwise)
    public void turnRight() {
        direction = (direction + 1) % 4;
    }

    // Sense what is one unit in front of the mower
    public char senseForward(Yard yard) {
        int nextRow = row;
        int nextCol = col;

        switch (direction) {
            case 0 -> nextRow--;   // up
            case 1 -> nextCol++;   // right
            case 2 -> nextRow++;   // down
            case 3 -> nextCol--;   // left
        }

        return yard.getCell(nextRow, nextCol);
    }

    // Cut the grass under the mower
    public void cutGrass(Yard yard) {
        yard.setCell(row, col, ' ');
    }

// Returns a character representing the mower's direction
public char getDirectionChar() {
    return switch (direction) {
        case 0 -> '^';
        case 1 -> '>';
        case 2 -> 'v';
        case 3 -> '<';
        default -> '?';
    };
}
// PART C
public void randomize(Yard yard) {
        Random rand = new Random();

        int maxRow = yard.getLawnHeight();
        int maxCol = yard.getLawnWidth();

        int corner = rand.nextInt(4);

        if (corner == 0) { row = 1; col = 1; }
        else if (corner == 1) { row = 1; col = maxCol; }
        else if (corner == 2) { row = maxRow; col = 1; }
        else { row = maxRow; col = maxCol; }

        direction = rand.nextInt(4);
    }

    // helper method (also inside Mower)
    private char look(int dir, Yard yard) {
        int r = row;
        int c = col;

        if (dir == 0) r--;
        else if (dir == 1) c++;
        else if (dir == 2) r++;
        else if (dir == 3) c--;

        return yard.getCell(r, c);
    }

    public boolean updateMower(Yard yard) {

        // cut current spot
        if (yard.getCell(row, col) == '+') {
            cutGrass(yard);
            return true;
        }

        // forward
        if (look(direction, yard) == '+') {
            moveForward();
            return true;
        }

        // right
        int rightDir = (direction + 1) % 4;
        if (look(rightDir, yard) == '+') {
            turnRight();
            moveForward();
            return true;
        }

        // left
        int leftDir = (direction + 3) % 4;
        if (look(leftDir, yard) == '+') {
            turnLeft();
            moveForward();
            return true;
        }

        return false; // done
    }
}

