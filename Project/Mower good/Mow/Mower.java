package Mow;

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
}