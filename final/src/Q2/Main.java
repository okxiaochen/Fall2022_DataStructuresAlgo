package Q2;

import javafx.util.Pair;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        char[][] matrix = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        System.out.println("Number of Islands = " + findNumIslands(matrix));
    }

    // time complexity: O(mn)  m is the length of rows, n is the length  of cols;
    // space complexity: O(mn)
    public static int findNumIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    visitedNeighbor(grid, i, j);
                }
            }
        }
        return count;
    }

    public static void visitedNeighbor(char[][] matrix, int i, int j) {
        int r = matrix.length;
        int c = matrix[0].length;

        if (i >= 0 && i < r && j >= 0 && j < c && matrix[i][j] == '1') {
            matrix[i][j] = '0';
            visitedNeighbor(matrix, i + 1, j);
            visitedNeighbor(matrix, i, j + 1);
            visitedNeighbor(matrix, i - 1, j);
            visitedNeighbor(matrix, i, j - 1);
        }
    }
}
