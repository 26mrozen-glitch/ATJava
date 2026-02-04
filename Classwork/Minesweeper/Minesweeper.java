import java.util.Scanner;
import java.util.Random;

public class Minesweeper {

    static final int SIZE = 9;
    static final int MINES = 10;

    public static void main(String[] args) {

        char[][] map = new char[SIZE][SIZE];
        char[][] board = new char[SIZE][SIZE];

        initializeBoard(board);
        generateMap(map);

        Scanner sc = new Scanner(System.in);
        boolean gameOver = false;

        while (!gameOver) {
            clearScreen();
            printBoard(board);

            System.out.println("enter command (r row col = reveal, f row col = flag, q = quit, c = cheat):");
            String command = sc.next();

            if (command.equals("q")) {
                System.out.println("Game quit!");
                break;

            } else if (command.equals("c")) {
                printBoard(map);
                sc.nextLine(); // consume leftover newline
                System.out.println("press enter to continue...");
                sc.nextLine();

            } else if (command.equals("r") || command.equals("f")) {

                int row = sc.nextInt();
                int col = sc.nextInt();

                // bounds check
                if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
                    System.out.println("Invalid position.");
                    continue;
                }

                if (command.equals("r")) {

                    // do not reveal flagged tiles
                    if (board[row][col] == 'f') continue;

                    if (map[row][col] == 'm') {
                        board[row][col] = 'm';
                        clearScreen();
                        printBoard(board);
                        System.out.println("you hit a mine! game over.");
                        gameOver = true;
                    } else {
                        revealTile(board, map, row, col);

                        if (checkWin(board, map)) {
                            clearScreen();
                            printBoard(board);
                            System.out.println("congratulations! you cleared the board!");
                            gameOver = true;
                        }
                    }

                } else if (command.equals("f")) {

                    if (board[row][col] == '#')
                        board[row][col] = 'f';
                    else if (board[row][col] == 'f')
                        board[row][col] = '#';
                }
            }
        }

        sc.close();
    }

    // initialize board
    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                board[i][j] = '#';
    }

    // generate hidden map
    public static void generateMap(char[][] map) {
        Random rand = new Random();

        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                map[i][j] = ' ';

        int minesPlaced = 0;
        while (minesPlaced < MINES) {
            int r = rand.nextInt(SIZE);
            int c = rand.nextInt(SIZE);

            if (map[r][c] != 'm') {
                map[r][c] = 'm';
                minesPlaced++;
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == 'm') continue;

                int count = countAdjacentMines(map, i, j);
                if (count > 0)
                    map[i][j] = (char) (count + '0');
            }
        }
    }

    // count adjacent mines
    public static int countAdjacentMines(char[][] map, int row, int col) {
        int count = 0;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < SIZE && j >= 0 && j < SIZE) {
                    if (map[i][j] == 'm') count++;
                }
            }
        }
        return count;
    }

    // reveal a tile
    public static void revealTile(char[][] board, char[][] map, int row, int col) {
        if (board[row][col] != '#') return;
        board[row][col] = map[row][col];
    }

    // check win condition
    public static boolean checkWin(char[][] board, char[][] map) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] != 'm' && board[i][j] == '#')
                    return false;
            }
        }
        return true;
    }

    // print board
    public static void printBoard(char[][] board) {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) System.out.print(i + " ");
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < SIZE; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }

    // clear screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}