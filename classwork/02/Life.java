import java.io.*;
import java.util.*;
/*
   2D array
   set up
   change values in it
   a way of applying the GOL rules
 */

 class Life {

/*
   create a new 2D array, fill it with ' 't
   representing that the entire board is empty.
 */
  public static char[][] createNewBoard(int rows, int cols){
    char[][] board = new char[rows][cols];
    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < cols; c++) {
        board[r][c] = 'O';
      }
    }
    return board;
  }

  public static void printBoard(char[][] board){
    for (int r = 0; r < board.length; r++) {
      for (int c = 0; c < board[r].length; c++) {
        System.out.printf("%c",board[r][c]);
        }
      System.out.println();
    }
    System.out.println("\n\n------------------\n\n");
  }

  /*
     set the cell (r,c) to value
   */
  public static void setCell(char[][] board, int r, int c, char val){
    if (r>=0 && r<board.length && c>=0 && c<board[r].length) {
                board[r][c] = val;
    }
  }


  /*
     Count and return the number of living neigbords around board[r][c]
     approach 1 - lots of if statements
     approach 2 - you can loop over the grid from board[r-1][c-1]
                  to board[r+1][c+1]
   */
  public static int countNeighbours(char[][] board, int r, int c){
    return 0;
  }

/*
   given a board and a cell, determine, based on the rules for
   Conway's GOL if the cell is alive ('X') or dead (' ') in the
   next generation.

 */

 public static int numLiveNeighbors(char[][] board,int r, int c){
  // calculate the number of living neighbors around board[r][c]

  int sumLivingNeighbors = 0;
  int totalRows = board.length;
  int totalColumns = board[0].length;

  for (int row = r-1; r <= r+1; r++) {
    for (int col = c-1; r <= c+1; c++) {
      if (row >= 0 && col >= 0 && row < totalRows && col < totalColumns) {
        if (row != r && col != c) {
          if (board[row][col] == 'O'){
            sumLivingNeighbors++;
          }
        }
      }
    }
  }
  return sumLivingNeighbors;
  // determine if board[r][c] is living or dead
  //    if living and 2 3 neighbors then remain alive
  //    if dead and 3 neighbors then become alive
} // end numLiveNeighbors





/*
   scan the board to generate a NEW board with the
   next generation
 */
  public static char[][] generateNextBoard(char[][] board){
    char newBoard[][] = new char[10][10];
    // fill the new board
    return newBoard;
  }

  public static char[][] initializeBoard(char[][] board) {
    setCell(board, 0, 0, 'X');
    setCell(board, 1, 1, 'X');
    setCell(board, 2, 2, 'X');
    setCell(board, 3, 3, 'X');
    setCell(board, 4, 4, 'X');
    setCell(board, 5, 5, 'X');
    setCell(board, 6, 6, 'X');
    setCell(board, 7, 7, 'X');
    setCell(board, 8, 8, 'X');
    setCell(board, 9, 9, 'X');
    setCell(board, 9, 0, 'X');
    setCell(board, 8, 1, 'X');
    setCell(board, 7, 2, 'X');
    setCell(board, 6, 3, 'X');
    setCell(board, 5, 4, 'X');
    setCell(board, 4, 5, 'X');
    setCell(board, 3, 6, 'X');
    setCell(board, 2, 7, 'X');
    setCell(board, 1, 8, 'X');
    setCell(board, 0, 9, 'X');
    return board;
  }

  public static void main(String[] args) {
    char[][] board_old;
    board_old = createNewBoard(10,10);
    initializeBoard(board_old);
    System.out.println();
    System.out.println("Old Board");
    System.out.println();
    printBoard(board_old);
    char[][] board_new;
    board_new = createNewBoard(10,10);
    System.out.println();
    System.out.println("New Board");
    System.out.println();
    printBoard(board_new);

    System.out.println("numLiveNeighbors(board_old, 5, 4)");
    System.out.println(numLiveNeighbors(board_old, 5, 4));

  }
}
