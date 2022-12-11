package Q4;

public class Main {
    public static void main(String[] args) {
        int[][] gird = {
                {0, 0, 0}, {0, 1, 0}, {0, 0, 0}
        };
        System.out.println(solve(gird));
    }

    // time complexity: O(mn) m is the length of rows, n is the length  of cols;
    // space complexity: O(mn)
    public static int solve(int[][] obstacleGrid) {
        int r = obstacleGrid.length;
        int c = obstacleGrid[0].length;

        int[][] dp = new int[r][c];
        // init base case
        boolean isObstacle = false;
        for (int i = r - 1; i >= 0; i--) {
            if (obstacleGrid[i][c - 1] == 1) {
                isObstacle = true;
            }
            if (isObstacle) dp[i][c - 1] = 0;
            else dp[i][c - 1] = 1;
        }
        isObstacle = false;
        for (int j = c - 1; j >= 0; j--) {
            if (obstacleGrid[r - 1][j] == 1) {
                isObstacle = true;
            }
            if (isObstacle) dp[r - 1][j] = 0;
            else dp[r - 1][j] = 1;
        }
        for (int i = r - 2; i >= 0; i--) {
            for (int j = c - 2; j >= 0; j--) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i + 1][j] + dp[i][j + 1];
                }
            }
        }
        return dp[0][0];
    }
}
