package medium;

import java.util.HashSet;

// 36. Valid Sudoku
// Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

// Each row must contain the digits 1-9 without repetition.
// Each column must contain the digits 1-9 without repetition.
// Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
// Note:
// A Sudoku board (partially filled) could be valid but is not necessarily solvable.
// Only the filled cells need to be validated according to the mentioned rules.

// Input: board = 
// [['5','3','.','.','7','.','.','.','.']
// ,['6','.','.','1','9','5','.','.','.']
// ,['.','9','8','.','.','.','.','6','.']
// ,['8','.','.','.','6','.','.','.','3']
// ,['4','.','.','8','.','3','.','.','1']
// ,['7','.','.','.','2','.','.','.','6']
// ,['.','6','.','.','.','.','2','8','.']
// ,['.','.','.','4','1','9','.','.','5']
// ,['.','.','.','.','8','.','.','7','9']]
// Output: true

// Example 2:
// Input: board = 
// [['8','3','.','.','7','.','.','.','.']
// ,['6','.','.','1','9','5','.','.','.']
// ,['.','9','8','.','.','.','.','6','.']
// ,['8','.','.','.','6','.','.','.','3']
// ,['4','.','.','8','.','3','.','.','1']
// ,['7','.','.','.','2','.','.','.','6']
// ,['.','6','.','.','.','.','2','8','.']
// ,['.','.','.','4','1','9','.','.','5']
// ,['.','.','.','.','8','.','.','7','9']]
// Output: false
// Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.

public class isValidSudoku {
  public static void main(String[] args) {
    char[][] board = {
        { '8', '3', '.', '.', '7', '.', '.', '.', '.' }, { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
        { '.', '9', '8', '.', '.', '.', '.', '6', '.' }, { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
        { '4', '.', '.', '8', '.', '3', '.', '.', '1' }, { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
        { '.', '6', '.', '.', '.', '.', '2', '8', '.' }, { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
        { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
    };
    // char kdjf = '.';
    // int kj = kdjf - '0';
    // System.out.println(kj);
    System.out.println(optimal_solution(board));
  }

  static boolean optimal_solution(char[][] board) {
    int N = 9;
    // Use hash set to record the status
    // A Java HashSet is a class that implements the Set interface, a core part of
    // the Java Collections Framework. It provides a collection that stores only
    // unique elements and does not maintain any specific order for these elements.

    HashSet<Character>[] rows = new HashSet[N];
    HashSet<Character>[] cols = new HashSet[N];
    HashSet<Character>[] boxes = new HashSet[N];
    for (int i = 0; i < N; i++) {
      rows[i] = new HashSet<Character>();
      cols[i] = new HashSet<Character>();
      boxes[i] = new HashSet<Character>();
    }

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        char val = board[i][j];
        if (val == '.') {
          continue;
        }
        // rows
        if (rows[i].contains(val)) {
          return false;
        }
        rows[i].add(val);

        // cols
        if (cols[j].contains(val)) {
          return false;
        }
        cols[j].add(val);

        // boxes
        int idx = (i / 3) * 3 + j / 3;
        if (boxes[idx].contains(val)) {
          return false;
        }
        boxes[idx].add(val);
      }
    }
    return true;
  }

  // static boolean brute_force(char[][] board) {
  // for (int i = 0; i < 9; i++) {
  // HashSet<String> duplicate = new HashSet<>();
  // for (int j = 0; j < 9; j++) {
  // if (board[i][j] == '.') {
  // continue;
  // }

  // }
  // }
  // // failed to execute
  // }
}
